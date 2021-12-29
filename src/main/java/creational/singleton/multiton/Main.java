package creational.singleton.multiton;

public class Main {
	public static void main(String[] args) {
		final Printer primary = Printer.get(Subsystem.PRIMARY);
		final Printer aux = Printer.get(Subsystem.AUXILIARY);
		final Printer aux2 = Printer.get(Subsystem.AUXILIARY);
	}
}
