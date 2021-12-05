package creational.factory.abstract_factory;

public class TeaFactory implements HotDrinkFactory {
	@Override
	public HotDrink prepare(int amount) {
		System.out.printf("Prepare %d cups of tea%n", amount);
		return new Tea();
	}
}
