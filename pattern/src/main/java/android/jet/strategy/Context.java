package android.jet.strategy;

/**
 * Created by Administrator on 2017/11/1.
 */

public class Context {

    private Strategy strategy;

//    /**
//     * 传进的是一个具体的策略实例
//     * @param strategy
//     */
//    public Context(Strategy strategy) {
//        this.strategy = strategy;
//    }

    public void factory(String strategyType) {
        if (strategyType.equals("WIN")) {
            strategy = new ConcreteStrategyB();
        } else if (strategyType.equals("LOSE")) {
            strategy = new ConcreteStrategyA();
        }
    }

    /**
     * 调用策略
     */
    public void contextInterface() {
        strategy.algorithmLogic();
    }

}
