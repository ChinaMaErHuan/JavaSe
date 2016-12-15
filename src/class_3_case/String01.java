package class_3_case;
/**
 * 
 * 
 * String01
 * 创建人:maerhuan 
 * 时间：2016年3月13日-下午9:44:00 
 * @version 1.0.0
 *
 */

public class String01 {
	public static void main(String[] args) {
		String string = "abcdefghijklmn";
		System.out.println(string.length());
		System.out.println(string.charAt(7));
		System.out.println(string.charAt(string.length()-1));
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
	}
	
}
