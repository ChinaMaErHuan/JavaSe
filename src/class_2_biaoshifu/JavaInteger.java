package class_2_biaoshifu;
/**
 
 * JavaInteger
 * 创建人:maerhuan 
 * 时间：2016年3月13日-下午7:55:09 
 * @version 1.0.0
 *
 */

public class JavaInteger{
	private static int age = 30 ;
	/**
	 *(这里用一句话来描述这个方法的作用)
	 * SecondClass
	 * 方法名: main
	 * 创建人:maerhuan 
	 * 时间：2016年3月13日-下午8:21:39 
	 * @param args void
	 * @exception
	 * @since 1.0.0
	 */
	public static void main(String[] args){
		/*
			我们为什么在开发中都推荐使用int类型，而不是long也不是short呢.
			在业务的开发过程，我们难免会遇到算术运算。+，- * /


			
		*/

		byte a = 100;
		byte b = 110;

		int c = a * b;

		short d = 470;
		short e = 10;

		int ff = d + e;
		long fff = d + e;
		float fff2 = d + e;
		float fff3 = d + e;

		
		print(c);
		print(ff);
		print(fff);
		print(fff2);
		print(fff3);
	
	}


	public static void print(Object message){
		System.out.println("打印的结果是："+message);
	}
}
