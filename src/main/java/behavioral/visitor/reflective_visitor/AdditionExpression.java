package behavioral.visitor.reflective_visitor;

public class AdditionExpression extends Expression {
	public Expression left;
	public Expression right;

	public AdditionExpression(final Expression left, final Expression right) {
		this.left = left;
		this.right = right;
	}

}
