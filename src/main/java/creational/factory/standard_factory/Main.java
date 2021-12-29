package creational.factory.standard_factory;

public class Main {
	final Dot cartesianDot = Dot.Factory.newCartesianPoint(5, 6);
	final Dot polarDot = Dot.Factory.newPolarPoint(2, 8);
}
