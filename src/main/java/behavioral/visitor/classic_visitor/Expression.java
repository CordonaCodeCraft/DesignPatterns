package behavioral.visitor.classic_visitor;

public abstract class Expression {
	public abstract void accept(final ExpressionVisitor visitor);
}
