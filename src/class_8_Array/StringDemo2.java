package class_8_Array;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * 
 * StringDemo2 创建人:maerhuan 时间：2016年3月28日-下午9:26:24
 * 
 * @version 1.0.0
 * 
 */

public class StringDemo2 {
	/**
	 * 
	 * 反转词 i love you 变 you love i Eight 方法名：main 创建人：maerhuan
	 * 时间：2016年3月28日-下午9:07:31
	 * 
	 * @param args
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public static void main(String[] args) {
		//这个要求是倒序输出字符串
		//倒序输出还有其他的方式 就是集合
		// String string = "mehlove his family";
		// String [] strings = string.split(" ");
		String string = "meh&han  #   love   ###his ##family";
		String[] strings = string.split("\\s|#|&");// 正则|是条件 多个条件
		 for (String string2 : strings) {
		 System.out.print(string2);
		 }


		List<String> list = Arrays.asList(strings);
//		List<String> list = new ArrayList<String>();  
//	    list = Arrays.asList(strings);  
		Collections.reverse(list);
		StringBuilder builder = new StringBuilder();
		for (String string2 : list) {
			builder.append(string2 + " ");
		}
		System.out.println(builder.toString());
	}
}
