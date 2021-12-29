package behavioral.chain_of_responsibility.broker_chain;

public class Query {
	public String creatureName;
	public Argument argument;
	public int result;

	public Query(final String creatureName, final Argument argument, final int result) {
		this.creatureName = creatureName;
		this.argument = argument;
		this.result = result;
	}

	enum Argument {
		ATTACK,
		DEFENCE
	}
}
