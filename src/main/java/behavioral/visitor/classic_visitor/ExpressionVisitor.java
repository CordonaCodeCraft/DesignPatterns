package behavioral.visitor.classic_visitor;

public interface ExpressionVisitor {
	void visit(DoubleExpression e);
	void visit(AdditionExpression e);
}
