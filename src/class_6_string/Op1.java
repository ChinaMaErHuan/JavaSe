package class_6_string;
/**
 * 
 * 
 * Op1
 * 创建人:maerhuan 
 * 时间：2016年3月24日-下午5:18:00 
 * @version 1.0.0
 *
 */
public class Op1 {
	public static void main(String[] args) {
//		1:基础数据类型的变量和值不能和引用数据类型的变量，值使用"=="比较
//		2:boolean类型的变量不能与任意其他的变量，值进行比较 "=="
//		3:如果两个引用之间没有父子继承关系，那么它们的变量也不能使用==比较。
		
		//20==20 ==false会是什么原因造成的,其实封装数据类型不一致造成的
//		int age1 =20;
//		Float age2 = 20f;
//		float age3 =20;  
//		System.out.println(age1==age3);
//		
//		Integer aInteger = 10;
//		Float aFloat = 10.0f;
		//System.out.println(aInteger == aFloat);//不会比较 
		
		
		//[-128,127]
		Integer aInteger2 = 20;
		Integer aInteger3 = 20;
		System.out.println(aInteger2 == aInteger3);//true Integer没有超过128用 ==比较返回true 
		System.out.println(aInteger2.equals(aInteger3));//true 值比较
		
		Float aFloat2 = 15.0f;
		Float aFloat3 = 15.0f;
		System.out.println(aFloat2 == aFloat3);//false
		
		//equals是值比较,同类型比较才是true 就是说equals在比较两个对象的时候 如果两个对象是同一个数据类型 那么比较的就是值
		Float age =20f;
		Double age4=20d;
		System.out.println(age4.equals(age));//false
				
				
		//在开发过程中，不管你用==还是eqauls都是先要确定数据类型是否是一致的。如果不一致返回就是false
				
		//equals 必须是同类型（封装数据类型）的值比较
		
		
	}
}
