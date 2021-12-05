package creational.prototype.copy_constructor;

public class Employee {
	public String name;
	public Address address;

	public Employee(final String name, final Address address) {
		this.name = name;
		this.address = address;
	}

	public Employee(final Employee other) {
		name = other.name;
		address = new Address(other.address);
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
