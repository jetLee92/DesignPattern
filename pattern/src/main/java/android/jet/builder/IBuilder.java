package android.jet.builder;

/**
 * @author liqisi
 * @description： 建造者父类
 * @date：2017/10/11
 */
public interface IBuilder {

	public void buildPart1();

	public void buildPart2();

	public Production build();

}
