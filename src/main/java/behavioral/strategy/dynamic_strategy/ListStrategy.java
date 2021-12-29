package behavioral.strategy.dynamic_strategy;

public interface ListStrategy {
	default void start(final StringBuilder sb) {
	}

	void addListItem(final StringBuilder sb, final String item);

	default void end(final StringBuilder sb) {
	}
}
