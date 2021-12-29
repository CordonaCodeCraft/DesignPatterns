package behavioral.template;

public class Chess extends Game {

	private int maxTurns = 10;
	private int turn = 1;

	public Chess() {
		super(2);
	}

	@Override
	protected int getWinningPlayer() {
		return 0;
	}

	@Override
	protected void takeTurn() {
		System.out.printf("Turn %d taken by player %d%n", turn++, currentPlayer);
	}

	@Override
	protected boolean haveWinner() {
		return turn == maxTurns;
	}

	@Override
	protected void start() {
		System.out.println("Starting a game of chess");
	}
}
