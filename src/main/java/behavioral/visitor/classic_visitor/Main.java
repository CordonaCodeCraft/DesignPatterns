package behavioral.visitor.classic_visitor;

public class Main {
	public static void main(String[] args) {
		final AdditionExpression expression = new AdditionExpression(
				new DoubleExpression(1),
				new AdditionExpression(
						new DoubleExpression(2),
						new DoubleExpression(1)
				)
		);

		final ExpressionPrinter ep = new ExpressionPrinter();
		ep.visit(expression);
		System.out.println(ep);

		ExpressionCalculator ec = new ExpressionCalculator();
		ec.visit(expression);
		System.out.println(ep + " = " + ec.result);
	}
}
