package structural.facade;

public class ViewPort {
	private final Buffer buffer;
	private final int width;
	private final int height;
	private final int offsetX;
	private final int offsetY;

	public ViewPort(final Buffer buffer,
					final int width,
					final int height,
					final int offsetX,
					final int offsetY) {
		this.buffer = buffer;
		this.width = width;
		this.height = height;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}

	public char charAt(final int x, final int y) {
		return buffer.charAt(x + offsetX, y + offsetY);
	}
}
