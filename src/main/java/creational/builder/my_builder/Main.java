package creational.builder.my_builder;

public class Main {

	public static void main(String[] args) {
		final Ship.ShipBuilder shipBuilder = new Ship.ShipBuilder();
		Ship ship = shipBuilder
				.particulars()
				.withGrossTonnage(1000)
				.withType("Passenger")
				.owner()
				.withOwnerType("Transport company")
				.particulars()
				.withName("Cordona")
				.owner()
				.withOwnerCountry("New Zealand")
				.withOwnerName("Cordona Transport Service")
				.build();

		System.out.println();


	}
}
