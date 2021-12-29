package structural.bridge;

public abstract class Shape {
	protected final Renderer renderer;

	public Shape(final Renderer renderer) {
		this.renderer = renderer;
	}

	public abstract void draw();

	public abstract void resize(final float factor);
}
