package android.jet.mediator;

import java.util.Random;

/**
 * Created by Administrator on 2018/1/5.
 */

public class Command extends Mediator {

	public void execute(String method) {
		if (method.equals("aRequestSupport")) {
			this.aRequestSupport();
		} else if (method.equals("bRequestSupport")) {
			this.bRequestSupport();
		}
	}

	// A请求支援
	private void aRequestSupport() {
		System.out.println("SituationA：这里是A战区，现在被敌方攻打，请求支援");
		boolean isBSupport = isSupport();  // B是否可以支援
		super.situationB.bSupport(isBSupport);
		if (!isBSupport) { // B支援不了，请求C
			System.out.println("-------A又向C请求支援--------");
			boolean isASupport = isSupport();  // B是否可以支援
			super.situationC.cSupport(isASupport);
			if (!isASupport) {
				System.out.println("-------自己看着办吧。--------");
			}
		}
	}

	// B请求支援
	public void bRequestSupport() {
		System.out.println("这里是B的请求支援");
	}

	private boolean isSupport() {
		Random rand = new Random();
		return rand.nextBoolean();
	}
}
