package behavioral.chain_of_responsibility.method_chain;

public class CreatureModifier {
	protected Creature creature;
	protected CreatureModifier next;

	public CreatureModifier(final Creature creature) {
		this.creature = creature;
	}

	public void add(CreatureModifier cm) {
		if (next != null) {
			next.add(cm);
		} else {
			next = cm;
		}
	}

	public void handle() {
		if (next != null) {
			next.handle();
		}
	}
}
