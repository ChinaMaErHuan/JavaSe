package class_18_extends;

public class Parent extends Parent2 {
	public String usernameString = "parent";
	protected int age = 10;
	
	static{
		System.out.println("静态B");
	}
	{
		System.out.println("构造代码B");
	}
	public Parent(){
		super();
		System.out.println("B");
	}
	
	public void println(){
		System.out.println("父类的打印...");
	}

	
}
