package creational.builder.faceted_builder;

public class Main {

	public static void main(String[] args) {
		final PersonBuilder personBuilder = new PersonBuilder();
		personBuilder
				.lives()
				.in("New york")
				.at("Huston Street")
				.withPostcode("1000")
				.works()
				.at("Cordona Code Craft")
				.asA("Backend engineer")
				.earning(1000);

		Person person = personBuilder.build();

		System.out.println(person);
	}
}
