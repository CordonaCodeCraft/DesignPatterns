package behavioral.observer.event_class;

public class PropertyChangedEventArgs {
	public Object source;
	public String propertyName;

	public PropertyChangedEventArgs(final Object source, final String propertyName) {
		this.source = source;
		this.propertyName = propertyName;
	}
}
