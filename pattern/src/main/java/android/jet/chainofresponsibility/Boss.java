package android.jet.chainofresponsibility;

/**
 * @author liqisi
 * @version v1.1.0
 * @description
 * @date 创建时间：2017/11/18
 */
public class Boss extends Handler {
    public Boss() {
        super(2);
    }

    @Override
    public void report(Demand demand) {
        System.out.println("需求：" + demand.detail());
        System.out.println(getClass().getSimpleName() + "：你们打一架吧，打赢的做决定");
    }
}
