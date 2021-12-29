package behavioral.chain_of_responsibility.broker_chain;

public class Main {
	public static void main(String[] args) {
		final Game game = new Game();
		final Creature goblin = new Creature(game, "Strong Goblin", 2, 2);

		System.out.println(goblin);

		final IncreasedDefenseModifier idm = new IncreasedDefenseModifier(game, goblin);
		final DoubleAttackModifier dam = new DoubleAttackModifier(game, goblin);
		try (dam) {
			System.out.println(goblin);
		}

		System.out.println(goblin);
	}
}
