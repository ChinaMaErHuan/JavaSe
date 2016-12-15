/**
 * Tm系统平台
 * JavaSe
 * test.duotai
 * Apple.java
 * 创建人:maerhuan 
 * 时间：2016年10月15日-下午8:26:30 
 * 2016Tm公司-版权所有
 */
package test.duotai;
public class Apple extends Fruit{
	public Apple(){
		super();
	}
	public Apple(String shape, String color, String nameString,String xx) {
		super(shape, color, nameString, xx);
		
	}
	@Override
	protected void geJiage() {
		// TODO Auto-generated method stub
		super.geJiage();
	}
	public static void main(String[] args) {
		Fruit aFruit = new Apple();
		aFruit.geJiage();
		
	}
//	注意:子类的构造方法，不管这个构造方法带不带参数， 默认的它都会先去寻找父类的不带参数的构造方法。 如果父类没有不带参数的构造方法，
//	  那么子类必须用super关键字来调用父类带参数的构造方法，否则编译不能通过。
}
