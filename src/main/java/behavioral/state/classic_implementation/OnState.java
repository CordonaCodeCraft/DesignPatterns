package behavioral.state.classic_implementation;

public class OnState extends State {

	public OnState() {
		System.out.println("Light turned on");
	}

	@Override
	void off(final LightSwitch ls) {
		System.out.println("Switching light of...");;
	}
}
