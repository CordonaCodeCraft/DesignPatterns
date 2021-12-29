package behavioral.visitor.acyclic_visitor;

public interface AdditionExpressionVisitor extends Visitor {
	void visit(AdditionExpression obj);
}
