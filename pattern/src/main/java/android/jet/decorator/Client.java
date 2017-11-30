package android.jet.decorator;

/**
 * Created by Administrator on 2017/11/29.
 */

public class Client {

	public static void main(String[] args) {
		Component star = new Star();
		Component decorator = new ConcreteDecorator(star);
		decorator.movie();
	}

}
