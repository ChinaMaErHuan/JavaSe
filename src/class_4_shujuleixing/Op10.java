package class_4_shujuleixing;
public class Op10 {
	
	public static void main(String[] args) {
	
		//位运算符 7个--计算
		// >> 
		// >>> 
		// <<
		// & 按位&,如果两个同时为1返回就是1，其他都是0
		// | 按位或 如果有一位是1 那么就是1 ，其他都是0
		// ^ 按位异或, 两个相同的时候 0 不同时返回1  11 0 00 0   /10 =1
		// ~ 按位非，单数字取反 对补码进行取反，包含符号 ~n = (n+1)、~-n = (n-1)
		//快速计算一个数字想要得到结果，最终都是以二进制的方式进行计算.
		//千万不要把看做是一个十进制了，你应该都二进制
		//1:想要把他们转成二进制在进行比较。
		
		
//		所谓原码就是二进制定点表示法，即最高位为符号位，“0”表示正，“1”表示负，其余位表示数值的大小。
//
//		反码表示法规定：正数的反码与其原码相同；负数的反码是对其原码逐位取反，但符号位除外。
//		原码10010= 反码11101 （10010，1为符号码，故为负）
//		(11101) 二进制= -2 十进制
//		补码表示法规定：正数的补码与其原码相同；负数的补码是在其反码的末位加1。
		
//		System.out.println(15 & 9);//9
//		System.out.println(15 | 9);//15
//		System.out.println(15 ^ 9);//6
//		System.out.println(24 ^ 3);//6
//		System.out.println(~1);//6
//		System.out.println(0B0101 & 0B1001);
		
		
		
//		System.out.println("====十进制转其他进制");
//		System.out.println(Integer.toString(15, 2));
//		System.out.println(Integer.toString(9, 2));
//		System.out.println(Integer.toString(24, 2));
//		System.out.println(Integer.toString(3, 2));
		
		
		// >> 右移动 如果是正数：往前面加0，后面舍去（移除）
		
		
		// >>> 无符号右移动
		
		
		// <<  左移动,二进制整个往左边移动两位，空白位用0填充。
		
//		System.out.println(5<<3);//40
//		System.out.println(~-5);//4
//		System.out.println(-5<<3);//4
		
		
//		System.out.println(15>>4);//4
//		System.out.println(-32>>4);//4
		
		System.out.println(-64>>4);//4
		
		
//		源码： 1000 0000 0100 0000
//		反码    1111 1111 1011 1111  
//      补码: 1111 1111 1111 1100 
//      反码     1000 0000 0000 0011		
		
		
		
		
//		原码：1000 0000 0000 0000 0000 0000 0000 0101 
//		反码：1111 1111 1111 1111 1111 1111 1111 1010 对源码，1则0 0则1 符号不动
//		补码：1111 1111 1111 1111 1111 1111 1111 1011 补码就是对反码加末尾1
		//~5对补码全部取反，包括符号位： ~ n= ~(n+1);
//			 0000 0000 0000 0000 0000 0000 0000 0100 ==4 
//		反码：1000 0000 0000 0000 0000 00010 0100 对源码，1则0 0则1 符号不动 
		
		
		
		
		
		
	}
}
