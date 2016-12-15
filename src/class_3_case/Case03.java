package class_3_case;

import java.io.UnsupportedEncodingException;

/**
 * 
 * 
 * Case03
 * 创建人:maerhuan 
 * 时间：2016年3月13日-下午11:28:22 
 * @version 1.0.0
 *
 */
public class Case03 {
	
	public static void main(String[] args) {
		
//		48<=a<=57//数字
//		65<=a<=90//大写字母
//		97<=a<=122//小写字母
//      其他的都是特殊字符（标点符号，空格等等...）
//      中文?
		
		String string = "123456abcABCd,    +-2323";
		for (int i = 0; i < string.length(); i++) {
			char a = string.charAt(i);
//			如果 a是大于等于48并且a是小于等于57==数字
			if(48<=a && a<=57){
				System.out.println("数字=="+a);
			}else if(65<=a && a<=90){
//			如果 a是大于等于65并且a是小于等于90==大写字母
				System.out.println("大写=="+a);
			}else if(97<=a && a<=122){
//			如果 a是大于等于97并且a是小于等于122==小字母
				System.out.println("小字母=="+a);
			}else{
//			否则 其他符号.
				System.out.println("其他符号"+a);
			}
		}
	}
	
	
	/**
	 * 判断一个字符是不是中文
	 * Administrator
	 * com.tz.java03 
	 * 方法名：isChineseChar
	 * 创建人：maerhuan 
	 * 时间：2016年3月12日-下午11:37:46 
	 * 手机：15074816437
	 * @param c
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public static boolean isChineseChar(char c){
		try {
			return String.valueOf(c).getBytes("UTF-8").length > 1;
		} catch (UnsupportedEncodingException e) {
			return false;
		}
	}
}
