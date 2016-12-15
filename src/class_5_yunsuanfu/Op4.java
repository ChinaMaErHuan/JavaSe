package class_5_yunsuanfu;



/**
 * 
 * 
 * Op4
 * 创建人:maerhuan 
 * 时间：2016年3月22日-下午2:54:50 
 * @version 1.0.0
 *
 */
public class Op4 {
	public static void main(String[] args) {
		
		//开发过程中的比较都是用equals()；
		//在开发过程中，我们都是用封装数据类型，基础数据类型只是在一些计算和返回的时候用的到。
		//全局变量 :方法以外，类以内的变量都是全局变量
		//只有在全局变量下:基础数据类型的默认值的
		//整型：byte short short long 默认值是0
		//float doubel的默认值:0.0
		//char默认 \u0000
		//boolean 默认:false
				
		//封装数据类型：默认值null,因为他的一类，
		//判断一个数据类型是否为空：
		//其二：基础数据类型，不能应用于后面讲泛型
		//封装数据类型和封装数据类型的比较
		
		//1.不一样类型的封装数据类型的比较，不用==而用equals
		Integer aInteger = 10;
		Float bFloat = 10f;
		System.out.println(bFloat.equals(aInteger));//false
		//System.out.println(bFloat==aInteger);//连编译都不会通过
		
		//2.相同类型的封装数据类型的比较的话 
		Float b1 = 11f;
		Float b2 = 11f;
		System.out.println(b1.equals(b2));//true 值的比较
		System.out.println(b1 == b2);//false 内存地址的比较
		
		Integer a = 10;
		Integer b = 10;
		System.out.println(a == b);//true
		//Integer==Integer && 10==10   原因很简单就是因为a和b都是从Integer的对象池中拿出来的，所以内存中的地址一定是一样的，
		System.out.println(a.equals(b));//true 
		//10==10
		
		Integer aa = 128;
		Integer bb = 128;
		System.out.println(aa==bb);//false
		
		//？？？为什么？？在Integer中 数值没有超过128的的时候范围是[-128,127] 用==比较就是返回的true 超过128就返回false 这是因为在Integer
		//类中有个valueOf()方法的存在的原因
		// static final int low = -128;
		 /*public static Integer valueOf(int i) {
		        if (i >= IntegerCache.low && i <= IntegerCache.high)
		            return IntegerCache.cache[i + (-IntegerCache.low)];
		        return new Integer(i);
		    }*/
		
		
		//Integer和Byte Short Long都有类似的方法
		
//		Double aDouble = 12d;
//		Double aDouble2 = 12d;
//		System.out.println(aDouble.equals(aDouble2));//true
//		System.out.println(aDouble == aDouble2);//false
//		
//		Short aShort = 9;
//		Short bShort = 9;
//		System.out.println(aShort == bShort);//true
//		
//		Long aLong = 18L;
//		Long aLong2 = 18L;
//		System.out.println(aLong == aLong2);//true
//		
//		Byte byte1 = '0';
//		Byte byte2 = '0';
//		System.out.println(byte1 == byte2);//true
//		
		
		
// 		在开发过程中，封装类型的比较都用eqauls而不是==,
//		在开发中，时刻谨记，如果两个数字都是相同，返回还是false,那么你就一定要检查数据类型是不是一样的了。如果是一样肯定是true,否则false;

		
		
		
		
		
	}
}
