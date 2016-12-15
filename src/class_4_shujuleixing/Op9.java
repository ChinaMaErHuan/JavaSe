package class_4_shujuleixing;
public class Op9 {
	
	public static void main(String[] args) {
	
		//比较运算符：> < == >= <= != 用在条件判断中
		
//		System.out.println(2<=2);
//		
//		System.out.println(2!=2);
//		
//		System.out.println(!(2!=2) || 2<3);//||看到就找true
		
		
		
//		== 逻辑判断,是内存地址的比较-（二进制）还要考虑前面的数据类型 和 = 赋值
		
		//"==" 数字是值的比较，对象(封装数据类型)是内存地址的比较
		//如果是基础数据类型值比较==，值相等那么都是true,如果是封装数据类型都是false--hashCode()
		float a=2;
		int b=3;
		System.out.println(a==b);
		
		
		if((a=b)==3){
			System.out.println("等于");
		}else{
			System.out.println("不等于");
		}
		
		
		
		
	}
}