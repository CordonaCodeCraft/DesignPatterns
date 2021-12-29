package structural.composite.neural_network;

public class Main {
	public static void main(String[] args) {
		final Neuron alpha = new Neuron();
		final Neuron beta = new Neuron();
		final NeuronLayer firstLayer = new NeuronLayer();
		final NeuronLayer secondLayer = new NeuronLayer();

		alpha.connectTo(beta);
		alpha.connectTo(firstLayer);
		firstLayer.connectTo(alpha);
		firstLayer.connectTo(secondLayer);


	}
}
