package class_5_yunsuanfu;
/**
 * 
 * 
 * Op7
 * 创建人:maerhuan 
 * 时间：2016年3月23日-下午9:46:04 
 * @version 1.0.0
 *
 */
public class Op7 {
	public static void main(String[] args) {
		Integer a = 10;
		int c = a.intValue();
	
		//转换成字符串
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(c);
		System.out.println(str1+"====="+str2);
		
		//数字字符串
		String str = "100";
		Integer numInteger = Integer.valueOf(str);
		int num2 = Integer.parseInt(str);
		int num3 = numInteger.intValue();
		System.out.println(numInteger+"===="+num2+"===="+num3);
		
		
		Integer numInteger2  = Integer.valueOf(str);
		Integer numInteger3  = Integer.parseInt(str);
		Integer numInteger4  = numInteger.intValue();
		System.out.println(numInteger2);
		System.out.println(numInteger3);
		System.out.println(numInteger4);
	}
}
