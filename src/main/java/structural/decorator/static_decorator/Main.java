package structural.decorator.static_decorator;

import structural.decorator.dynamic_decorator.Circle;
import structural.decorator.dynamic_decorator.Shape;
import structural.decorator.dynamic_decorator.Square;

public class Main {
	public static void main(String[] args) {
		final StaticColoredShape<Shape> blueSquare = new StaticColoredShape<>(
				() -> new Square(20), "blue"
		);
		System.out.println(blueSquare.info());

		final StaticTransparentShape<StaticColoredShape<Circle>> transparentColoredCircle =
				new StaticTransparentShape<>(
						() -> new StaticColoredShape<>(
								() -> new Circle(5), "green"
						), 50
				);
		System.out.println(transparentColoredCircle.info());
	}

}
