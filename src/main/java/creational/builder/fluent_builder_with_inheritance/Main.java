package creational.builder.fluent_builder_with_inheritance;

public class Main {

	public static void main(String[] args) {
		final EmployeeBuilder personBuilder = new EmployeeBuilder();
		final Person george = personBuilder
				.withName("George")
				.worksAt("CordonaCodeCraft")
				.build();
	}
}
