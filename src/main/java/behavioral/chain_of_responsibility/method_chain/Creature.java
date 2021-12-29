package behavioral.chain_of_responsibility.method_chain;

public class Creature {
	public String name;
	public int attack;
	public int defence;

	public Creature(final String name, final int attack, final int defence) {
		this.name = name;
		this.attack = attack;
		this.defence = defence;
	}

	@Override
	public String toString() {
		return "Creature{" +
				"name='" + name + '\'' +
				", attack=" + attack +
				", defence=" + defence +
				'}';
	}
}
