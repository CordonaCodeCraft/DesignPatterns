package structural.bridge;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class DemoWithFrameworkDI {

	public static void main(String[] args) {
		final Injector injector = Guice.createInjector(new ShapeModule());
		final Circle instance = injector.getInstance(Circle.class);

		instance.radius = 3;
		instance.draw();
		instance.resize(2);
		instance.draw();
	}
}
