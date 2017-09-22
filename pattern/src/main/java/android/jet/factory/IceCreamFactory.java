package android.jet.factory;

/**
 * @author liqisi
 * @description：
 * @date：2017/9/20
 */
public class IceCreamFactory implements Factory {

	@Override
	public Product factory() {
		return new IceCream();
	}

}
