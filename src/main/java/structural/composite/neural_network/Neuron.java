package structural.composite.neural_network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Neuron implements Neurons {
	public ArrayList<Neuron> in = new ArrayList<>();
	public ArrayList<Neuron> out = new ArrayList<>();

	@Override
	public Iterator<Neuron> iterator() {
		return Collections.singleton(this).iterator();
	}

	@Override
	public Spliterator<Neuron> spliterator() {
		return Collections.singleton(this).spliterator();
	}

	@Override
	public void forEach(Consumer<? super Neuron> action) {
		action.accept(this);
	}
}
