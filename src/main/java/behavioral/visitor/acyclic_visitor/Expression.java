package behavioral.visitor.acyclic_visitor;

public abstract class Expression {
	// optional
	public void accept(Visitor visitor) {
		if (visitor instanceof ExpressionVisitor) {
			((ExpressionVisitor) visitor).visit(this);
		}
	}
}
