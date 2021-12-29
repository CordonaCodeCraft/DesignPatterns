package structural.proxy.property_proxy;

import java.util.Objects;

public class Property<T> {
	private T value;

	public Property(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		// logging
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Property<?> property = (Property<?>) o;
		return getValue().equals(property.getValue());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getValue());
	}
}
