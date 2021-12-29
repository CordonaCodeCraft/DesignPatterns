package behavioral.visitor.reflective_visitor;

public class ExpressionPrinter {
	public  void print(final Expression e, final StringBuilder sb) {
		if (e.getClass() == DoubleExpression.class) {
			sb.append(((DoubleExpression) e).value);
		} else if (e.getClass() == AdditionExpression.class) {
			final AdditionExpression ae = (AdditionExpression) e;
			sb.append("(");
			print(ae.left, sb);
			sb.append("+");
			print(ae.right, sb);
			sb.append(")");
		}
	}
}
