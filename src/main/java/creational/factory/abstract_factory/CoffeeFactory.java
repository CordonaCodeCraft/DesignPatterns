package creational.factory.abstract_factory;

public class CoffeeFactory implements HotDrinkFactory {
	@Override
	public HotDrink prepare(int amount) {
		System.out.printf("Prepare %d cups of coffee", amount);
		return new Coffee();
	}
}
