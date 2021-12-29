package behavioral.observer.event_class;

public class Person {
	public Event<PropertyChangedEventArgs> propertyChanged = new Event<>();
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		if (this.age == age) return;
		this.age = age;
		propertyChanged.fire(new PropertyChangedEventArgs(this, "age"));
	}
}
