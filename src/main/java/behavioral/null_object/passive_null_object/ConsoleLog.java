package behavioral.null_object.passive_null_object;

public class ConsoleLog implements Log {
	@Override
	public void info(final String msg) {
		System.out.println(msg);

	}

	@Override
	public void warn(final String msg) {
		System.out.printf("WARNING: %s", msg);
	}
}
