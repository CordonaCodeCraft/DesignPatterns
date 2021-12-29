package creational.singleton.basic_singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
	private static final BasicSingleton INSTANCE = new BasicSingleton();
	private int value = 0;

	private BasicSingleton() {
	}

	public static BasicSingleton getInstance() {
		return INSTANCE;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	/*  Explanation:
		The bellow method solves the issue with protecting the enforced singleton behaviour.
		If this method is not being implemented - recreating the method with deserialization will result in a new
		object with new memory address.
	*/
	protected Object readResolve() {
		return INSTANCE;
	}
}
