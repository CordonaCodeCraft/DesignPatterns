package structural.composite.neural_network;

public interface Neurons extends Iterable<Neuron> {
	default void connectTo(final Neurons other) {
		if (this == other) return;

		for (Neuron from : this) {
			for (Neuron to : other) {
				from.out.add(to);
				to.in.add(from);
			}
		}
	}
}
