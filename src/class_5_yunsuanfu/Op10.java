/**
 * Tm系统平台
 * JavaSe
 * class_5_yunsuanfu
 * Op10.java
 * 创建人:maerhuan 
 * 时间：2016年10月1日-下午3:11:42 
 * 2016Tm公司-版权所有
 */
package class_5_yunsuanfu;
public class Op10 {
	public static void main(String[] args) {
		
		int a = 10;
		float b = 10.0f;
		double c = 10.0d;
		Float aFloat = 128.0f;
		float bfloat = 128.0f;
		System.out.println(a==b &&b==c);//true
		
		Integer aInteger = 10;
		System.out.println(aInteger==a);//true
		System.out.println(aInteger.equals(a));//true
		System.out.println(aInteger.equals(b));//false
		System.out.println(aInteger.equals(c));//false
		
		Integer aInteger2 = 128;
		Integer aInteger3 = 128;
		int a2 = 128;
		System.out.println(aInteger2==a2);//true
		System.out.println(aInteger2==aInteger3);//false
		System.out.println(aInteger2.equals(a2));//true
		System.out.println(aInteger2.equals(aInteger3));//true
		System.out.println(aInteger2.equals(aFloat));//false
		System.out.println(aInteger2.equals(bfloat));//false
		
		
		
		
		
		/**
		 * ==比较的是内存地址和值  equals比较的是值
		 * 1.基础数据类型和基础数据类型比较 和数据类型无关 比较的是值  至相等就返回true
		 * 2.基础数据类型和封装数据类型比较,
		 * 
		 * 		1.比较符号是== 比较的也是值 和数据类型无关
		 * 		2.例如：Integer a = 10; int b= 10;float c =10.0f; 
		 * 		a.equals(b)//true;
		 * 		a.equals(c)//false
		 * 		同类型是真的 不同类型是假的 
		 * 
		 * 3.封装数据类型和封装数据类型的比较 
		 * 		1.如果是不同的封装数据类型比较 不可以用==比较  不会通过编译
		 * 		用equals比较的话 比较的是内存地址 返回false
		 * 		2.如果是相同的数据类型 值相等的情况下
		 * 			(1.)Integer Short Byte  Long 都有 自己的构造方法  有自己的常量池
		 * 			在不超过他们能承受的范围的情况下 用==比较就是true
		 * 			Integer a = 10;Integer b = 10;
		 * 			a.equals(b)//true a==b//true;
		 * 			Integer c = 128; 
		 * 			Integer d = 128;
		 * 			c.equals(d)//true  c==d;//false
		 * 			
		 * 			(2)针对于Float和Double则没有常量池 ==比较的是内存地址 即便是相同的值 内存地址不一样 返回false
		 * 			equals比较值 返回 true
		 */
		Byte byte1;
		Character character;
	}
}
