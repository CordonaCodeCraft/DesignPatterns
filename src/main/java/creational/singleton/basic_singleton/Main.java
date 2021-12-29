package creational.singleton.basic_singleton;


/*	The two instances are actually pointing at the same address in the memory.
 	They are the same object.
 	The new value will affect the two instances of the singleton object
 */
public class Main {

	public static void main(String[] args) {
		final BasicSingleton basicSingleton = BasicSingleton.getInstance();
		final BasicSingleton secondBasicSingleton = BasicSingleton.getInstance();

		secondBasicSingleton.setValue(200);
	}
}
