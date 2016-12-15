package class_8_Array;



public class StringDemo {
	public static void main(String[] args) {
		//倒序输出
		//1.利用StringBuilder中的reverse方法
		String string = "123456789 asder";
		
		StringBuilder builder = new StringBuilder(string);
		String string2 = builder.reverse().toString();
		System.out.println(string2);
		//2.转换成char数组 循环输出
		char[] as = string.toCharArray();
		StringBuilder builder2 = new StringBuilder();
		for (int i = as.length-1; i >=0; i--) {
			builder2.append(as[i]);
		}
		System.out.println(builder2.toString());
	}

	
}
