package behavioral.chain_of_responsibility.method_chain;

public class IncreaseDefenceModifier extends CreatureModifier {

	public IncreaseDefenceModifier(final Creature creature) {
		super(creature);
	}

	@Override
	public void handle() {
		System.out.printf("Increasing %s's defence%n", creature.name);
		creature.defence += 3;
		super.handle();
	}
}
