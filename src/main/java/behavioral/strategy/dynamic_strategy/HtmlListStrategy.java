package behavioral.strategy.dynamic_strategy;

public class HtmlListStrategy implements ListStrategy {

	@Override
	public void start(final StringBuilder sb) {
		sb
				.append("<ul>")
				.append(System.lineSeparator());
	}

	@Override
	public void addListItem(final StringBuilder sb, final String item) {
		sb
				.append("  <li>")
				.append(item)
				.append(System.lineSeparator());

	}

	@Override
	public void end(final StringBuilder sb) {
		sb
				.append("</ul>")
				.append(System.lineSeparator());
	}
}
