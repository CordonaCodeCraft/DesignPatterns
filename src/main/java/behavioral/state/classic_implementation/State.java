package behavioral.state.classic_implementation;

public class State {
	void on (final LightSwitch ls) {
		System.out.println("Light is already on");
	}

	void off(final LightSwitch ls) {
		System.out.println("Light is already off");
		ls.setState(new OnState());
	}
}
