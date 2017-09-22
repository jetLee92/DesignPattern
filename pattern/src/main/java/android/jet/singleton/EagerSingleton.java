package android.jet.singleton;

/**
 * @author liqisi
 * @description：  饿汉式
 * @date：2017/9/22
 */
public class EagerSingleton {

		private static EagerSingleton singleton = new EagerSingleton();

		private EagerSingleton() {
		}

		public static EagerSingleton getSingleton() {
			return singleton;
		}

}
