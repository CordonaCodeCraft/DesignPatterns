package behavioral.visitor.classic_visitor;

public class DoubleExpression extends Expression {
	public double value;

	public DoubleExpression(final double value) {
		this.value = value;
	}

	@Override
	public void accept(final ExpressionVisitor visitor) {
		visitor.visit(this);
	}
}
