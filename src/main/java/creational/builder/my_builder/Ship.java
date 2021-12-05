package creational.builder.my_builder;

public class Ship {
	private String name;
	private String type;
	private int grossTonnage;
	private String owner;
	private String ownerType;
	private String ownerCountry;

	public static class ShipBuilder {
		protected Ship subject = new Ship();

		public ParticularsBuilder particulars() {
			return new ParticularsBuilder(subject);
		}

		public OwnerBuilder owner() {
			return new OwnerBuilder(subject);
		}

		public Ship build() {
			return subject;
		}
	}

	public static class ParticularsBuilder extends ShipBuilder {

		public ParticularsBuilder(final Ship subject) {
			super.subject = subject;
		}

		public ParticularsBuilder withName(final String name) {
			subject.name = name;
			return this;
		}

		public ParticularsBuilder withType(final String type) {
			subject.type = type;
			return this;
		}

		public ParticularsBuilder withGrossTonnage(final int grossTonnage) {
			subject.grossTonnage = grossTonnage;
			return this;
		}
	}

	public static class OwnerBuilder extends ShipBuilder {

		public OwnerBuilder(final Ship subject) {
			super.subject = subject;
		}

		public OwnerBuilder withOwnerName(final String ownerName) {
			subject.owner = ownerName;
			return this;
		}

		public OwnerBuilder withOwnerType(final String ownerType) {
			subject.ownerType = ownerType;
			return this;
		}

		public OwnerBuilder withOwnerCountry(final String ownerCountry) {
			subject.ownerCountry = ownerCountry;
			return this;
		}
	}

}
