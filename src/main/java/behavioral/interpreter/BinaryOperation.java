package behavioral.interpreter;

public class BinaryOperation implements Element {
	public Type type;
	public Element left;
	public Element right;

	@Override
	public int evaluate() {
		switch (type) {
			case ADDITION:
				return left.evaluate() + right.evaluate();
			case SUBTRACTION:
				return left.evaluate() - right.evaluate();
			default:
				return 0;
		}
	}

	public enum Type {ADDITION, SUBTRACTION}
}
