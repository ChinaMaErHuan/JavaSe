package class_25_neibulei;
/**
 * 方法内部类
 * Outter4</br>
 * 创建人:maerhuan </br>
 * 时间：2016年5月16日-下午1:24:28 </br>
 * @version 1.0.0
 *
 */
public class Outter4 {
	public void Test(){
		
		class Person{
			 String username = "maerhuan";
		}
		
		class Person2 extends Person{
			public void test(){
				System.out.println(username);
			}
		}
		
		Person2 p = new Person2();
		p.test();
	}
	public static void main(String[] args) {
		Outter4 o = new Outter4();
		o.Test();
	}
}
