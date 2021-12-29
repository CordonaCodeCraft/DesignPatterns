package creational.singleton.lazy_singleton;

public class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
		System.out.println("Initializing lazy singleton");
	}

	public LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
