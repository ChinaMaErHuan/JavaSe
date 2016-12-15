package class_3_case;

import java.io.UnsupportedEncodingException;

/**
 * 
 * Case04</br>
 * 创建人:maerhuan </br>
 * 时间：2016年10月1日-上午1:04:47 </br>
 * @version 1.0.0
 *
 */
public class Case04 {
	public static void main(String[] args) {
		char c='d'; 	
		System.out.println(isChineseChar(c));		
	}
	public static boolean isChineseChar(char c) {
		try {
			return String.valueOf(c).getBytes("UTF-8").length > 1;
		} catch (UnsupportedEncodingException e) {
			return false;
		}
	}
}
