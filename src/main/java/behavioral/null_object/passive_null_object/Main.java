package behavioral.null_object.passive_null_object;

public class Main {
	public static void main(String[] args) {
		final Log log = new ConsoleLog();
		final BankAccount accountA = new BankAccount(log);
		accountA.deposit(100);

		final Log nullLog = new NullLog();
		final BankAccount accountB = new BankAccount(nullLog);
		accountA.deposit(100);
	}

}
