package class_5_yunsuanfu;
/**
 * 
 * 
 * Op5
 * 创建人:maerhuan 
 * 时间：2016年3月22日-下午7:11:55 
 * @version 1.0.0
 *
 */
public class Op5 {
	public static void main(String[] args) {
		String str1 = "我爱你";
		String str2 = "我爱你";
		String str3 = str1;
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true
		System.out.println(str2.equals(str3));
		System.out.println(str1 == str2); //因为字符串常量池的存在 所以最终指向的是同一个字符串
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);//全部是true
		
		//字符串常量池在虚拟机里面自带的  为了效率 相同的字符串被发现后就不会再创建了 字符串常量池不会有相同的字符串
 
		
		
		String string11 = "我爱你";
		String string3 = new String("我爱你");//在堆里面开辟新的空间地址 发现了字符串常量池有这个变量 就指向常量池 
		System.out.println(string11.equals(string3));//equals是值比较  true 指向同一个 
		System.out.println(string11==string3);//==内存地址比较,在比较值false

		/**
		 * public boolean equals(Object anObject) {
		 * this指向-------谁调用就指向谁
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
	 */
	}
}
