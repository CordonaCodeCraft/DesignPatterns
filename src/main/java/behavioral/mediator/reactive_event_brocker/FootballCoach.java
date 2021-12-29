package behavioral.mediator.reactive_event_brocker;

public class FootballCoach {
	public FootballCoach(final EventBroker broker) {
		broker.subscribe(i -> {
			System.out.printf("Hey, you scored %d goals%n", i);
		});
	}
}
