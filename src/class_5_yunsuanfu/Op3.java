package class_5_yunsuanfu;
/**
 * Op3
 * 创建人:maerhuan 
 * 时间：2016年3月22日-上午12:51:00 
 * @version 1.0.0
 *
 */
public class Op3 {
	public static void main(String[] args) {
		
		System.out.println(null == null);//true
		System.out.println("".equals(null));//true
		//null不是对象 不能调用方法
		
		
		
		//1.基础数据类型之间比较的话 值相等就返回true 和数据类型无关 == 比较 
		int aint = 10;
		float bfloat = 10.0f;
		double d = 10d;
		System.out.println(aint == bfloat);
		System.out.println(aint == d);
		System.out.println(bfloat == d);
		
		
		//2.基础数据类型和引用(封装)数据类型比较 值相等就是返回true 用 == 比较
		Integer aInteger = 10;
		Float bFloat = 10.0f;
		System.out.println(aInteger == aint);
		System.out.println(aInteger == bfloat);
		System.out.println(aInteger == d);
		System.out.println("======"+(aInteger.equals(bFloat)));//false
		
		//同类型是真的 不同类型是假的
		System.out.println(aInteger.equals(aint));//true
		System.out.println(aInteger.equals(bfloat));//false
		System.out.println(bFloat.equals(aint));//false
		System.out.println(bFloat.equals(bfloat));//true
		
		Integer aInteger2 = 10;
		Integer aInteger3 = 30;
		if(aInteger2>aInteger3){
			System.out.println("435");
		}else {
			System.out.println("sadsa");
		}
	}
}
