package behavioral.chain_of_responsibility.method_chain;

public class NoBonusesModifier extends CreatureModifier {

	public NoBonusesModifier(final Creature creature) {
		super(creature);
	}

	@Override
	public void handle() {
		System.out.println("No bonuses for you");
	}
}
