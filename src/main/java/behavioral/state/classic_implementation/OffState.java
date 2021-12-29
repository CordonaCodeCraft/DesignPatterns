package behavioral.state.classic_implementation;

public class OffState extends State {

	public OffState() {
		System.out.println("Light turned off");
	}

	@Override
	void on(final LightSwitch ls) {
		System.out.println("Switching light on...");
		ls.setState(new OnState());
	}
}
