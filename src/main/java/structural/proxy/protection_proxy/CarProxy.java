package structural.proxy.protection_proxy;

public class CarProxy extends Car {
	public CarProxy(Driver driver) {
		super(driver);
	}

	@Override
	public void drive() {
		if (driver.age >= 16) {
			super.drive();
		} else {
			System.out.println("Driver too young");
		}
	}
}
