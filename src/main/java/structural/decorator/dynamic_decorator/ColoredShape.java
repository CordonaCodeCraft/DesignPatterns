package structural.decorator.dynamic_decorator;

public class ColoredShape implements Shape {
	private Shape shape;
	public String color;

	public ColoredShape(final Shape shape, final String color) {
		this.shape = shape;
		this.color = color;
	}

	@Override
	public String info() {
		return String.format("%s has the color %s", shape.info(), color);
	}
}
