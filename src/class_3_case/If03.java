package class_3_case;

import java.util.Scanner;

/**
 * If03
 * 创建人:maerhuan 
 * 时间：2016年3月14日-上午12:21:37 
 * @version 1.0.0
 *
 */
public class If03 {
	public static void main(String[] args) {
		 System.out.println("请输入你的年龄:");
		 int age = new Scanner(System.in).nextInt();
		 if(0<=age &&  age<=16){
				System.out.println("青年");
			}else if(17<=age && age<=35){
				System.out.println("壮年");
			}else if(36<=age && age<=50){
				System.out.println("中年");
			}else{
				System.out.println("老年");
			}
	}
}
