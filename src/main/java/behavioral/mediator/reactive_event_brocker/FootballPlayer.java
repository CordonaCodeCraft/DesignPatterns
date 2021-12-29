package behavioral.mediator.reactive_event_brocker;

public class FootballPlayer {
	private final String name;
	private final EventBroker broker;
	private int goalsScored = 0;

	public FootballPlayer(final String name, final EventBroker broker) {
		this.name = name;
		this.broker = broker;
	}

	public void score() {
		broker.publish(++goalsScored);
	}
}
