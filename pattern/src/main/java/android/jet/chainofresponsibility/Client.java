package android.jet.chainofresponsibility;

/**
 * @author liqisi
 * @version v1.1.0
 * @description
 * @date 创建时间：2017/11/18
 */
public class Client {
    public static void main(String[] args) {
        Demand demandA = new DemandA(); // 请求等级低
        Demand demandB = new DemandB(); // 请求等级高

        Boss boss = new Boss();
        TechnicalManager technicalManager = new TechnicalManager();
        technicalManager.setNextHandler(boss);

        technicalManager.handleMessage(demandA);
        System.out.println("============================");
        technicalManager.handleMessage(demandB);
    }
}
