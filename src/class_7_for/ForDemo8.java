package class_7_for;
/**
 * 
 * 
 * ForDemo5
 * 创建人:maerhuan 
 * 时间：2016年3月27日-下午1:58:35 
 * @version 1.0.0
 *
 */
public class ForDemo8 {
	public static void main(String[] args) {
		//break 跳出循环
		//continue; 跳出本次循环 执行循环
		String []nameStrings = {"小王","小二","小张","小梦","mini","vicky"};
		for (int i = 0; i < nameStrings.length; i++) {
			if(i == 2) continue;
			if(nameStrings[i].equals("mini")) break;
			System.out.println(nameStrings[i]+"买票准备回家");
		}
		
		System.out.println("=========================");
		//jdk1.5以后增强for循环 缺点是没有索引
		//int k=0;
		for (String name : nameStrings) {
			System.out.println(name+"买火车票，回家");
			//k++;
		}	
	}
}
