package behavioral.observer.event_class;

public class Subscription<TArgs> implements AutoCloseable {
	private Event<TArgs> event;
	private int id;

	public Subscription(final Event<TArgs> event, final int id) {
		this.event = event;
		this.id = id;
	}

	@Override
	public void close() {
		event.handlers.remove(id);
	}
}
