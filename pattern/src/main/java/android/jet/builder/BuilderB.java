package android.jet.builder;

/**
 * @author liqisi
 * @description： 法拉利的builder类
 * @date：2017/10/11
 */
public class BuilderB implements IBuilder {

	private Production production = new Production();

	@Override
	public void buildPart1() {
		System.out.println("构造法拉利的第一部分。");
		production.setPart1("This is part1 of Ferrari");
	}

	@Override
	public void buildPart2() {
		System.out.println("构造法拉利的第二部分。");
		production.setPart2("This is part2 of Ferrari");
	}

	@Override
	public Production build() {
		System.out.println("咻咻！法拉利已造好！");
		return production;
	}
}
