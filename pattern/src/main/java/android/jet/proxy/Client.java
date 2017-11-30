package android.jet.proxy;

/**
 * Created by Administrator on 2017/11/28.
 */

public class Client {

	public static void main(String[] args) {
//		Subject star = new Star();
//		Subject proxy = new Agent(star);
//		proxy.movie();

		Subject star = new Star();
		Subject proxy = star.getAgent();
		proxy.movie();

	}

}
