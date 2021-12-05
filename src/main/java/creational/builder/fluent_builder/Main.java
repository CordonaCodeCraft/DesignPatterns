package creational.builder.fluent_builder;

public class Main {

	public static void main(String[] args) {
		final HtmlElement.HtmlBuilder builder = new HtmlElement.HtmlBuilder("ul");
		builder
				.addChild("li", "hello")
				.addChild("li", "world");
		System.out.println(builder);
	}
}
