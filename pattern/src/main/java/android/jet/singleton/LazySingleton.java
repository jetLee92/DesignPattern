package android.jet.singleton;

/**
 * @author liqisi
 * @description： 懒汉式
 * @date：2017/9/22
 */
public class LazySingleton {

	private static LazySingleton singleton = null;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getSingleton() {
		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
