package class_8_Array;

/**
 * 
 * 
 * IntegerDemo 创建人:maerhuan 时间：2016年3月28日-下午7:49:05
 * 
 * @version 1.0.0
 * 
 */
public class IntegerDemo {
	/**
	 * 
	 * 复习下之前学的数据类型的比较 Eight 方法名：main 创建人：maerhuan 时间：2016年3月28日-下午7:49:20
	 * 
	 * @param args
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public static void main(String[] args) {

		// 基础数据--值传递 *--不会回收
		// 引用数据类型-引用传递--对象new，数组和字符串常量池都是存放于堆里面--gc
		// null 是不属于类型，空类型--所有引用数据类型都指向它，是引用类型和对象的默认值

		// Object--所有的对象的顶级父类是Object
		/*
		 * 判断一个变量是不某种数据类型可以通过instanceof去判断 格式：数据类型变量 instanceof 数据类型或者它的父类
		 * 都会返回true,否则false
		 */
		Integer aInteger = 10;
		Integer aInteger2 = 10;
		System.out.println(aInteger == aInteger2);

		Integer aInteger3 = -128;
		Integer aInteger4 = -128;
		System.out.println(aInteger3 == aInteger4);

		Integer aInteger5 = 127;
		Integer aInteger6 = 127;
		System.out.println(aInteger5 == aInteger6);

		Integer aInteger7 = 300;
		Integer aInteger8 = 300;
		System.out.println(aInteger7 == aInteger8);

		/*
		 * public static Integer valueOf(int i) { if (i >= IntegerCache.low && i
		 * <= IntegerCache.high) return IntegerCache.cache[i +
		 * (-IntegerCache.low)]; return new Integer(i); }
		 */

		Float aFloat = 10.0f;
		Float aFloat2 = 10.0f;
		System.out.println(aFloat == aFloat2);

		// 还是总结一次:
		/*
		 * 1.基础数据类型的比较 值相等就返回true和数据类型无关 2.基础数据类型和封装数据类型的比较 同上
		 * 但是封装数据类型.equals()比较的时候 相同类型就是true否则false 3.封装数据类型的比较 1.不同了类型的比较
		 * equals返回false 不能用== 比较 不会编译 2.相同数据类型的比较 equals返回true ==比较的情况下
		 * 如果是Integer,Byte,Short，Long,Character比较的话 值在[-128,127]就返回true
		 * 否则返回false 原因是这些数据类型都有都对没有超过byte数据类型的值进行了一个缓存。见上面的代码
		 * Double,Float就返回false ==比较的是内存地址
		 */

		// 如果是String的话有一个缓存池 ==比较值一样就会返回true
		String str1 = "我是keke";
		String str3 = "我是";
		String str4 = "keke";
		String str5 = str3 + str4;
		System.out.println(str1 == str5);// false ?str5拼接的是地址 这是很冷门的

	}
}
