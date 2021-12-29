package behavioral.state.classic_implementation;

public class LightSwitch {
	private State state;

	public LightSwitch() {
		state = new OffState();
	}

	public void setState(final State state) {
		this.state = state;
	}

	void on() {
		state.on(this);
	}

	void off() {
		state.off(this);
	}
}
