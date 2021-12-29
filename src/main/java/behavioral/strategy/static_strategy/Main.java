package behavioral.strategy.static_strategy;

import behavioral.strategy.dynamic_strategy.HtmlListStrategy;
import behavioral.strategy.dynamic_strategy.MarkDownListStrategy;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		final TextProcessor<MarkDownListStrategy> tp1 = new TextProcessor<>(MarkDownListStrategy::new);
		tp1.append(List.of("alpha", "beta", "gamma"));
		System.out.println(tp1);

		final TextProcessor<HtmlListStrategy> tp2 = new TextProcessor<>(HtmlListStrategy::new);
		tp2.append(List.of("alpha", "beta", "gamma"));
		System.out.println(tp2);
	}
}

