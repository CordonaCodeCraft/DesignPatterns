package structural.bridge;

public class DemoWithManualDI {
	public static void main(String[] args) {
		final RasterRenderer rasterRenderer = new RasterRenderer();
		final VectorRenderer vectorRenderer = new VectorRenderer();
		final Circle circle = new Circle(vectorRenderer, 5);

		circle.draw();
		circle.resize(2);
		circle.draw();

	}
}
