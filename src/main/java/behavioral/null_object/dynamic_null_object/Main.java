package behavioral.null_object.dynamic_null_object;

import behavioral.null_object.passive_null_object.BankAccount;
import behavioral.null_object.passive_null_object.Log;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		final Log log = noOp(Log.class);
		final BankAccount account = new BankAccount(log);
		account.deposit(100);

	}

	@SuppressWarnings("unchecked")
	public static <T> T noOp(final Class<T> itf) {
		return (T) Proxy.newProxyInstance(
				itf.getClassLoader(),
				new Class<?>[]{itf},
				(proxy, method, args) -> {
					if (method.getReturnType().equals(Void.TYPE)) {
						return null;
					} else {
						return method.getReturnType().getConstructor().newInstance();
					}
				});
	}
}
