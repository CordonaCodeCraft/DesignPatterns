package behavioral.iterator.array_backed_properties;

public class SimpleCreature {
	private int strength;
	private int agility;
	private int intelligence;

	public SimpleCreature(final int strength, final int agility, final int intelligence) {
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(final int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(final int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(final int intelligence) {
		this.intelligence = intelligence;
	}
}
