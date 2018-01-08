package android.jet.mediator;

/**
 * Created by Administrator on 2018/1/5.
 */

public abstract class Mediator {
	protected SituationA situationA;
	protected SituationB situationB;
	protected SituationC situationC;

	Mediator() {
		situationA = new SituationA(this);
		situationB = new SituationB(this);
		situationC = new SituationC(this);
	}

	/**
	 * 事件的业务流程处理
	 *
	 * @param method
	 */
	public abstract void execute(String method);
}
