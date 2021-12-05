package creational.builder.fluent_builder_with_inheritance;

public class Person {
	public String name;
	public String position;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", position='" + position + '\'' +
				'}';
	}
}

class PersonBuilder<SELF extends PersonBuilder<SELF>> {
	final Person person = new Person();

	public SELF withName(final String name) {
		person.name = name;
		return self();
	}

	public Person build() {
		return person;
	}

	protected SELF self() {
		return (SELF) this;
	}
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

	public EmployeeBuilder worksAt(final String position) {
		person.position = position;
		return self();
	}

	@Override
	protected EmployeeBuilder self() {
		return this;
	}
}
