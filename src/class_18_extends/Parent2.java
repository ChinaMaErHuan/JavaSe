package class_18_extends;
public class Parent2 {
	
	
	static{
		System.out.println("静态A");
	}
	{
		System.out.println("构造代码块A");
	}
	public Parent2(){
		super();
		System.out.println("A");
	}
//	public void println(){
//		System.out.println("父类打印");
//	}
	
}
