package creational.prototype.copy_with_serialization;

import org.apache.commons.lang3.SerializationUtils;

public class Main {

	public static void main(String[] args) {
		final Student source = new Student("John", 23);
		final Student target = SerializationUtils.roundtrip(source);

		target.age = 28;
	}
}
