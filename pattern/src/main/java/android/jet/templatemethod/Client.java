package android.jet.templatemethod;

/**
 * @author liqisi
 * @version v1.1.0
 * @description
 * @date 创建时间：2017/12/9
 */
public class Client {
    public static void main(String[] args) {
        ScanBicycle scanBicycle = new ScanBicycle();
        scanBicycle.isNeedUnlock(false);
        scanBicycle.use();

        CodeBicycle codeBicycle = new CodeBicycle();
        codeBicycle.isNeedUnlock(true);
        codeBicycle.use();
    }
}
