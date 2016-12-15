package class_5_yunsuanfu;

/**
 * 
 * 
 * Op6 创建人:maerhuan 时间：2016年3月23日-上午10:53:36
 * 
 * @version 1.0.0
 * 
 */
public class Op6 {
	public static void main(String[] args) {
		// 拆箱与装箱
		// 封装数据类型和基础数据类型之间的转换

		// 相同类型之间可以转换
		Integer a = 10;
		int b = a;
		System.out.println(b);// 10
		Integer cInteger = new Integer(b);
		System.out.println(cInteger);// 10
		//
		int a4 = 5465;
		Integer b4 = a4;
		System.out.println(b4);

		// Float()比较特殊的构造函数
		// new Float(float c);
		// new Float(double d);

		// 基础数据类型转换成封装数据类型
		// ？？？为什么学习

		// 数据类型和字符串之间的关系
		int aa = 10;
		String bb = String.valueOf(aa);
		System.out.println(bb instanceof String);// true

		Integer wwInteger = 10;
		String bString = String.valueOf(wwInteger);
		System.out.println(bString instanceof String);// true

		// 字符串转Integer
		String cc = "102";
		Integer aInteger = new Integer(cc);
		System.out.println(aInteger);
		System.out.println(aInteger instanceof Integer);//true

		// 字符串转int 如果没有封装数据类型的话 字符串不可能转换成基础数据类型
		String string = "103";
		int a2 = Integer.parseInt(string);// 返回的是int类型
		System.out.println(a2);

		// 字符串转换成Integer
		String string2 = "56";
		Integer a3 = Integer.valueOf(string2);// 返回的是包装类Integer
		System.out.println(a3);
		System.out.println(a3 instanceof Integer);// true

		String string3 = "46556";
		int a6 = Integer.valueOf(string3);
		System.out.println(a6);
		// 这样写也是没错误的 因为 Integer和int可以相互转化 这句代码里面存在着隐式转化 不过最好的是根据方法来 返回的是Integer就用Integer接受
		//数据类型转换---struts2 springmvc--数据类型转换
		//Float Double Boolean Char Long Byte Short同理

		/**
		 * static int parseInt(String s) 将字符串参数作为有符号的十进制整数进行分析。
		 * 
		 * static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。 static
		 * Integer valueOf(String s) 返回保持指定的 String 的值的 Integer 对象。
		 * 
		 * 从返回值可以看出他们的区别 parseInt()返回的是基本类型int 而valueOf()返回的是包装类Integer
		 * Integer是可以使用对象方法的 而int类型就不能和Object类型进行互相转换
		 * 
		 * int zhuan=Integer.parseInt(chuan); int
		 * zhuanyi=Integer.valueOf(chuan); 为什么你的程序返回值都可以用int来接收呢？
		 * 因为Integer和int可以自动转换 Integer i = 5; int k = i;像是这样表示是没有编译错误的
		 */
		String string4 = "111 ";//注意 这里有空格 
		int c = Integer.parseInt(string4.trim());
		System.out.println(c);
		//或者封装一个方法
		String string5 = "1111 ";
		int ccc = parseInt(string5);
		System.out.println(ccc);
		
	}
	public static Integer parseInt(String num) {
		return Integer.valueOf(num.trim());
	}
}
