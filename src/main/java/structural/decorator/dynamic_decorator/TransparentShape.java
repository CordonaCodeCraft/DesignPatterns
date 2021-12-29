package structural.decorator.dynamic_decorator;

public class TransparentShape implements Shape {
	private Shape shape;
	public int transparency;

	public TransparentShape(final Shape shape, final int transparency) {
		this.shape = shape;
		this.transparency = transparency;
	}

	@Override
	public String info() {
		return String.format("%s has %d percent transparency", shape.info(), transparency);
	}
}
