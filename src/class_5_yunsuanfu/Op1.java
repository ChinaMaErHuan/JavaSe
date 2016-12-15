package class_5_yunsuanfu;
/**
 * 
 * 
 * Op1
 * 创建人:maerhuan 
 * 时间：2016年3月21日-下午11:55:57 
 * @version 1.0.0
 *
 */
public class Op1 {

	
	public static void main(String[] args) {
		//赋值运算符 =
		// += -= *= /= %= &= >>= <<= >>>=
//		int a= 10;
//		a*=10;//a = a/10;
//		System.out.println(a);
//		a&=2;//等价于 a = a&2;
//		System.out.println(a);
		
		
//		%:规则 分子%分母 结果一定小于等于(分母-1)
//		for (int i = 1; i < 100; i++) {
//			System.out.println(i%60);
//		}
//		System.out.println(99%122);//99
		
		
		
		
		//三目运算符 逻辑判断 ? 真体：假体;一个简单的if else; 一般应用于方法结果集的返回或者一些简单的默认值的初始化。
		String name = "小白";
		//默认值的设定的时候
		name = name.equals("")?"keke":name;
		System.out.println(name);
		
		//优先级
		
		//++ --
	}
	
	
//	public boolean saveUser(){
//		//kai
//		int count = 1;//保存用户一个数字的返回 1保存成功0保存失败
//		return count>0?true:false;
//	}
}
