package creational.singleton.inner_static_singleton;

/*	Explanation;
	This approach solves all the issues with the singleton creation - the reflection, serialization and most importantly
	the multithreading issues.
*/
public class InnerStaticSingleton {

	private InnerStaticSingleton() {
	}

	private static class Impl {
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}

	public InnerStaticSingleton getInstance() {
		return Impl.INSTANCE;
	}
}
