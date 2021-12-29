package creational.singleton.monostate_singleton;

/*  Mono-state singleton:
	This is an anti pattern for creating a singleton class, where the properties of the class are declared as static and
	therefore are being stored in the main memory/
	The second instance of the ChiefExecutiveOfficer.class will have the age and name set as "21" and "John Smith" even
	when the properties are not being initialized.
	But as soon as we comment out the initialization calls - they will be changed to "33" and "Barry White", which is
	not the expected behaviour.
*/
public class Main {
	public static void main(String[] args) {
		final ChiefExecutiveOfficer first = new ChiefExecutiveOfficer();
		first.setAge(21);
		first.setName("John Smith");

		final ChiefExecutiveOfficer second = new ChiefExecutiveOfficer();
//		first.setAge(33);
//		first.setName("Barry White");

		System.out.println(second);
	}
}
