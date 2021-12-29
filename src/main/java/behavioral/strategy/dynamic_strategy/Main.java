package behavioral.strategy.dynamic_strategy;

import java.util.List;

import static behavioral.strategy.dynamic_strategy.OutputFormat.*;

public class Main {
	public static void main(String[] args) {
		final TextProcessor textProcessor = new TextProcessor(MARKDOWN);
		textProcessor.append(List.of("liberte", "egalite", "fraternite"));
		System.out.println(textProcessor);
		textProcessor.clear();
		textProcessor.setOutputFormat(HTML);
		textProcessor.append(List.of("inheritance", "encapsulation", "polymorphism"));
		System.out.println(textProcessor);
	}
}
