package android.jet.prototype;

/**
 * Created by Administrator on 2017/10/24.
 */

public class Client {

    public static void main(String[] args) {

        Area area = new Area();
        area.setUnit("RMB");

        // 原型实例，100RNB的钞票
        Money money = new Money(100, area);

//        for (int i = 1; i <= 3; i++) {
//            try {
//                Money cloneMoney = money.clone();
//                cloneMoney.setFaceValue(i * 100);
//                System.out.println("这张是" + cloneMoney.getFaceValue() + cloneMoney.getArea().getUnit() + "的钞票");
//            } catch (CloneNotSupportedException e) {
//                e.printStackTrace();
//            }
//        }

//        try {
//            Money cloneMoney = money.clone();
//            area.setUnit("美元");
//            System.out.println("原型实例的面值：" + money.getFaceValue() +money.getArea().getUnit());
//            System.out.println("拷贝实例的面值：" + cloneMoney.getFaceValue() + cloneMoney.getArea().getUnit());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

        try {
            Money cloneMoney = money.clone();
            cloneMoney.setFaceValue(200);
            area.setUnit("美元");

            System.out.println("原型实例的面值：" + money.getFaceValue() + money.getArea().getUnit());
            System.out.println("拷贝实例的面值：" + cloneMoney.getFaceValue() + cloneMoney.getArea().getUnit());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
