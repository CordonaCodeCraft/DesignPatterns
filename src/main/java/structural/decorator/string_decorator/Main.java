package structural.decorator.string_decorator;

public class Main {
	public static void main(String[] args) {
		final MagicString s = new MagicString("hello");
		System.out.printf("%s has %d vowels%n", s, s.getNumberOfVowels());
	}
}
