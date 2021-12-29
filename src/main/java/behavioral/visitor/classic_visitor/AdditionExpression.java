package behavioral.visitor.classic_visitor;

public class AdditionExpression extends Expression {
	public Expression left;
	public Expression right;

	public AdditionExpression(final Expression left, final Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void accept(final ExpressionVisitor visitor) {
		visitor.visit(this);
	}
}
