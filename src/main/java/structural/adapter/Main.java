package structural.adapter;

import java.util.List;

public class Main {
	private final static List<VectorObject> vectorObjects =
			List.of(new VectorRectangle(1, 1, 10, 10),
					new VectorRectangle(3, 3, 6, 6));

	public static void main(String[] args) {
		draw();
		draw();
	}

	public static void drawPoint(Point p) {
		System.out.println(".");
	}

	public static void draw() {
		for (VectorObject vectorObject : vectorObjects) {
			for (Line line : vectorObject) {
				final LineToPointAdapterWithCache adapter = new LineToPointAdapterWithCache(line);
				adapter.forEach(Main::drawPoint);
			}
		}
	}
}
