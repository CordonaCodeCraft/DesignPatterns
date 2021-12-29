package behavioral.command;

public class BankAccount {
	private int balance;
	private final int overdraftLimit = -500;

	public void deposit(final int amount) {
		balance += amount;
		System.out.printf("Deposited %d, balance is now %d%n", amount, balance);
	}

	public boolean withdraw(final int amount) {
		if (balance - amount >= overdraftLimit) {
			balance -= amount;
			System.out.printf("Withdrew %d, balance is now %d%n", amount, balance);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount{" +
				"balance=" + balance +
				'}';
	}
}
