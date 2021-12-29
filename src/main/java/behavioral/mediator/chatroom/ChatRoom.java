package behavioral.mediator.chatroom;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	private List<Person> people = new ArrayList<>();

	public void join(final Person person) {
		final String joinMessage = String.format("%s joins the room", person.name);
		broadcast("room", joinMessage);
		person.room = this;
		people.add(person);
	}

	public void broadcast(final String source, final String message) {
		for (Person person : people) {
			if (!person.name.equals(source)) {
				person.receive(source, message);
			}
		}
	}

	public void message(final String source, final String destination, final String message) {
		people
				.stream()
				.filter(person -> person.name.equals(destination))
				.findFirst()
				.ifPresent(person -> person.receive(source, message));
	}
}
