package creational.builder.fluent_builder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
	public String name;
	public String text;
	private final ArrayList<HtmlElement> elements = new ArrayList<>();
	private final int indentSize = 2;
	private final String newLine = System.lineSeparator();

	public HtmlElement() {
	}

	public HtmlElement(final String name, final String text) {
		this.name = name;
		this.text = text;
	}

	public String toStringImpl(final int indent) {
		final StringBuilder stringBuilder = new StringBuilder();
		final String i = String.join("", Collections.nCopies(indent * indentSize, " "));

		stringBuilder.append(String.format("%s<%s>%s", i, name, newLine));

		if (text != null && !text.isEmpty()) {
			stringBuilder
					.append(String.join("", Collections.nCopies(indentSize * (indent + 1), " ")))
					.append(text)
					.append(newLine);
		}

		for (HtmlElement element : elements) {
			stringBuilder.append(element.toStringImpl(indent + 1));
		}

		stringBuilder.append(String.format("%s</%s>%s", i, name, newLine));
		return stringBuilder.toString();
	}

	@Override
	public String toString() {
		return toStringImpl(0);
	}

	public static class HtmlBuilder {
		private final String rootName;
		private HtmlElement root = new HtmlElement();

		public HtmlBuilder(final String rootName) {
			this.rootName = rootName;
			root.name = rootName;
		}

		public HtmlBuilder addChild(final String childName, final String childText) {
			final HtmlElement child = new HtmlElement(childName, childText);
			root.elements.add(child);
			return this;
		}

		public void clear() {
			root = new HtmlElement();
			root.name = rootName;
		}

		@Override
		public String toString() {
			return root.toString();
		}
	}
}
