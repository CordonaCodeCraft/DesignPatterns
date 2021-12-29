package behavioral.command;

import com.google.common.collect.Lists;

import java.util.List;

import static behavioral.command.BankAccountCommand.Action.DEPOSIT;
import static behavioral.command.BankAccountCommand.Action.WITHDRAW;

public class Main {
	public static void main(String[] args) {
		final BankAccount account = new BankAccount();
		System.out.println(account);
		final List<BankAccountCommand> commands = List.of(
				new BankAccountCommand(account, DEPOSIT, 100),
				new BankAccountCommand(account, WITHDRAW, 1000)
		);

		for (BankAccountCommand command : commands) {
			command.call();
			System.out.println(account);
		}

		for (BankAccountCommand command : Lists.reverse(commands)) {
			command.undo();
			System.out.println(account);
		}
	}
}
