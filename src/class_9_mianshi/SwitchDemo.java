package class_9_mianshi;

import java.util.Scanner;

/**
 * 
 * 
 * PrintCalendar 创建人:maerhuan 时间：2016年4月1日-下午9:13:31
 * 
 * @version 1.0.0
 * 
 */
public class SwitchDemo {
	public static void main(String[] args) {
		// 判断季节 可以利用switch case 的穿透来实现
		/**
		 * 12 1 2 冬季 3 4 5 春季 6 7 8 夏季 9 10 11 秋季
		 */
		// switch (key) {
		// case value:
		//
		// break;
		//
		// default:
		// break;
		// }
		// key 的数据类型可以是 byte short int String 枚举 char jdk1.7以后开始支持字符串
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个月份:");
		int month = scanner.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("当前" + month + "月份是冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("当前" + month + "月份是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前" + month + "月份是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前" + month + "月份是秋季");
			break;
		default:
			System.out.println("请输入一个正确的月份");
			break;
		}
	}
	//拓展 可以判断用户输入的月份有几天 闰年平年的判断
	//1 3 5 7 8 10 12 -----31
	//  4 6 9 11 ----30
	//闰年 29 平年 28
	//闰年的判断
	//if((years% 4 ==0 && year%100 != 0)|| year%400==0)
}
