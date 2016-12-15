package class_25_neibulei;



/**
 * 成员内部类 (非静态内部类)---相当于一个类中的成员方法  静态内部类---相当于一个类中的静态方法
 * 
 * Outter</br> 创建人:maerhuan </br> 时间：2016年5月15日-下午10:09:21 </br>
 * 
 * @version 1.0.0
 * 
 */
public class Outter3 {
	public int age;
	public  static String username;

	// 非静态方法中，即可调用成员变量和静态变量
	public void say() {
		System.out.println(this.age + "===" + Outter3.username);
	}

	// 静态方法中只能调用静态成员
	public static void message() {
		System.out.println(Outter3.username);
	}
	
	
	//成员内部类可以共享外部类的所有的属性和方法  外部类不能直接访问内部类的东西的
	public static class Inner{
		public String username;
		public  void test(){
			System.out.println(Outter3.username+"=="+this.username);
		}
	}
	
}
