package android.jet.factory;

/**
 * @author liqisi
 * @description：
 * @date：2017/9/20
 */
public class PizzaFactory implements Factory {

	@Override
	public Product factory() {
		return new Pizza();
	}

}
