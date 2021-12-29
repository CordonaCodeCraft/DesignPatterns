package behavioral.mediator.chatroom;

import java.util.ArrayList;
import java.util.List;

public class Person {
	public String name;
	private List<String> chatLog = new ArrayList<>();
	public ChatRoom room;

	public Person(final String name) {
		this.name = name;
	}

	public void receive(final String sender, final String message) {
		String s = String.format("%s: '%s'", sender, message);
		System.out.printf("[%s's chat session] %s%n", name, s);
		chatLog.add(s);
	}

	public void say(final String message) {
		room.broadcast(name, message);
	}

	public void privateMessage(final String who, final String message) {
		room.message(name, who, message);
	}
}
