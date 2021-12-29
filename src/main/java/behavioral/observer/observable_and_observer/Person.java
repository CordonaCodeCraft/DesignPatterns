package behavioral.observer.observable_and_observer;

public class Person extends Observable<Person> {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		if (this.age == age) return;
		this.age = age;
		propertyChanged(this, "age", age);
	}
}
