package behavioral.visitor.classic_visitor;

public class ExpressionCalculator implements ExpressionVisitor {
	public double result;

	@Override
	public void visit(final DoubleExpression e) {
		result = e.value;

	}

	@Override
	public void visit(final AdditionExpression e) {
		e.left.accept(this);
		double a = result;
		e.right.accept(this);
		double b = result;
		result = a + b;
	}
}
