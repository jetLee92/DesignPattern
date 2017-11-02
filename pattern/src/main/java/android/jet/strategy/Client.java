package android.jet.strategy;

/**
 * Created by Administrator on 2017/11/1.
 */

public class Client {
    public static void main(String[] args) {
        // 操控比赛，这场要输
//        Context context = new Context(new ConcreteStrategyA());
//        context.contextInterface();

//        // 操控比赛，这场要输，哈哈哈
//        Context context = new Context(new ConcreteStrategyB());
//        context.contextInterface();

        Context context = new Context();
        context.factory("LOSE");
        context.contextInterface();
    }
}
