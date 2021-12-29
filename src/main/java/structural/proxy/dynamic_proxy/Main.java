package structural.proxy.dynamic_proxy;


import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		final Person person = new Person();
		final Human logged = withLogging(person, Human.class);

		logged.talk();
		logged.walk();
		logged.walk();

		System.out.println(logged);
	}

	@SuppressWarnings("unchecked")
	public static <T> T withLogging(T target, Class<T> itf) {
		return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class<?>[]{itf}, new LoggingHandler(target));
	}
}
