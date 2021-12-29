package behavioral.observer.observable_and_observer;

public class Main implements Observer<Person> {
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		final Person person = new Person();
		person.subscribe(this);
		for (int i = 20; i < 24; i++) {
			person.setAge(i);
		}
	}

	@Override
	public void handle(final PropertyChangedEventArgs<Person> args) {
		System.out.printf("Person's %s has changed to %s%n", args.propertyName, args.newValue);
	}
}
