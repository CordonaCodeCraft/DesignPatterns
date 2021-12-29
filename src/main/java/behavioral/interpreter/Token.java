package behavioral.interpreter;

public class Token {
	public Type type;
	public String text;

	public Token(final Type type, final String text) {
		this.type = type;
		this.text = text;
	}

	@Override
	public String toString() {
		return String.format("`%s`", text);
	}

	public enum Type {
		INTEGER,
		PLUS,
		MINUS,
		LPAREN,
		RPAREN
	}
}
