package behavioral.mediator.chatroom;

public class Main {

	public static void main(String[] args) {
		final ChatRoom room = new ChatRoom();
		final Person john = new Person("John");
		final Person jane = new Person("Jane");

		room.join(john);
		room.join(jane);

		john.say("Hi room");
		john.say("Oh, hey John");

		final Person simon = new Person("Simon");

		room.join(simon);
		simon.say("Hi, everyone");

		jane.privateMessage("Simon", "Glad you could join us");
	}
}
