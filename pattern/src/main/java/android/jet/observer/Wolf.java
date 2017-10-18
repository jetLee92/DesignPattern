package android.jet.observer;

/**
 * Created by Administrator on 2017/10/17.
 */

public class Wolf extends Subject {

    public void invade(){

        System.out.println("灰太狼：我要搞事情了");
        // 通知所有观察者
        notifyObserver();
    }

}
