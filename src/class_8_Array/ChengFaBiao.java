package class_8_Array;

import java.util.Scanner;

/**
 * 
 * 
 * ChengFaBiao
 * 创建人:maerhuan 
 * 时间：2016年3月28日-下午8:15:13 
 * @version 1.0.0
 *
 */
public class ChengFaBiao {
	/**
	 * 
	 * (这里用一句话描述这个方法的作用)
	 * Eight 
	 * 方法名：main
	 * 创建人：maerhuan 
	 * 时间：2016年3月28日-下午8:15:36 
	 * @param args void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void main(String[] args) {
		/*
		 * 输入一个大于4小于20的数字，
		 * 然后打印对应乘法表,
		 * 条件：如果输入的数字不满足，继续输入，直到满足位置.
		 * 知识点：for/while 和 continue的用法 ,Scaner
		 * */
		//断点调试:f5近方法 f6逐条执行 f8释放
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字[4,20]:");
		int num = scanner.nextInt();
		while (num<4||num>20) {
			System.out.println("请输入一个数字：范围在[4-20之间]:");
			num =scanner.nextInt();//继续输入
			continue;
		}
		System.out.println("乘法表如下:");
		ChengfaBiaoUtil.chengfa(num);
	}
	

}
