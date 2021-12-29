package behavioral.mediator.reactive_event_brocker;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.ArrayList;
import java.util.List;

public class EventBroker extends Observable<Integer> {
	private List<Observer<? super Integer>> observers = new ArrayList<>();

	@Override
	protected void subscribeActual(final Observer<? super Integer> observer) {
		observers.add(observer);
	}

	public void publish(final int n) {
		for (Observer<? super Integer> o : observers) {
			o.onNext(n);
		}
	}

}
