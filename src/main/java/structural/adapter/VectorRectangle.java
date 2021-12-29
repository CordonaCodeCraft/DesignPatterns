package structural.adapter;

public class VectorRectangle extends VectorObject {

	public VectorRectangle(final int x,
						   final int y,
						   final int width,
						   final int height) {
		add(new Line(new Point(x, y), new Point(x + width, y)));
		add(new Line(new Point(x + width, y), new Point(x + width, y + height)));
		add(new Line(new Point(x, y), new Point(x, y + height)));
		add(new Line(new Point(x, y + height), new Point(x + width, y + height)));
	}

}
