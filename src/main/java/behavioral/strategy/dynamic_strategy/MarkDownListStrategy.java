package behavioral.strategy.dynamic_strategy;

public class MarkDownListStrategy implements ListStrategy {

	@Override
	public void addListItem(final StringBuilder sb, final String item) {
		sb
				.append(" * ")
				.append(item)
				.append(System.lineSeparator());
	}
}
