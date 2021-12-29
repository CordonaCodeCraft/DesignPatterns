package behavioral.command;

public class BankAccountCommand implements Command {
	private final BankAccount account;
	private final Action action;
	private final int amount;
	private boolean succeeded;

	public BankAccountCommand(final BankAccount account, final Action action, final int amount) {
		this.account = account;
		this.action = action;
		this.amount = amount;
	}

	@Override
	public void call() {
		switch (action) {
			case DEPOSIT:
				succeeded = true;
				account.deposit(amount);
				break;
			case WITHDRAW:
				succeeded = account.withdraw(amount);
				break;
		}
	}

	@Override
	public void undo() {
		if (!succeeded) return;
		switch (action) {
			case DEPOSIT:
				account.withdraw(amount);
				break;
			case WITHDRAW:
				account.deposit(amount);
				break;
		}
	}

	public enum Action {DEPOSIT, WITHDRAW}
}
