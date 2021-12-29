package structural.decorator.dynamic_decorator;

public class Square implements Shape {
	private float side;

	public Square() {
	}

	public Square(final float side) {
		this.side = side;
	}

	@Override
	public String info() {
		return String.format("A square with side %f", side);
	}
}
