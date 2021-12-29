package behavioral.visitor.reflective_visitor;

public class Main {
	public static void main(String[] args) {
		final AdditionExpression expression = new AdditionExpression(
				new DoubleExpression(1),
				new AdditionExpression(
						new DoubleExpression(2),
						new DoubleExpression(1)
				)
		);
		final StringBuilder sb = new StringBuilder();
		ExpressionPrinter ep = new ExpressionPrinter();
		ep.print(expression, sb);
		System.out.println(sb);
	}
}
