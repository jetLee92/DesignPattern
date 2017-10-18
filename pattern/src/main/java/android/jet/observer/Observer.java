package android.jet.observer;

/**
 * Created by Administrator on 2017/10/17.
 */

public interface Observer {

    String getName();

    /**
     * 通知更新方法
     *
     * @param msg
     */
    public void update(String msg);

}
