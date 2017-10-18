package android.jet.observer;

/**
 * Created by Administrator on 2017/10/17.
 */

public class Client {

    public static void main(String[] args) {
        // 灰太狼--被观察者
        Wolf wolf = new Wolf();

        // 喜羊羊--观察者
        Observer pleasantSheep = new PleasantSheep();
        // 登记观察者
        wolf.attach(pleasantSheep);

        // 懒羊羊--观察者
        Observer lazySheep = new LazySheep();
        // 登记观察者
        wolf.attach(lazySheep);

        // 灰太狼入侵
        wolf.invade();

        // 删除观察者
        wolf.dettach(pleasantSheep);

        wolf.invade();
    }

}
