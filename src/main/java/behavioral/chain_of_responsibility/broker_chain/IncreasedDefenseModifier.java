package behavioral.chain_of_responsibility.broker_chain;

import static behavioral.chain_of_responsibility.broker_chain.Query.Argument.DEFENCE;

public class IncreasedDefenseModifier extends CreatureModifier implements AutoCloseable {
	final int token;


	public IncreasedDefenseModifier(final Game game, final Creature creature) {
		super(game, creature);
		token = game.queries.subscribe((q) -> {
					if (q.creatureName.equals(creature.name) && q.argument == DEFENCE) {
						q.result += 3;
					}
				}
		);
	}

	@Override
	public void close() {
		game.queries.unsubscribe(token);
	}
}
