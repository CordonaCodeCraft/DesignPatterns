package structural.decorator.adapter_decorator;

public class Main {
	public static void main(String[] args) {
		CustomStringBuilder csb = new CustomStringBuilder();
		csb.append("hello").appendLine(" world");
		System.out.println(csb.concat("and this too"));
	}
}
