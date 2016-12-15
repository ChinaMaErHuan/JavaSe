package class_9_mianshi;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 
 * 
 * Math
 * 创建人:maerhuan 
 * 时间：2016年4月5日-下午6:14:00 
 * @version 1.0.0
 *
 */
public class MathMethods {
	public static void main(String[] args) {
		//Math数学函数--三角函数--绝对值---平方根---大小运算---四舍五入----乘方
		//Math.toDegrees();//弧度转角度
		//System.out.println(Math.toDegrees(3.141592653));
		//角度转弧度
		//System.out.println(Math.toRadians(90));
		
		//正弦
		System.out.println((Math.sin(Math.toRadians(30))));
		System.out.println(Math.sin(Math.toRadians(60)));
		System.out.println(Math.sin(Math.toRadians(45)));
		
		//余弦
		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.cos(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(45)));
		
		//正切
		System.out.println(Math.tan(Math.toRadians(45)));
		
		//反正弦
		System.out.println(Math.asin(0.5));
		//反余弦
		System.out.println(Math.acos(0.5));
		
		
		//取整函数
		double a = 21.22;
		System.out.println(Math.floor(a));
		System.out.println(Math.ceil(a));
		
		//四舍五入这种四舍五入的方式是有缺陷的就是不能保留小数位
		double b = 3.369;
		System.out.println(Math.round(b));
		String cstr= new DecimalFormat("#.##").format(b);
		double cstr1 = toolsUtils.numUtils.MehNumberUtil.round(b, 2);
		System.out.println(cstr1);
		//#.##和0.00在小数的情况下是一样的  但是在整数的情况下是不一样的 0.00会自动补上0
		System.out.println(cstr);
		//开平方
		System.out.println(Math.sqrt(3));
		//立方根
		System.out.println(Math.cbrt(27));
		
		//e^1
		System.out.println(Math.exp(1));
		
		//a^b
		System.out.println(Math.pow(2, 3));
		//常数
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//最大值最小值
		System.out.println(Math.max(12, 5));
		System.out.println(Math.min(12, 5));
		//绝对值
		System.out.println(Math.abs(-5));
		
		
		
		//BigDecimal
		BigDecimal b1= new BigDecimal(1);
		BigDecimal b2= new BigDecimal(3);
		BigDecimal b3=b1.add(b2);//相加
		BigDecimal b4=b1.subtract(b2);//相减
		BigDecimal b5=b1.multiply(b2);//相乘
		BigDecimal b6=b1.divide(b2,18,BigDecimal.ROUND_HALF_UP);//相除
		System.out.println(b6);
		System.out.println(b5);
		System.out.println(b4);
		System.out.println(b3);
		System.out.println(b1.divide(b2, 18, BigDecimal.ROUND_HALF_UP));
	
		
	}
}
