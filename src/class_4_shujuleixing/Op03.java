package class_4_shujuleixing;
public class Op03 {

	
	public static void main(String[] args) {
		
		int a = 9; 
		float b = 7f;//如果整型f省去，但是如果是小数一定要加f或者F.为了统一起见都是F
		System.out.println(a/b);//类型是:float
		
		
		//取余数--除过程  % 分子%分母的结果一定<=分母-1;
//		System.out.println(5%2);//1
//		System.out.println(5/2);//2
		
//		System.out.println(5%0.0);//NaN
//		System.out.println(-5%0.0);//NaN
//
//		
//		System.out.println(5%0);//NaN

		//重点1：如果一个数字能整除，直接
//		System.out.println(1000%20);//0
//		//重点2：如果除数（分母）比被除数(分子)大，直接结构就是被除数（分子） 
		//重点3：如果分子是负数，那么结构是就负数，如果父母是负数分子是整数结构是正数。如果都是负数其结构就是负数
		//结果取决于分子
//		System.out.println(9%7);//2
//		System.out.println(7%9);//7
//		System.out.println(777%999);//777
//		System.out.println(100%1000);//100
//		System.out.println(-9%7);
//		System.out.println(-998%-999);//-998
		
		
		System.out.println(-9%-7);//-2
		System.out.println(-9/-7);//1
		System.out.println(-9*-7);//63
		
		System.out.println(-1+-1);//-2
		System.out.println(-1-1);//-2
		System.out.println(-(1-1));//0		
		System.out.println((4*8*2)%8);//0
	}
}
