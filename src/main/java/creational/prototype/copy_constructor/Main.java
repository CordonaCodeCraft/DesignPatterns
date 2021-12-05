package creational.prototype.copy_constructor;

public class Main {

	public static void main(String[] args) {
		final Address address = new Address("Oxford Street", "London", "UK");
		final Employee john = new Employee("John Thompson", address);
		final Employee chris = new Employee(john);

		chris.name = "Chris Richardson";

		System.out.println(john);
		System.out.println(chris);
	}
}


