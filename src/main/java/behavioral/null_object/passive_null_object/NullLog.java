package behavioral.null_object.passive_null_object;

public class NullLog implements Log {
	@Override
	public void info(final String msg) {
		/* Null object pattern, no op */
	}

	@Override
	public void warn(final String msg) {
		/* Null object pattern, no op */
	}
}
