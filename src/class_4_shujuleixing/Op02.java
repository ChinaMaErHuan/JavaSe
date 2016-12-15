package class_4_shujuleixing;
/**
 * 
 * 
 * Op02
 * 创建人:maerhuan 
 * 时间：2016年3月17日-下午8:18:12 
 * @version 1.0.0
 *
 */
public class Op02 {

	
	public static void main(String[] args) {
		
		//除法
		//1:除不尽的问题
		//2:整数相除一定用float接受才能得到你想要的结果。必须有一方在加上转成float类型
		//百分比的计算的时候一定要小心
		
//		int a = 9;
//		int b = 3;
//		System.out.println(a/b);
		
		
		
//		int a = 1;
//		long b = 3;
//		long ccc = a/b;
//		System.out.println(ccc);
//		
//		float c = (float)a/b;
//		System.out.println(a/b);
//		System.out.println(c);
//		
//		System.out.println(a/(b*1.0f));
//		
//		int c2 = 100;
//		float cc = 5f;		
//		System.out.println(cc/c2);
		
		
		//注意点：如果1/0是int类型，那么久报异常java.lang.ArithmeticException: / by zero
//		System.out.println(1/0);
		//注意点2：1.0/0---Infinity无穷大，在除法运算中，如果有一方是浮点型或者两方都是浮点型，其计算结构一定浮点型。
		//如果除数是0或者0.0都得到结构就是正无穷和负无穷。
		System.out.println(1.0f/0);
		System.out.println(-1/0.0);
		//第一：如果是两个byte short int long相除，得到结构如果是浮点数，小数位全部舍去保留整数部分
		//第二：如果是两个byte short int long除以0，等异常信息,那么久报异常java.lang.ArithmeticException: / by zero
		//看到异常就要立马明白，除数是0，要赶紧检查你的代码的逻辑出现0的地方在哪里。
		//第三：float.double除以0得到正无穷和负无穷。
		//在js中任何数除以0都是Infinity
		float aa = 12.55f;
		Object object = 1.2f/5.6f;
		System.out.println(object instanceof Float);//true
		/**
		 * 在除法中 如果是byte short int long 之间相除，除不尽的话就是0 要想得到正常的结果 必须将其中的一方
		 * 转化成float等	 			1/0	会报错 1/0.0 infitity
		 * 
		 * 在float等其他数据类型的出发中 有一方是float 结果就是float类型的 1.0/0 = infinity
		 *  1.0/0.0 = infinity float和double除以0是infinity
		 * 
		 * 
		 */
		
	}
}
