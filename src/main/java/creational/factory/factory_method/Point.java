package creational.factory.factory_method;

/*	Explanation:
	Due to the fact, that we can not overload constructors in Java - we might find ourselves implementing a constructor
	with business logic like in the example bellow.
	This is not right and the bellow implementation of a factory method comes handy in such scenarios.

	private Point(final double a, final double b, CoordinateSystem cs) {
		switch (cs) {
			case POLAR:
				this.x = a;
				this.y = b;
				break;
			case CARTESIAN:
				this.x = a * Math.cos(b);
				this.y = a * Math.sin(b);
		}
	}
}
enum CoordinateSystem {
	CARTESIAN,
	POLAR
}
*/

public class Point {
	private final double x;
	private final double y;

	private Point(final double x, final double y) {
		this.x = x;
		this.y = y;
	}

	public static Point newCartesianPoint(final double x, final double y) {
		return new Point(x, y);
	}

	public static Point newPolarPoint(final double rho, final double theta) {
		return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
	}

}

