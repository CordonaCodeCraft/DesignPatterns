package behavioral.chain_of_responsibility.method_chain;

public class Main {

	public static void main(String[] args) {
		final Creature goblin = new Creature("Goblin", 2, 2);
		System.out.println(goblin);

		final CreatureModifier root = new CreatureModifier(goblin);
		root.add(new NoBonusesModifier(goblin));
		System.out.println("Let's double goblin's attack...");
		root.add(new DoubleAttackModifier(goblin));
		System.out.println("Let's increase goblin's defence...");
		root.add(new IncreaseDefenceModifier(goblin));
		root.handle();

		System.out.println(goblin);
	}
}
