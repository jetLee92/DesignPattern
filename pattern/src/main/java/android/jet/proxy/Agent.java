package android.jet.proxy;

/**
 * Created by Administrator on 2017/11/28.
 */

public class Agent implements Subject {
	private Subject star;

	public Agent(Subject star) {
		this.star = star;
	}

	@Override
	public void movie() {
		System.out.println(getClass().getSimpleName() + "：剧本很好，这部电影接下了");
		star.movie();
	}

	@Override
	public Subject getAgent() {
		return this;
	}
}
