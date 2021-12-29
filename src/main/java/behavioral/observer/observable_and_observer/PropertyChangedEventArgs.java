package behavioral.observer.observable_and_observer;

public class PropertyChangedEventArgs<T> {
	public T source;
	public String propertyName;
	public Object newValue;

	public PropertyChangedEventArgs(final T source, final String propertyName, final Object newValue) {
		this.source = source;
		this.propertyName = propertyName;
		this.newValue = newValue;
	}
}
