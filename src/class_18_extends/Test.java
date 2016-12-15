package class_18_extends;


public class Test {
	public static void main(String[] args) {
		
		//打印AB
		//父类的静态内容-->父类的构造代码块-->父类的构造函数---->子类的......
		//父类的静态变量>父类的静态代码块>子类的静态变量>子类的静态代码块>父类的构造代码块-->父类的构造函数
		//
		/**
		 * 多态: 1.编译时的类型和运行时的不一样 而且有继承关系 
		 * 一、要有继承；
		 *  二、要有重写； 
		 *  三、父类引用指向子类对象。
		 */
		//多态
//		List<Integer> list = new ArrayList<>();
//		Collection<Integer> listCollection = new ArrayList<>();
		
		
		
		Parent children = new Children();
		children.println();
		System.out.println(children.usernameString);
		//只能调用被覆盖的方法
		
		
		
		
	}
}
