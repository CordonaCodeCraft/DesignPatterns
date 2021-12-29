package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Console {
	private final List<ViewPort> viewPorts = new ArrayList<>();
	private int width;
	private int height;

	public Console(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void addViewport(final ViewPort viewPort) {
		viewPorts.add(viewPort);
	}

	public void render() {
		for (int y = 0; y < height; ++y) {
			for (int x = 0; x < width; ++x) {
				for (ViewPort viewPort : viewPorts) {
					System.out.println(viewPort.charAt(x, y));
				}
			}
			System.out.println();
		}
	}

	public static Console newConsole(final int width, final int height) {
		final Buffer buffer = new Buffer(width, height);
		final ViewPort viewPort = new ViewPort(buffer, width, height, 0, 0);
		final Console console = new Console(width, height);
		console.addViewport(viewPort);
		return console;
	}
}
