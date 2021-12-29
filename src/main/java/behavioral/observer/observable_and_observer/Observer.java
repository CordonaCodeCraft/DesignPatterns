package behavioral.observer.observable_and_observer;

public interface Observer<T> {
	void handle(PropertyChangedEventArgs<T> args);
}
