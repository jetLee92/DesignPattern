package android.jet.proxy;

/**
 * Created by Administrator on 2017/11/28.
 */

public class Star implements Subject {

	@Override
	public void movie() {
		System.out.println(getClass().getSimpleName() + "：经纪人接了一部电影，我负责拍就好");
	}

	@Override
	public Subject getAgent() {
		return new Agent(this);
	}

}
