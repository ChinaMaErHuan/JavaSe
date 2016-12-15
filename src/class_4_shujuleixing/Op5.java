package class_4_shujuleixing;
public class Op5 {
	
	public static void main(String[] args) {
		
		// ++ -- 步长1
//		int a = 1;
//		a++;
//		++a;
//		System.out.println(a);这样的语句中是没什么区别的
		
		
		int a = 5;
//		//在运算里，中或者逻辑判断中，或者方法的传参数中就存在差异了
//		int b = ++a + 6;
//		//a内存里面还是 6
//		
//		System.out.println("===="+b);//12
//		System.out.println("===="+a);//6
		
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a++);
		//java编译是自上而下，不是并行的
		
		
		if(a++==6){
			System.out.println("等于");
		}else{
			System.out.println("不等于");
		}
		
		
		if(++a==7 && a--==6){
			System.out.println("等于");
		}else{
			System.out.println("不等于");
		}
	
	
//		A:等于 不等于  B 等于 等于  C不等于 不等于
		
		
		
	}
}
