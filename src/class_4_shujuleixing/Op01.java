package class_4_shujuleixing;

public class Op01 {

	
	public static void main(String[] args) {
//		System.out.println(5/0.0);
//		System.out.println(-5/0.0);
//		System.out.println(5%0.0);
//		System.out.println(-5%0.0);
//		System.out.println(0%5.0);//0
//		System.out.println(0%0.0);//nan
		
//		char a='A';
//		char b='爱';
//		char c='你';
//		System.out.println(a+b+c);//wo---shiliu---jin---shijinzhi
		
		//从jdk1.7以后数据类型是可以接受二进制了。0b或者0B的组合01的形式都是二进制
//		int a = 10;
//		int b = 0b1010;
//		char c = 'A';
//		System.out.println(b+c);
		
		int a =10;
		int c =15;
		int d = a+c;
		System.out.println(d);
		
		
		int dd= 10+15;
		System.out.println(dd);
		
		byte c1 = 100;
		byte c2 = 120;
		
		short c3 = 20000; 
		short c4 = 20000;
		
		//
		int c5 = c3+c4;
		System.out.println(c5);
		
		int c53 = 10;
		
		int c6 = 10;
		float c7 = 12.5F;
		float c8 = c6+c7;
		System.out.println(c8);
		System.out.println(c6 * c7);
		System.out.println(c6 / c7);
	
		
		//+号算法符号，也是字符串的连接符放前面就先运算在拼接，放后面都是拼接。为了解决这个问题，最好用括号括起来。
		String string ="我"+"你"+(12.5+22.5)+"他";
		System.out.println(string);
		
		//减法和乘法，
		
		
	}
}
