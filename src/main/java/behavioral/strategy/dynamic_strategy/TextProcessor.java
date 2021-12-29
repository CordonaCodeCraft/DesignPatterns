package behavioral.strategy.dynamic_strategy;

import java.util.List;

public class TextProcessor {
	private final StringBuilder sb = new StringBuilder();
	private ListStrategy listStrategy;

	public TextProcessor(final OutputFormat format) {
		setOutputFormat(format);
	}

	public void setOutputFormat(final OutputFormat format) {
		switch (format) {
			case MARKDOWN:
				listStrategy = new MarkDownListStrategy();
				break;
			case HTML:
				listStrategy = new HtmlListStrategy();
				break;
		}
	}

	public void append(final List<String> items) {
		listStrategy.start(sb);
		for (String item : items) {
			listStrategy.addListItem(sb, item);
		}
		listStrategy.end(sb);
	}

	public void clear() {
		sb.setLength(0);
	}

	@Override
	public String toString() {
		return sb.toString();
	}
}
