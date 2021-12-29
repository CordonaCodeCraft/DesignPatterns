package behavioral.chain_of_responsibility.broker_chain;

import static behavioral.chain_of_responsibility.broker_chain.Query.Argument.ATTACK;
import static behavioral.chain_of_responsibility.broker_chain.Query.Argument.DEFENCE;

public class Creature {
	private Game game;
	public String name;
	private int baseAttack;
	private int baseDefence;

	public Creature(final Game game, final String name, final int baseAttack, final int baseDefence) {
		this.game = game;
		this.name = name;
		this.baseAttack = baseAttack;
		this.baseDefence = baseDefence;
	}

	int getAttack() {
		Query query = new Query(name, ATTACK, baseAttack);
		game.queries.fire(query);
		return query.result;
	}

	int getDefence() {
		Query query = new Query(name, DEFENCE, baseDefence);
		game.queries.fire(query);
		return query.result;
	}

	@Override
	public String toString() {
		return "Creature{" +
				"game=" + game +
				", name='" + name + '\'' +
				", attack=" + getAttack() +
				", defence=" + getDefence() +
				'}';
	}
}
