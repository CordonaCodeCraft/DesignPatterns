package creational.singleton.multiton;

import java.util.HashMap;

public class Printer {
	private static HashMap<Subsystem, Printer> instances = new HashMap<>();
	private static int instanceCount = 0;

	private Printer() {
		instanceCount++;
		System.out.printf("A total of %d instances created so far%n", instanceCount);
	}

	public static Printer get(final Subsystem subsystem) {
		if (instances.containsKey(subsystem)) {
			return instances.get(subsystem);
		}

		final Printer instance = new Printer();
		instances.put(subsystem, instance);
		return instance;
	}

}
