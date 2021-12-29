package structural.decorator.dynamic_decorator;

public class Main {
	public static void main(String[] args) {
		final Circle circle = new Circle(10);
		System.out.println(circle.info());

		final ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
		System.out.println(blueSquare.info());

		final TransparentShape coloredAndTransparentCircle =
				new TransparentShape(
						new ColoredShape(
								new Circle(10), "pink"
						), 3
				);
		System.out.println(coloredAndTransparentCircle.info());
	}
}
