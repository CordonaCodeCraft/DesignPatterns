package behavioral.visitor.classic_visitor;

public class ExpressionPrinter implements ExpressionVisitor {
	private StringBuilder sb = new StringBuilder();

	@Override
	public void visit(final DoubleExpression e) {
		sb.append(e.value);
	}

	@Override
	public void visit(final AdditionExpression e) {
		sb.append("(");
		e.left.accept(this);
		sb.append("+");
		e.right.accept(this);
		sb.append(")");
	}

	@Override
	public String toString() {
		return sb.toString();
	}
}
