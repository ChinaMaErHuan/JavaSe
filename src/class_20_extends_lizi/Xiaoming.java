package class_20_extends_lizi;
public class Xiaoming extends Father {
	public String username;
	public Xiaoming(){
		super();
		System.out.println("小明构造函数...");
	}
	
	static{
		System.out.println("小明的静态代码块...");
	}
	
	{
		
		System.out.println("小明代码块...");
	}
}
