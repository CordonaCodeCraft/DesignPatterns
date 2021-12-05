package creational.builder.faceted_builder;

public class Person {
	public String streetAddress;
	public String postCode;
	public String city;
	public String companyName;
	public String position;
	public int annualIncome;

	@Override
	public String toString() {
		return "Person{" +
				"streetAddress='" + streetAddress + '\'' +
				", postCode='" + postCode + '\'' +
				", city='" + city + '\'' +
				", companyName='" + companyName + '\'' +
				", position='" + position + '\'' +
				", annualIncome=" + annualIncome +
				'}';
	}
}

class PersonBuilder {
	protected Person person = new Person();

	public PersonAddressBuilder lives() {
		return new PersonAddressBuilder(person);
	}

	public PersonJobBuilder works() {
		return new PersonJobBuilder(person);
	}

	public Person build() {
		return person;
	}
}

class PersonAddressBuilder extends PersonBuilder {

	public PersonAddressBuilder(final Person person) {
		this.person = person;
	}

	public PersonAddressBuilder at(final String streetAddress) {
		person.streetAddress = streetAddress;
		return this;
	}

	public PersonAddressBuilder in(final String city) {
		person.city = city;
		return this;
	}

	public PersonAddressBuilder withPostcode(final String postCode) {
		person.postCode = postCode;
		return this;
	}
}

class PersonJobBuilder extends PersonBuilder {

	public PersonJobBuilder(final Person person) {
		this.person = person;
	}

	public PersonJobBuilder at(final String companyName) {
		person.companyName = companyName;
		return this;
	}

	public PersonJobBuilder asA(final String position) {
		person.position = position;
		return this;
	}

	public PersonJobBuilder earning(final int annualIncome) {
		person.annualIncome = annualIncome;
		return this;
	}
}