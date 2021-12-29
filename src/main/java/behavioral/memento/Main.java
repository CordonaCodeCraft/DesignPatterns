package behavioral.memento;

public class Main {
	public static void main(String[] args) {
		final BankAccount account = new BankAccount(100);
		final Memento m1 = account.deposit(50);
		final Memento m2 = account.deposit(25);

		System.out.println(account);

		account.restore(m1);
		System.out.println(account);
		account.restore(m2);
		System.out.println(account);
	}
}
