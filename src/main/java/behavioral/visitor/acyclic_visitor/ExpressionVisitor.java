package behavioral.visitor.acyclic_visitor;

public interface ExpressionVisitor extends Visitor {
	void visit(Expression obj);
}
