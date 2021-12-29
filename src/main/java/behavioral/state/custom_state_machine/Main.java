package behavioral.state.custom_state_machine;

import org.javatuples.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static behavioral.state.custom_state_machine.State.*;
import static behavioral.state.custom_state_machine.Trigger.*;

public class Main {
	private static final Map<State, List<Pair<Trigger, State>>> rules = new HashMap<>();
	private static final State exitState = ON_HOOK;
	private static State currentState = OFF_HOOK;

	public static void main(String[] args) {
		final BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.printf("The phone is currently %s%n", currentState);
			System.out.println("Select trigger:");

			for (int i = 0; i < rules.get(currentState).size(); i++) {
				final Trigger trigger = rules.get(currentState).get(i).getValue0();
				System.out.printf("%d. %s%n", i, trigger);
			}

			boolean parseOK;
			int choice = 0;

			do {
				try {
					System.out.println("Please enter your choice:");
					choice = Integer.parseInt(console.readLine());
					parseOK = choice >= 0 && choice < rules.get(currentState).size();
				} catch (IOException e) {
					parseOK = false;
				}
			} while (!parseOK);

			currentState = rules.get(currentState).get(choice).getValue1();

		} while (currentState != exitState);
	}

	static {
		rules.put(OFF_HOOK, List.of(
				new Pair<>(CALL_DIALED, CONNECTING),
				new Pair<>(STOP_USING_PHONE, ON_HOOK)
		));
		rules.put(CONNECTING, List.of(
				new Pair<>(HUNG_UP, OFF_HOOK),
				new Pair<>(CALL_CONNECTED, CONNECTED)
		));
		rules.put(CONNECTED, List.of(
				new Pair<>(LEFT_MESSAGE, OFF_HOOK),
				new Pair<>(HUNG_UP, OFF_HOOK),
				new Pair<>(PLACED_ON_HOLD, ON_HOLD)
		));
		rules.put(ON_HOLD, List.of(
				new Pair<>(TAKEN_OFF_HOLD, CONNECTED),
				new Pair<>(HUNG_UP, OFF_HOOK)
		));
	}
}
