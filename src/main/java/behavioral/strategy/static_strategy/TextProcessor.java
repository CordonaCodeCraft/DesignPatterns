package behavioral.strategy.static_strategy;

import behavioral.strategy.dynamic_strategy.ListStrategy;

import java.util.List;
import java.util.function.Supplier;

public class TextProcessor<LS extends ListStrategy> {
	private final StringBuilder sb = new StringBuilder();
	private LS listStrategy;

	public TextProcessor(final Supplier<? extends LS> ctor) {
		listStrategy = ctor.get();
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
