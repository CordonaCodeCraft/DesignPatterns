package creational.factory.abstract_factory;

import org.javatuples.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {
	private final List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

	public HotDrinkMachine() throws Exception {
		final Set<Class<? extends HotDrinkFactory>> types =
				new Reflections("creational.factory.abstract_factory").getSubTypesOf(HotDrinkFactory.class);

		for (Class<? extends HotDrinkFactory> type : types) {
			final String factoryName = type.getSimpleName().replace("Factory", "");
			final HotDrinkFactory instance = type.getDeclaredConstructor().newInstance();
			namedFactories.add(new Pair<>(factoryName, instance));
		}
	}

	public HotDrink makeDrink() throws Exception {
		System.out.println("Available drinks");

		for (int index = 0; index < namedFactories.size(); ++index) {
			final Pair<String, HotDrinkFactory> item = namedFactories.get(index);
			System.out.println("" + index + ": " + item.getValue0());
		}

		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String s;
			int i, amount;
			if ((s = reader.readLine()) != null
					&& (i = Integer.parseInt(s)) >= 0
					&& i < namedFactories.size()) {
				System.out.println("Specify amount: ");
				s = reader.readLine();
				if (s != null && (amount = Integer.parseInt(s)) > 0) {
					return namedFactories.get(i).getValue1().prepare(amount);
				}
			}
			System.out.println("Incorrect input, try again.");
		}
	}
}
