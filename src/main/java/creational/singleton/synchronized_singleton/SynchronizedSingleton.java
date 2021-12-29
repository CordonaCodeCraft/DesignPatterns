package creational.singleton.synchronized_singleton;

public class SynchronizedSingleton {
	private static volatile SynchronizedSingleton instance;

	private SynchronizedSingleton() {
		System.out.println("Initializing synchronized singleton");
	}

	/*  The bellow implementation is called double-checked locking.
		It is being used to protect the singleton behaviour in multithreaded environment.
		If many threads are accessing the getInstance() method we can end up with several threads creating an instance
		of the singleton object.
		Therefore - we should synchronize the critical section of the getInstance() method.

		WARNING:
		This implementation is considered outdated and deprecated.
	*/
	public SynchronizedSingleton getInstance() {
		if (instance == null) {
			synchronized (this) {
				if (instance == null) {
					return new SynchronizedSingleton();
				}
			}
		}
		return instance;
	}
}
