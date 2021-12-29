package behavioral.interpreter;

public class IntegerObject implements Element {
	final int value;

	public IntegerObject(final int value) {
		this.value = value;
	}

	@Override
	public int evaluate() {
		return value;
	}
}
