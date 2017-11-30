package android.jet.decorator;

/**
 * Created by Administrator on 2017/11/29.
 */

public class ConcreteDecorator implements Component {
	private Component star;

	public ConcreteDecorator(Component concreteComponent) {
		this.star = concreteComponent;
	}

	@Override
	public void movie() {
		System.out.println(getClass().getSimpleName() + "：拍电影各种道具加身，还得化妆");
		star.movie();
	}
}
