package behavioral.mediator.reactive_event_brocker;

public class Main {

	public static void main(String[] args) {
		final EventBroker broker = new EventBroker();
		final FootballPlayer player = new FootballPlayer("Jones", broker);
		final FootballCoach coach = new FootballCoach(broker);

		player.score();
		player.score();
		player.score();
	}
}
