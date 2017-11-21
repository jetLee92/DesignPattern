package android.jet.chainofresponsibility;

/**
 * @author liqisi
 * @version v1.1.0
 * @description
 * @date 创建时间：2017/11/18
 */
public class DemandA implements Demand {

    @Override
    public int demandLevel() {
        return 1;
    }

    @Override
    public String detail() {
        return "加一张露一点点的图";
    }
}
