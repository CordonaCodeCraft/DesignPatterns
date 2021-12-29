package behavioral.visitor.intrusive_visitor;

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
		expression.print(sb);
		System.out.println(sb);
	}
}
