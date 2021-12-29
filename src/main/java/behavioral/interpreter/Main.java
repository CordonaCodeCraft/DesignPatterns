package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static behavioral.interpreter.BinaryOperation.Type.ADDITION;
import static behavioral.interpreter.BinaryOperation.Type.SUBTRACTION;
import static behavioral.interpreter.Token.Type.*;

public class Main {

	public static void main(String[] args) {
		final String input = "(13+4)-(12+1)";
		final List<Token> tokens = lex(input);
		tokens.forEach(token -> System.out.println(token.toString()));

		final Element parsed = parse(tokens);
		System.out.printf("%s = %d", input, parsed.evaluate());

	}

	public static List<Token> lex(final String input) {
		final ArrayList<Token> result = new ArrayList<>();

		for (int i = 0; i < input.length(); ++i) {
			switch (input.charAt(i)) {
				case '+':
					result.add(new Token(PLUS, "+"));
					break;
				case '-':
					result.add(new Token(MINUS, "-"));
					break;
				case '(':
					result.add(new Token(LPAREN, "("));
					break;
				case ')':
					result.add(new Token(RPAREN, ")"));
					break;
				default:
					final StringBuilder sb = new StringBuilder("" + input.charAt(i));
					for (int j = i + 1; j < input.length(); ++j) {
						final char character = input.charAt(j);
						if (Character.isDigit(character)) {
							sb.append(character);
							++i;
						} else {
							result.add(new Token(INTEGER, sb.toString()));
							break;
						}
					}
					break;
			}
		}
		return result;
	}

	public static Element parse(List<Token> tokens) {
		final BinaryOperation result = new BinaryOperation();

		boolean haveLHS = false;

		for (int i = 0; i < tokens.size(); i++) {
			final Token token = tokens.get(i);
			switch (token.type) {
				case INTEGER:
					final IntegerObject integer = new IntegerObject(Integer.parseInt(token.text));
					if (!haveLHS) {
						result.left = integer;
						haveLHS = true;
					} else {
						result.right = integer;
					}
					break;
				case PLUS:
					result.type = ADDITION;
					break;
				case MINUS:
					result.type = SUBTRACTION;
					break;
				case LPAREN:
					int j = i;
					for (; j < tokens.size(); ++j) {
						if (tokens.get(j).type == RPAREN) {
							break;
						}
					}

					final List<Token> subexpression = tokens
							.stream()
							.skip(i + 1)
							.limit(j - i - 1)
							.collect(Collectors.toList());

					final Element element = parse(subexpression);

					if (!haveLHS) {
						result.left = element;
						haveLHS = true;
					} else {
						result.right = element;
					}
					i = j;
					break;
			}
		}
		return result;
	}
}
