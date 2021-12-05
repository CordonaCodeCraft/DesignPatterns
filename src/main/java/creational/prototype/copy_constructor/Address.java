package creational.prototype.copy_constructor;

public class Address {
	public String streetAddress;
	public String city;
	public String country;

	public Address(final String streetAddress, final String city, final String country) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
	}

	public Address(final Address other) {
		this(other.streetAddress, other.city, other.country);
	}

	@Override
	public String toString() {
		return "Address{" +
				"streetAddress='" + streetAddress + '\'' +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				'}';
	}
}
