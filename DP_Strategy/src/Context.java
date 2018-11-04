
public class Context {
	protected Strategy strategy;
	
	public Context() {
		strategy=new StrategyImpl1();
	}//le traitement par défaut
	public void effectuerStrategy() {
		strategy.operationStrategy();
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
