package behavioral.observer.event_class;

public class Main {

	public static void main(String[] args) {
		final Person person = new Person();
		final Subscription subscription =
				person.propertyChanged.addHandler(x -> System.out.printf("Person's %s has changed%n", x.propertyName));

		person.setAge(17);
		person.setAge(18);

		subscription.close();
		person.setAge(19);

	}
}
