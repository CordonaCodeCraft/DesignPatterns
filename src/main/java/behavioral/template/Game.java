package behavioral.template;

public abstract class Game {
	protected int currentPlayer;
	protected final int playersCount;

	public Game(final int playersCount) {
		this.playersCount = playersCount;
	}

	public void run() {
		start();
		while (!haveWinner()) {
			takeTurn();
		}
		System.out.printf("Player %s wins%n", getWinningPlayer());
	}

	protected abstract int getWinningPlayer();

	protected abstract void takeTurn();

	protected abstract boolean haveWinner();

	protected abstract void start();
}
