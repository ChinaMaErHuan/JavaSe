package class_3_case;

import java.io.UnsupportedEncodingException;

/**
 * 
 * 
 * Case02
 * 创建人:maerhuan 
 * 时间：2016年3月13日-下午10:54:03 
 * @version 1.0.0
 *
 */
public class Case02 {
	/**
	 * 
	 * 判断一个字符串里面的字符数 有多少个数字 大写字母 小写字母
	 * ThirdClass
	 * 方法名: main
	 * 创建人:maerhuan 
	 * 时间：2016年3月13日-下午10:57:03 
	 * @param args void
	 * @exception
	 * @since 1.0.0
	 */
	public static void main(String[] args) {
		//char 0=48; 9 = 57 A=65 Z=90 a=97 z=122
		//在java中char单个字符最终都会转成int类型十进制，再转成二进制进行存储
		String string = "abcdefgABCDE0123456啊啊啊啊       +-+-";
		int numcount = 0;//定义数字计数器
		int capcount = 0;//定义大写字母计数器
		int lowcount = 0;//定义小写字母计数器
		int spcount = 0;//定义特殊字符计数器
		int chinesecount = 0;//定义汉子计数器
		for (int i = 0; i < string.length(); i++) {
			char a = string.charAt(i);
			if(a >= '0' && a <= '9'){//在这里 '0'也可以用48代替
				numcount++;
			} else if(a >= 'A' && a <= 'Z'){
				capcount++;
			}else if(a >= 'a' && a <= 'z'){
				lowcount++;
			}else if (isChineseChar(a)) {
				chinesecount++;
			}
			else {
				spcount++;
			}
		}
		System.out.println("数字的个数是:"+numcount);
		System.out.println("大写字母的个数是:"+capcount);
		System.out.println("小写字母的个数是:"+lowcount);
		System.out.println("特殊字符的个数是:"+spcount);
		System.out.println("汉子的个数是:"+chinesecount);
	}
	
	
	/**
	 * 
	 * 判断一个字符是否是汉字
	 * ThirdClass
	 * 方法名: isChineseChar
	 * 创建人:maerhuan 
	 * 时间：2016年3月13日-下午11:03:49 
	 * @param c
	 * @return boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isChineseChar(char c) {
		try {
			return String.valueOf(c).getBytes("UTF-8").length>1;
		} catch (UnsupportedEncodingException e) {
			
			return false;
		}
		
	}
}
