package structural.decorator.dynamic_decorator;

public class Circle implements Shape {
	private float radius;

	public Circle(final float radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public void resize(final float factor) {
		radius *= factor;
	}

	@Override
	public String info() {
		return String.format("A circle of radius %f", radius);
	}
}
