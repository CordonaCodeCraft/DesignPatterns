package behavioral.chain_of_responsibility.method_chain;

public class DoubleAttackModifier extends CreatureModifier {

	public DoubleAttackModifier(final Creature creature) {
		super(creature);
	}

	@Override
	public void handle() {
		System.out.printf("Doubling %s's attack%n", creature.name);
		creature.attack *= 2;
		super.handle();
	}
}
