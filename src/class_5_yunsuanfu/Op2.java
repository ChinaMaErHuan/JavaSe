package class_5_yunsuanfu;

/**
 * 
 * 
 * Op2 创建人:maerhuan 时间：2016年3月22日-上午12:00:25
 * 
 * @version 1.0.0
 * 
 */
public class Op2 {
	public static void main(String[] args) {
		// 比较运算符里面 == ！= 返回值都是boolean类型，用于逻辑判断和循环中
		// >= <= > < 一定只能够是数值类型，(char)
		boolean cass = 'a' < 66;
		System.out.println(cass);
		// System.out.println((int)'a');
		// System.out.println((char)97);

		// == 数组比较，基础数据类型比较如果值相等返回的都是true,和数据无关。
		// 看见字符型---ascii--看成数字
		// int a =5;
		// float b=5.0f;
		// double c = 10d/2;
		// System.out.println(a==b);
		// System.out.println(a==c);
		// System.out.println(b==c);
		// System.out.println('0'== 48);

		// 引用数据类型--面向对象设计的数据类型---把成一类的方式存在，它们不能扩展，绝种的。没有子类。
		// 整型：Byte Short Integer Long
		// 浮点型:Float Double
		// 字符型：Character
		// 布尔型：Boolean

		// 两个特殊：int == Integer char == Character
		// 其他的都是将首字母改成大写。

		// 基础数据类型和封装数据类型的区别：

		// 基础数据类型它值一种数据结构而已，他定义都是在堆内存中的,
		// 封装数据类型它是一个类，它有方法和属性，供封装数据调用和转换,提供很多方法可以转换成基础数据类型。
		// 封装数据他的原理还是基础数据类型，只不过它是一个常量类型的基础数据类型,通过他的构造函数你就可以发现它是一个常量

		// 1:引用数据类型和基础数据类型比较 或者是基础数据类型之间的比较 它们值比较相同都是true,比较都是 ==
		// 2:如果两个不一样类型的引用数据类型比较，那么就不用==而用equals比较
		// 3.如果是两个一样的引用数据类型比较
				// 1.==比较的是内存地址
				// 2.equals()比较的是值
		int aa = 5;
		Integer bb = 5;
		Float cc = 5.0f;
		float dd = 5.0f;
		System.out.println(aa == bb);// true
		System.out.println(aa == dd);// true
		System.out.println(aa == cc);// true
		// System.out.println(bb == cc);不会通过编译语法错误
		System.out.println(bb.equals(cc));// false 
		System.out.println(bb == dd);// true
		System.out.println(cc == dd);// true

		// 只有引用数据类型才可以调用equals()等方法
		// Float ccc=10.0f;
		// Float ddd =10.0f;
		// System.out.println(ddd==ccc);//内存地址比较 false
		// System.out.println(ddd.equals(ccc));//值比较 true
	}
}
