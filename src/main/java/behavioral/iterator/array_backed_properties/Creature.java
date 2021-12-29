package behavioral.iterator.array_backed_properties;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Creature implements Iterable<Integer> {
	private final int[] stats = new int[3];
	private final int strength = 0;
	private final int agility = 1;
	private final int intelligence = 2;

	public int getStrength() {
		return stats[strength];
	}

	public void setStrength(final int value) {
		stats[strength] = value;
	}

	public int getAgility() {
		return stats[agility];
	}

	public void setAgility(final int value) {
		stats[agility] = value;
	}

	public int getIntelligence() {
		return stats[intelligence];
	}

	public void setIntelligence(final int value) {
		stats[intelligence] = value;
	}

	public int sum() {
		return IntStream.of(stats).sum();
	}

	public int max() {
		return IntStream.of(stats).max().orElse(0);
	}

	public double average() {
		return IntStream.of(stats).average().orElse(0);
	}

	@Override
	public Iterator<Integer> iterator() {
		return IntStream.of(stats).iterator();
	}

	@Override
	public void forEach(final Consumer<? super Integer> action) {
		for (int x : stats) {
			action.accept(x);
		}
	}

	@Override
	public Spliterator<Integer> spliterator() {
		return IntStream.of(stats).spliterator();
	}
}
