/**
 * Tm系统平台
 * JavaSe
 * test
 * Num1.java
 * 创建人:maerhuan 
 * 时间：2016年10月12日-下午8:27:51 
 * 2016Tm公司-版权所有
 */
package test;
public class Num1 {
	String str2 = "aaa";
	char[] car = {'a','b','c'};
	public void change(String str,char[] g){
		str = "bbb";
		g[0] = 'g';
		
	}
	public static void main(String[] args) {
		 String a1 = "aaa";
		 String a2 = "aaa";
		String  a3 = a2;
		System.out.println(a1.equals(a3));
		System.out.println(a1==a2&& a2==a3);
		Num1 num1 = new Num1();
		num1.change(num1.str2,num1.car);
		System.out.println(num1.str2);
		System.out.println(num1.car);
		
		String aString = "123";
		String aString2 = "123";
		String aString3 = new String("123");
		String aString4 = new String("123");
		String aString5 = aString3;
		String a11 = "12";
		String a22 = "3";
		String  a33 = a11+a22;//拼接的是地址
		System.out.println(aString == aString2);//true
		System.out.println(aString == aString3);//false
		System.out.println(aString3 == aString4);//false
		System.out.println(aString == a33);//false
		System.out.println(a33 == aString3);//false
		System.out.println(aString5 == aString3);//true
		
		//为什么打印的是aaa
//		“在Java里面参数传递都是按值传递”这句话的意思是：按值传递是传递的值的拷贝，按引用传递其实传递的是引用的地址值，所以统称按值传递。
//		（2）：在Java里面只有基本类型和按照下面这种定义方式的String是按值传递，
//		其它的都是按引用传递。就是直接使用双引号定义字符串方式：String str = “Java私塾”;
	}
}
