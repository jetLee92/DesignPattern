package android.jet.chainofresponsibility;

/**
 * @author liqisi
 * @version v1.1.0
 * @description
 * @date 创建时间：2017/11/18
 */
public class TechnicalManager extends Handler {
    public TechnicalManager() {
        super(1);
    }

    @Override
    public void report(Demand demand) {
        System.out.println("需求：" + demand.detail());
        System.out.println(getClass().getSimpleName() + "：小猿我挺你，这个需求不干");
    }

}
