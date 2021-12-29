package behavioral.observer.observable_and_observer;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
	private List<Observer<T>> observers = new ArrayList<>();

	public void subscribe(Observer<T> observer) {
		observers.add(observer);
	}

	protected void propertyChanged(final T source, final String propertyName, final Object newValue) {
		for (Observer<T> observer : observers) {
			observer.handle(new PropertyChangedEventArgs<>(source, propertyName, newValue));
		}
	}
}
