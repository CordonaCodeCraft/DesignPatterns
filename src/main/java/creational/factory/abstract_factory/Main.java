package creational.factory.abstract_factory;

public class Main {
	public static void main(String[] args) throws Exception {
		final HotDrinkMachine machine = new HotDrinkMachine();
		final HotDrink drink = machine.makeDrink();
		drink.consume();

	}
}
