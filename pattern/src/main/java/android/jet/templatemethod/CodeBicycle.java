package android.jet.templatemethod;

/**
 * @author liqisi
 * @version v1.1.0
 * @description
 * @date 创建时间：2017/12/9
 */
public class CodeBicycle extends AbstractClass {

    @Override
    protected void unlock() {
        System.out.println("========" + "密码开锁" + "========");
    }

    @Override
    protected void ride() {
        System.out.println(getClass().getSimpleName() + "骑起来很拉风");
    }

    protected void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }

}
