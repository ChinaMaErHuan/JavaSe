package class_14_lei_static;
/**
 * 
 * 
 * StaticDemo
 * 创建人:maerhuan 
 * 时间：2016年4月24日-下午4:09:56 
 * @version 1.0.0
 *
 */
public class StaticDemo {
	private static int age=10;
	private int num = 20; 
	
	public static void getAge(){
		
		System.out.println(StaticDemo.age);
	}
	public void getAge2(){
		System.out.println(StaticDemo.age);
		System.out.println(this.num);
	}
	//访问修饰符，spuer 一定要有继承的关系下才有意义。
	
	/*
	 * 属性和方法
	 *  
	 * 方法修饰符[private publie protected 缺省的]   修饰词(static ,final ,transient,volatile)   数据类型  = 字面值
	 * 
	 * 方法修饰符   修饰词   数据类型  = 字面值
	 *  
	 * 在一个类中，
	 * 属性和方法中又分为两种情况
	 * 
	 * 	静态成员和非静态成员
	 * static是不允许用来修饰局部变量。static不用new对象就可以使用了 就为了方便的调用  static属性方法 不可以调用
	 * 非静态的   被static修饰的东西只加载一次 不会被回收
	 * 
	 *  静态成员是属性---类本身的,不属于对象=--共享属性和方法
	 *  静态成员一定要静态方法中使用
	 *  
	 *  总结：
	 *  非静态方法即可调用静态成员，也可以调用非静态元素
	 *  静态方法中只能给你调用静态成员
	 *  
	 *  静态方法不允许被覆盖成非静态方法
	 *  
	 * */
	public static void main(String[] args) {
		StaticDemo.getAge();
		System.out.println(age);
		
	}
}
