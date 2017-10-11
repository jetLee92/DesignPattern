package android.jet.builder;

/**
 * @author liqisi
 * @description： 导演者角色
 * @date：2017/10/11
 */
public class Director {

	private IBuilder builder;

	public Director(IBuilder builder){
		this.builder = builder;
	}

	/**
	 * 构造顺序
	 */
	public Production construct(){
		builder.buildPart1();
		builder.buildPart2();

		return builder.build();
	}

}
