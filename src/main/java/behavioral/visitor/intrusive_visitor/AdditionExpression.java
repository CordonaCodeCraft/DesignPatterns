package behavioral.visitor.intrusive_visitor;

public class AdditionExpression extends Expression {
	private Expression left;
	private Expression right;

	public AdditionExpression(final Expression left, final Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void print(final StringBuilder sb) {
		sb.append("(");
		left.print(sb);
		sb.append("+");
		right.print(sb);
		sb.append(")");
	}
}
