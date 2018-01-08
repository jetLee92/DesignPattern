package android.jet.mediator;

/**
 * Created by Administrator on 2018/1/5.
 */

public class SituationA extends Colleague {

	public SituationA(Mediator mediator) {
		super(mediator);
	}

	// 请求支援
	public void aRequestSupport() {
		super.mediator.execute("aRequestSupport");
	}
}
