package android.jet.mediator;

/**
 * Created by Administrator on 2018/1/5.
 */

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
