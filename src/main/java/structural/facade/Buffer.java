package structural.facade;

public class Buffer {
	private final char[] characters;
	private final int lingWidth;

	public Buffer(final int lingHeight, final int lineWidth) {
		this.lingWidth = lineWidth;
		characters = new char[lineWidth * lingHeight];
	}

	public char charAt(final int x, final int y) {
		return characters[y * lingWidth + x];
	}
}
