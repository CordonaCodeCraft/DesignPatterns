package structural.proxy.property_proxy;

public class Main {
	public static void main(String[] args) {
		final Creature creature = new Creature(10);
		creature.setAgility(15);
		System.out.println(creature.getAgility());
	}
}
