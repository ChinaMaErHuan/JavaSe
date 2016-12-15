package class_4_shujuleixing;
public class Op8 {
	
	public static void main(String[] args) {
	
		//赋值运算符的扩展
		//+= ,-= ,*= ,/= , %=  
		
		//递增符号 ++ --
		
		int a = 1;
		a++;//等价于a=a+1等价于a+=1;
		System.out.println(a=a+1);
		System.out.println(a++);
		
		
		a += 3;//a = a+3;
		a = a * 3;
		//用在循环中....
		
		String[] names = {"keke","end","lee","小熊","susu","xiaobai","xiaozhang"};
		//for (int i = 1; i <=names.length; i=i+1) {
		//for (int i = 1; i <=names.length; i+=1) {
		//for (int i = 1; i <=names.length; i*=2) {
		for (int i = 1; i <=names.length; i++) {
		System.out.println(i+"==="+names[i-1]);
//		}
		
	}
	}
}
