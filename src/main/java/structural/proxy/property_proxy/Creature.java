package structural.proxy.property_proxy;

public class Creature {
	private final Property<Integer> agility;

	public Creature(final int value) {
		agility = new Property<>(value);
	}

	public void setAgility(final int value) {
		agility.setValue(value);
	}

	public int getAgility() {
		return agility.getValue();
	}
}
