package behavioral.memento;

public class BankAccount {
	private int balance;

	public BankAccount(final int balance) {
		this.balance = balance;
	}

	public Memento deposit(final int amount) {
		balance += amount;
		return new Memento(balance);
	}

	public void restore(final Memento memento) {
		balance = memento.balance;
	}

	@Override
	public String toString() {
		return "BankAccount{" +
				"balance=" + balance +
				'}';
	}
}
