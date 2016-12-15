package class_18_extends;
public class Children extends Parent {
	//发生继承关系的时候 如果要继承一个类的时候 在同一个目录下的父类和子类不用导包 
	//但是不在同一目录下的类就要用import导入了
	static{
		System.out.println("静态C");
	}
	{
		System.out.println("构造代码C");
	}
	public Children(){
		super();//写不写都会存在 调用父类
		/**
		 * super  在没有继承关系的时候 super指向的是Object 
		 * 发生了继承的时候 就指向父类
		 */
		System.out.println("C");
	}
	
	/**
	 * 重载是针对当前类的 方法名一样 参数列表的数据类型不一致 无关于返回值 访问修饰符
	 * 1.重写一定是在继承的前提下  
	 * 2.必须和父类方法名一样 方法的访问修饰符  返回值 参数列表一致
	 * 3.访问修饰符>=父类
	 * 4.一定是public protected
	 * 5.识别是通过重写父类的方法@Override
	 * 6.重写的目的是覆盖方法的业务逻辑,进而自己去实现    重写是多态的一种体现
	 */
	@Override
	public void println(){
		//super.println();
		System.out.println("子类打印");
	}
	
	public String tset(){
		System.out.println("ress");
		return "success";
	}
	
}
