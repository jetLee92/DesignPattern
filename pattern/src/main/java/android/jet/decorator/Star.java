package android.jet.decorator;

/**
 * Created by Administrator on 2017/11/29.
 */

public class Star implements Component {
	@Override
	public void movie() {
		System.out.println(getClass().getSimpleName() + "：化了妆迷倒一片妹纸，拍起来电影特别带劲");
	}
}
