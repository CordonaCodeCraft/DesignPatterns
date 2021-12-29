package structural.flyweight.example_with_users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class UserWithBuffer {
	static List<String> strings = new ArrayList<>();
	private int[] names;

	public UserWithBuffer(final String fullName) {
		names = Arrays
				.stream(fullName.split(" "))
				.mapToInt(getOrAdd)
				.toArray();
	}

	ToIntFunction<String> getOrAdd = (String s) -> {
		int index = strings.indexOf(s);
		if (index != -1) {
			return index;
		} else {
			strings.add(s);
			return strings.size() - 1;
		}
	};
}


