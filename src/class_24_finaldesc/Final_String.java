package class_24_finaldesc;
public class Final_String {
	public static void main(String[] args) {
		String str1 = "我爱你haha";
		String str2 = "我爱你";
		String str3 = "haha";
		String str4 = str2+str3;//拼接的是地址 冷门
		System.out.println(str1 == str4);//false
		
		
		//宏变量 减少垃圾的产生  联想字符串常量池
		 String str11 = "我爱你haha";
		final String str22 = "我爱你";
		final String str33 = "haha";
		final String str44 = str22+str33;
		System.out.println(str11 == str44);//true
		
		//
		String str5 = "ma"+"er"+"huan";
		String str6 = "maerhuan";
		String str7 = "maerhuan";
		System.out.println(str5 == str6);//true 字符串常量池
		System.out.println(str6 == str7);//true
	}
}
