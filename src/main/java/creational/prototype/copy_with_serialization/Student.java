package creational.prototype.copy_with_serialization;

import java.io.Serializable;

public class Student implements Serializable {
	public String name;
	public int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
