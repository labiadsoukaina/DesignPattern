
public class Application {

	public static void main(String[] args) {
		Context ctx=new Context();
		//ctx.strategy=new StrategyImpl1();
		ctx.setStrategy(new StrategyImpl1());
		ctx.effectuerStrategy();
		ctx.setStrategy(new StrategyImpl2());
		ctx.effectuerStrategy();
		ctx.setStrategy(new StrategyImpl3());
		ctx.effectuerStrategy();

	}

}
