package specification_pattern;

public class Product {
	private String name;
	private Color color;
	private Size size;

	public Product(final String name, final Color color, final Size size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public Size getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public enum Color {
		RED, GREEN, BLUE
	}

	public enum Size {
		SMALL, MEDIUM, LARGE, HUGE
	}

}




