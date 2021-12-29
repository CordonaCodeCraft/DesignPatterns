package behavioral.chain_of_responsibility.broker_chain;

import static behavioral.chain_of_responsibility.broker_chain.Query.Argument.ATTACK;

public class DoubleAttackModifier extends CreatureModifier implements AutoCloseable {
	private final int token;

	public DoubleAttackModifier(final Game game, final Creature creature) {
		super(game, creature);
		token = game.queries.subscribe((q) -> {
					if (q.creatureName.equals(creature.name) && q.argument == ATTACK) {
						q.result *= 2;
					}
				}
		);
	}

	@Override
	public void close() {
		game.queries.unsubscribe(token);
	}
}
