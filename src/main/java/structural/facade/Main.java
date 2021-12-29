package structural.facade;

public class Main {

	public static void main(String[] args) {
		final Buffer buffer = new Buffer(30, 20);
		final ViewPort viewPort = new ViewPort(buffer, 30, 20, 0, 0);
		final Console console1 = new Console(30, 20);

		console1.addViewport(viewPort);
		console1.render();

		/* Facade */
		final Console console2 = Console.newConsole(30, 20);
		console2.render();
	}
}
