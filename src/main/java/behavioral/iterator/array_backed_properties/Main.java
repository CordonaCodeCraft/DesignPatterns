package behavioral.iterator.array_backed_properties;

public class Main {
	public static void main(String[] args) {
		final Creature creature = new Creature();
		creature.setAgility(12);
		creature.setIntelligence(13);
		creature.setStrength(17);
		System.out.printf("Creature has a max stats of %d and total stats of %d and average stats of %f",
				creature.max(), creature.sum(), creature.average());
	}
}
