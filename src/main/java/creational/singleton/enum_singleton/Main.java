package creational.singleton.enum_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*  The enum singleton is initialized and the value is set to 111.
	After that the object is being serialized and deserialized.
	The value is again 111.
	After that the initialization and the serialization are being commented out and the value after deserialization
	is 42, which is unexpected, because the already created file is with the value ov 111.
	This is happening because enum singletons do not preserve state.
*/
public class Main {

	public static void main(String[] args) throws Exception {
		final String fileName = "myFile.bin";
		EnumSingleton singleton = EnumSingleton.INSTANCE;
//		singleton.setValue(111);
//		saveToFile(singleton,fileName);

		EnumSingleton deserialized = readFromFile(fileName);

		System.out.println(deserialized.getValue());
	}

	static void saveToFile(final EnumSingleton singleton, final String fileName) throws Exception {
		try (final FileOutputStream fileOut = new FileOutputStream(fileName);
			 final ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(singleton);
		}
	}

	static EnumSingleton readFromFile(final String fileName) throws Exception {
		try (final FileInputStream fileIn = new FileInputStream(fileName);
			 final ObjectInputStream in = new ObjectInputStream(fileIn)) {
			return (EnumSingleton) in.readObject();
		}
	}
}
