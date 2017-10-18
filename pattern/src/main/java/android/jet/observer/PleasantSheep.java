package android.jet.observer;

/**
 * Created by Administrator on 2017/10/17.
 */

public class PleasantSheep implements Observer{

    @Override
    public String getName() {
        return "喜羊羊";
    }

    /**
     * 具体业务逻辑
     */
    @Override
    public void update(String msg) {
        System.out.println("喜羊羊收到通知：" + msg);
    }

}
