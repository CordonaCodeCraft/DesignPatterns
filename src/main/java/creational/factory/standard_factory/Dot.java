package creational.factory.standard_factory;

public class Dot {

	private final double x;
	private final double y;

	private Dot(final double x, final double y) {
		this.x = x;
		this.y = y;
	}

	public static class Factory {
		public static Dot newCartesianPoint(final double x, final double y) {
			return new Dot(x, y);
		}

		public static Dot newPolarPoint(final double rho, final double theta) {
			return new Dot(rho * Math.cos(theta), rho * Math.sin(theta));
		}
	}

}
