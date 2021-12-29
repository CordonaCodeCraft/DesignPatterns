package structural.decorator.static_decorator;

import structural.decorator.dynamic_decorator.Shape;

import java.util.function.Supplier;

public class StaticColoredShape<T extends Shape> implements Shape {
	private Shape shape;
	private String color;

	public StaticColoredShape(final Supplier<? extends T> constructor, String color) {
		shape = constructor.get();
		this.color = color;
	}

	@Override
	public String info() {
		return String.format("%s has the color %s", shape.info(), color);
	}
}
