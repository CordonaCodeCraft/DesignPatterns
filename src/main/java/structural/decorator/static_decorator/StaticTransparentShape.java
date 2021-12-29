package structural.decorator.static_decorator;

import structural.decorator.dynamic_decorator.Shape;

import java.util.function.Supplier;

public class StaticTransparentShape<T extends Shape> implements Shape {
	private Shape shape;
	private int transparency;

	public StaticTransparentShape(final Supplier<? extends T> constructor, final int transparency) {
		shape = constructor.get();
		this.transparency = transparency;
	}

	@Override
	public String info() {
		return String.format("%s has a transparency of %d percent", shape.info(), transparency);

	}
}
