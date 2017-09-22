package android.jet.factory;

/**
 * @author liqisi
 * @description：
 * @date：2017/9/20
 */
public class Pizza implements Product {

	@Override
	public void product() {
		/**
		 *  具体的业务逻辑
		 */
		System.out.println("披萨做好了！！");
	}

}
