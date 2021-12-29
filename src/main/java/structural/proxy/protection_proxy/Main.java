package structural.proxy.protection_proxy;

public class Main {

	public static void main(String[] args) {
		final Driver driver = new Driver(12);
		final Car car = new CarProxy(driver);
		car.drive();
	}
}
