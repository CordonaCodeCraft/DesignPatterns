package behavioral.null_object.passive_null_object;

public class BankAccount {
	private Log log;
	private int balance;

	public BankAccount(final Log log) {
		this.log = log;
	}

	public void deposit(final int amount) {
		balance += amount;
		log.info(String.format("Deposited: %d", amount));
	}
}
