package toolsUtils.StringUtils;

import java.io.UnsupportedEncodingException;

/**
 * 
 * 
 * CutString 创建人:maerhuan 时间：2016年4月4日-下午4:59:00
 * 
 * @version 1.0.0
 * 
 */
public class CutString {
	/**
	 * 
	 * 判断一个字符是否是汉字 toolsUntils 方法名：isChinese 创建人：maerhuan 时间：2016年4月4日-下午5:01:00
	 * 
	 * @param c
	 * @return
	 * @throws UnsupportedEncodingException
	 *             boolean
	 * @exception
	 * @since 1.0.0
	 */
	public static boolean isChinese(char c) throws UnsupportedEncodingException {
		return String.valueOf(c).getBytes("UTF-8").length > 1;
	}

	/**
	 * 截取字符串 toolsUntils 方法名：subString 创建人：maerhuan 时间：2016年4月4日-下午5:10:56
	 * 
	 * @param orignal
	 * @param count
	 * @return
	 * @throws UnsupportedEncodingException
	 *             String
	 * @exception
	 * @since 1.0.0
	 */
	public static String subString(String orignal, int count)
			throws UnsupportedEncodingException {
		// 要截取的字符串不为空 不是null字符串
		if (orignal != null && !"".equals(orignal)) {
			// 设置编码方式
			orignal = new String(orignal.getBytes(), "UTF-8");
			// 要截取的字节数>0 &&小于字符串的字节数
			if (count > 0 && count < orignal.getBytes("UTF-8").length) {
				StringBuilder builder = new StringBuilder();
				char c;
				for (int i = 0; i < count; i++) {
					c = orignal.charAt(i);
					builder.append(c);
					if (CutString.isChinese(c)) {
						--count;
					}

				}
				return builder.toString();
			}

		}
		return orignal;
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		  String string = "我是马er欢";
		  System.out.println(CutString.subString(string, 2));
		  System.out.println(CutString.subString(string, 4));
		  System.out.println(CutString.subString(string, 6));
		  System.out.println(CutString.subString(string, 7));
		  System.out.println(CutString.subString(string, 8));
		 
	}
}
