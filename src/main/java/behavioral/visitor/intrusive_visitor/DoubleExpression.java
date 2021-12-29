package behavioral.visitor.intrusive_visitor;

public class DoubleExpression extends Expression {
	private double value;

	public DoubleExpression(final double value) {
		this.value = value;
	}

	@Override
	public void print(final StringBuilder sb) {
		sb.append(value);
	}
}
