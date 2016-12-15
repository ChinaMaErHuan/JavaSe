package class_21_abstractlei;
public interface IUserDao {
//
	
	/*
	 * 常量(final)，和抽象方法，枚举
	 * 
	 * 修饰符的范围：public 和缺省
	 * protected在接口里不能用
	 */
	public static final int AGE =10;
	public final static  String USERNAME="maerhuan";
	
	
	
	
	//所有的方法都是抽象方法
	//1：接口里只能包含抽象方法，静态方法和默认方法，不能为普通方法提供方法实现，抽象类可以有普通方法提供方法实现。没有方法体
	public  void test();//jdk会默认给你的方法加上abstract  
	void sayHello();
	abstract void message();
	
	//jdk1.8能在接口里定义 静态方法  默认方法
	
	
	
}
