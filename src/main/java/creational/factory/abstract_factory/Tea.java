package creational.factory.abstract_factory;

public class Tea implements HotDrink {
	@Override
	public void consume() {
		System.out.println("This tea is delicious");
	}
}
