package creational.singleton.singleton_issues.serialization;


/*	Explanation:
	The basic singleton might work, but can be singleton contract can be defeated:
		1)  With reflection the private constructor can be made public;
		2)  With serialization - the JVM will serialize the singleton object and will make a copy out of it.
			After the deserialization the new object is a new object with new a reference.
*/

import creational.singleton.basic_singleton.BasicSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		BasicSingleton singleton1 = BasicSingleton.getInstance();
		singleton1.setValue(111);
		String fileName = "singleton.bin";

		saveToFile(singleton1, fileName);
		singleton1.setValue(222);

		BasicSingleton singleton2 = readFromFile(fileName);

		System.out.println(singleton1 == singleton2);
		System.out.println(singleton1.getValue());
		System.out.println(singleton2.getValue());
	}

	static void saveToFile(final BasicSingleton singleton, final String fileName) throws Exception {
		try (final FileOutputStream fileOut = new FileOutputStream(fileName);
			 final ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(singleton);
		}
	}

	static BasicSingleton readFromFile(String fileName) throws Exception {
		try (final FileInputStream fileIn = new FileInputStream(fileName);
			 final ObjectInputStream in = new ObjectInputStream(fileIn)) {
			return (BasicSingleton) in.readObject();
		}
	}
}
