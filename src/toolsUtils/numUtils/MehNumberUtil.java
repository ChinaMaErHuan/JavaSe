package toolsUtils.numUtils;


import java.math.BigDecimal;

public class MehNumberUtil {

	public static final int DIVRADIX = 10;	
	/**两个数字相加的方法
	 * 方法名：add
	 * 创建人：maerhuan
	 * 时间：2016年3月26日-下午11:46:59 
	 * 手机:1564545646464
	 * @param a
	 * @param c
	 * @return double
	 * @exception 
	 * @since  1.0.0
	 */
	public static double plus(double a,double c){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.add(bc).doubleValue();
	}
	
	/**
	 * 两个数字相减的方法
	 * 方法名：add
	 * 创建人：maerhuan 
	 * 时间：2016年3月26日-下午11:46:59 
	 * 手机:1564545646464
	 * @param a
	 * @param c
	 * @return double
	 * @exception 
	 * @since  1.0.0
	 */
	public static double minus(double a,double c){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.subtract(bc).doubleValue();
	}
	/**
	 * 两个数字相乘的方法
	 * 方法名：add
	 * 创建人：maerhuan 
	 * 时间：2016年3月26日-下午11:46:59 
	 * 手机:1564545646464
	 * @param a
	 * @param c
	 * @return double
	 * @exception 
	 * @since  1.0.0
	 */
	public static double multiply(double a,double c){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.multiply(bc).doubleValue();
	}
	/**
	 * 两个数字相除的方法
	 * 方法名：add
	 * 创建人：xuchengfei 
	 * 时间：2016年3月26日-下午11:46:59 
	 * 手机:1564545646464
	 * @param a
	 * @param c
	 * @return double
	 * @exception 
	 * @since  1.0.0
	 */
	public static double div(double a,double c,int r){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.divide(bc,r,BigDecimal.ROUND_HALF_EVEN).doubleValue();
	}
	
	/**
	 * 相除的方法 
	 * 方法名：div
	 * 创建人：xuchengfei 
	 * 时间：2016年3月26日-下午11:52:04 
	 * 手机:1564545646464
	 * @param a
	 * @param c
	 * @return double
	 * @exception 
	 * @since  1.0.0
	 */
	public static double div(double a,double c){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.divide(bc,DIVRADIX,BigDecimal.ROUND_HALF_EVEN).doubleValue();
	}
	/**
	 * 
	 * 四舍五入的操作
	 * toolsUtils 
	 * 方法名：round
	 * 创建人：maerhuan 
	 * 时间：2016年4月5日-下午7:38:05 
	 * @param d
	 * @param len
	 * @return double
	 * @exception 
	 * @since  1.0.0
	 */
	public static double round(double d, int len) { // 进行四舍五入

		BigDecimal b1 = new BigDecimal(d);
		BigDecimal b2 = new BigDecimal(1);
		// 任何一个数字除以1都是原数字
		// ROUND_HALF_UP是BigDecimal的一个常量，
		return b1.divide(b2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	
	public static void main(String[] args) {
//		System.out.println(1/3d);
//		System.out.println("3333333333333333".length());
		
		System.out.println(div(1,3,16));
		System.out.println(div(1,3));
		System.out.println(round(20.157, 2));
	}
}

