package behavioral.chain_of_responsibility.broker_chain;

public class CreatureModifier {
	protected Game game;
	protected Creature creature;

	public CreatureModifier(final Game game, final Creature creature) {
		this.game = game;
		this.creature = creature;
	}
}
