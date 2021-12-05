package creational.factory.factory_method;

public class Main {

	public static void main(String[] args) {
		Point cartesianPoint = Point.newCartesianPoint(10.2, 12.2);
		Point polarPoint = Point.newPolarPoint(2.5, 8.5);
	}
}
