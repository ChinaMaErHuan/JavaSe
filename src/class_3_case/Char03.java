package class_3_case;
public class Char03 {
public static void main(String[] args) {
		
		//char有一些特殊字符，专门给我字符串提供换行，回车，单引号
		//char中的转衣符\，专门来处理字符串中的特殊符号。
		
		/**
		 * 
		 * \n:换行符
		 * \r:回车符
		 * \t:table键盘
		 * \b:退格符
		 * \' 打印 '
		 * \" 打印:"==json转换的时候就用它
		 */
		String string = "我今天心\t情不错，\"嘿嘿\",我也\n\r挺好的 ";
		System.out.println(string);
		String string2 = "我今天心	情不错，\"嘿嘿\",我也\r\n挺好的 ";
		System.out.println(string2);
		
	}
	
	/**
	 * 打印方法
	 * Administrator
	 * com.tz.java03 
	 * 方法名：console
	 * 创建人：xuchengfei 
	 * 时间：2016年3月12日-下午10:42:07 
	 * 手机：15074816437
	 * @param message void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void console(Object message){
		System.out.println(message);
	}
}
