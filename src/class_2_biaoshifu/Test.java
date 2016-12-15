package class_2_biaoshifu;

/**
 * tzdesk系统平台
 * Tz_JavaSe
 * 
 * Test.java
 * 创建人:xuchengfei 
 * 时间：2016年3月11日-上午12:53:32 
 * 2016潭州教育公司-版权所有
 */

/**
 * 
 * Test
 * 创建人:maerhuan
 * 时间：2016年3月11日-上午12:53:32 
 * @version 1.0.0
 * 
 */
public class Test {

	public static void main(String[] args) {
		//都是什么进制转成十进制
//		System.out.println(Integer.parseInt("013", 8));
//		System.out.println(Integer.parseInt("ff", 16));
//		System.out.println(Integer.parseInt("ffff", 16));
//		System.out.println(Integer.parseInt("1010", 2));
//		
//		System.out.println("====十进制转其他进制");
//		String c = Integer.toString(110, 2);//十进制转二进制
//		String c2 = Integer.toString(120, 8);//十进制转八进制
//		String c3 = Integer.toString(130, 16);//十进制转十六进制
//		String c4 = Integer.toString(140, 10);
//		System.out.println(c);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
		
		
//		int b = Integer.parseInt("013",8);//十进制
//		String c = Integer.toString(b, 16);
//		System.out.println(c);
		
//		System.out.println(eto16("013"));
//		System.out.println(eto162("0xab897"));
		
		int ccc = 0B101010110;
		float c = 3.14_787_878_787f;
		System.out.println(ccc);
		
		String b = "1010111";
		System.out.println("二进制转十六进制==="+eto165(b));
		System.out.println("十六进制转二进制==="+eto163(eto165(b)));
		System.out.println("二进制转八进制==="+eto166(b));
		System.out.println("八进制转二进制==="+eto162(eto166(b)));
		System.out.println("八进制转十六进制==="+eto16(eto166(b)));
		
	}
	
	
	//二进制转十六进制
	public static String eto165(String b){
		int bc = Integer.parseInt(b,2);
		//十进制----parseInt(进制数字，radix);//radix告诉进制数字是进制----转成，十进制
		//Integer.parseInt(进制数字，radix)===将某一种进制转换成十进制
		String c = Integer.toString(bc, 16);
		return c;
	}
	
	//二进制转八进制
	public static String eto166(String b){
		int bc = Integer.parseInt(b,2);
		//十进制----parseInt(进制数字，radix);//radix告诉进制数字是进制----转成，十进制
		//Integer.parseInt(进制数字，radix)===将某一种进制转换成十进制
		String c = Integer.toString(bc, 8);
		return c;
	}
	
	//八进制转十六进制
	public static String eto16(String b){
		int bc = Integer.parseInt(b,8);//十进制
		String c = Integer.toString(bc, 16);
		return c;
	}
	
	//八进制转二进制
	public static String eto162(String b){
		int bc = Integer.parseInt(b,8);//十进制
		String c = Integer.toString(bc, 2);
		return c;
	}
	
	//十六进制转二进制
	public static String eto163(String b){
		int bc = Integer.parseInt(b,16);
		//十进制----parseInt(进制数字，radix);//radix告诉进制数字是进制----转成，十进制
		//Integer.parseInt(进制数字，radix)===将某一种进制转换成十进制
		String c = Integer.toString(bc, 2);
		return c;
	}
	
	
	//十六进制转10进制
	public static String eto164(String b){
		int bc = Integer.parseInt(b,16);//十进制
		return bc+"";
	}
}

