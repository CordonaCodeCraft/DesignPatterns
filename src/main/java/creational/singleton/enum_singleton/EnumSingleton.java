package creational.singleton.enum_singleton;

/*  The enums are serializable by default and their constructors are by default private.
	This is why the constructor is not declared explicitly as private.
	The enums are serialized, but only the names of the enums, not the properties (if any).
	This means that enum singletons can not preserve state.
	The additional problem is that you can not inherit from an enum singleton.
*/
enum EnumSingleton {
	INSTANCE;
	private int value;

	EnumSingleton() {
		value = 42;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
