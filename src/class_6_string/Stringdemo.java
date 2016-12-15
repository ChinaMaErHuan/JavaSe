package class_6_string;

/**
 * 
 * 
 * Stringdemo 创建人:maerhuan 时间：2016年3月24日-下午7:07:06
 * 
 * @version 1.0.0
 * 
 */
public class Stringdemo {
	public static void main(String[] args) {
		// String==字符串类型,用来接收一个连续字符的形式，字符数据类型是在编译的时候就确定了
		// 它是编译阶段会检查一次，是否存在。---因为字符串它属于大文本类型，
		// 存储在：字符串常量池

		// String str = "我是keke";
		 //String str1 = "我是keke";
		 //str1 = "woaini";
		 //System.out.println(str==str1);//false
		 //System.out.println(str1);

		String string = "我是keke";
		string = "我爱你";
		String string2 = string;
		System.out.println(string == string2);
		System.out.println(string);
		System.out.println(string2);
		//
//		 int a = 5;
//		 int b = a;
//		 a = 4;
//		 System.out.println(a+"=="+b);

		// 产生三个垃圾---字符串常量池里面的不能回收，但是它可以通过后面讲解的StringBuffer和StringBuilder去规避它
		String str1 = "我是keke";
		// String str2 = "我是"+"ke"+"ke";
		// System.out.println(str1==str2);//true

		/*
		 * 在链接sql的时候我们不允许 这么些 String sql = "select * from table a ";
		 * sql+="where id = 1"; sql+="where "因为这么做会产生垃圾 造成性能的影响
		 */

		String str3 = "我是";
		String str4 = "keke";
		String str5 = str3 + str4;
		String string33 = "我是"+"keke";
		System.out.println(str1 == str5);// false ?str5拼接的是地址 这是很冷门的
		System.out.println(str1==string33);
		System.out.println("hjkhjkl"+string33==str5);
		

		// springmvc
		final String str6 = "我是";
		final String str7 = "keke";
		final String str8 = str6 + str7;// 宏变量 减少内存垃圾的产生 强制在编译阶段就确定 写到常量池中
		System.out.println(str1 == str8);// true

		// JDK后面发明了StringBuffer和StringBuilder专门为了解决String的缺陷
		// append()

		StringBuffer buffer = new StringBuffer();// 开辟了字符串空间了
		buffer.append("select * from student ");
		buffer.append(" select * from student ");
		buffer.append(" select * from student ");
		buffer.append(" select * from student ");
		buffer.append(" select * from student ");
		String string3 = buffer.toString();// 最后塞到字符串常量池中使用完毕以后进行回收 虚拟机的垃圾回收制度
		System.out.println(string3);
		// StringBuilder 它是非线程安全的，==推荐用StringBuilder StringBuffer是线程安全的。
		// StringBuilder和StirngBuffer用法一样

		// String
		// 了解字符串的方法
		String string4 = "   	  5   20   0 5 20 0";// 其实是一种连续的char[]数组
		 //相当于 char []ss ={'我','爱','你','5','2','0'}
		 System.out.println(string4.length());//6

		// 常用的api方法
		// subString(beginindex,endindex) 截取字符串 含头不含尾 左开右闭
		// replace('','') 替换 不会把原来的字符串改变掉
		// replaceAll() 全部替换
		// split() 分割
		// indexOf() 查找 从左向右查找 找到第一个出现的字符 找到返回查找的那个字符出现的位置 没有就返回-1
		// lastIndexOf() 从右相左查找

		// System.out.println(string4.substring(1,2));
		// System.out.println(string4.replace('0', '1'));
		// String str5675= string4.replaceAll("5", "9");
		// String str5675= string4.replaceAll("\\d{2}", "9");

		// System.out.println(str5675);
		// System.out.println(string4.indexOf('我'));

		// trim()去掉左右空格
		// System.out.println(string4.trim());

		// 匹配
		// startWith();
		// endsWith();
		// contains();
		// 获得指定位置的字符和转成字符数组
		// System.out.println(string4.charAt(5));
		// charAt(int index)   toCharArray();
		// javascript 和 java写法几乎一摸一样，只不过java比javascript提供更加丰富而已
		// 你关于java字符串的处理，可以直接拿到javascript去使用
		// System.out.println("转小写:"+str4.toLowerCase());//转小写
		// System.out.println("转大写："+str4.toUpperCase());//转大写

		// String url="http://www.baidu.com";
		// System.out.println(url.startsWith("http://"));
		// System.out.println(url.endsWith("com"));
		// System.out.println(url.contains("bai"));

		String bank = " ";// 还是会开辟空间的
		System.out.println(bank.isEmpty());// false
		System.out.println(bank.trim().isEmpty());

		// String name = null ;
		// System.out.println(name.charAt(0));//Exception in thread "main"
		// java.lang.NullPointerException
		//
		// //分割
		// String str12 = "keke我xiaobai我shubiao";
		// String[] names =str12.split("我");
		// for (String string9 : names) {
		// System.out.println(string9);
		// }

		// //忽略大小写的对比 eqauls
		// String str14 = "abc";
		// String str15 = "ABC";
		// System.out.println(str14.toLowerCase().equals(str15.toLowerCase()));
		// System.out.println(str14.equalsIgnoreCase(str15));//忽视大小写的比较

		// substring--static
		// char[] cs ={'我','爱','你'};
		// String string44= String.copyValueOf(cs);
		// System.out.println(string44);
		//
		//
		//
		// //subString es7
		// String teString = String.format("我爱你%s%s", "keke","zhangsan");
		// System.out.println(teString);
		//
		//
		// //subString
		String string34 = "0123456789";
		// string34.substring(beginIndex) 截取到最后---substring(begin,length-1);
		// string34.substring(beginIndex, endIndex)//含头不含尾

		System.out.println(string34.substring(2));
		System.out.println(string34.substring(2, 4));
		//
		//
		// //concat()
		// String string5 = "Hello";
		// String string6 = string5.concat(string34);
		// System.out.println(string6);
		// System.out.println(string5);//原来的字符串没有变

		// valueof()
	int a = 10;
		String aString = String.valueOf(a);
		System.out.println(aString);
		System.out.println(aString instanceof String);

	}
}
