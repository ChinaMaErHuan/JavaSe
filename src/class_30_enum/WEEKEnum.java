package class_30_enum;

/**
 * 枚举类： JDK1.5以后新增了enum关键字，用来定义枚举类，枚举类是一种特殊的类，
 * 它可以定义成员变量，方法，可以实现一个或者多个接口，也可以定义自己的构造器
 * 
 * 它不能继承具体的类，和抽象类，但是可以实现接口，（多实现接口） 它不能直接实例化对象，必须通过valueof实现具体的对象 它有成员变量。和成员方法。
 * 它的父亲是：Enum 而不是Object
 * 
 * WEEKEnum</br> 创建人:maerhuan </br> 时间：2016年5月24日-下午5:57:45 </br>
 * 
 * @version 1.0.0
 * 
 */
public enum WEEKEnum {
	WEEK_Sunday("星期日"), 
	WEEK_Monday("星期一"),  
	WEEK_Tuesday(" 星期二"), 
	WEEK_Wednesday(" 星期三"), 
	WEEK_Thursday("星期四"),  
	WEEK_Friday("星期五"),
	WEEK_Saturday("星期六") ;

	private String nameString;
	private  WEEKEnum(String name){
		this.nameString = name;
	}

	public String getNameString() {
		return nameString;
	}

	

}
