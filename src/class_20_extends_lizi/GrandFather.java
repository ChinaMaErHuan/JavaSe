package class_20_extends_lizi;
public class GrandFather {
	public static int age;
	private String score;//密码
	public String username;
	double money = 1257878d;
	public GrandFather(){
		super();
		System.out.println("GrandFather的构造函数...");
	}
	static {
		System.out.println("爷爷的静态代码块...");
		age = 10;
	}
	
	{
		age = 20;
		System.out.println("爷爷成员代码块...");
	}
	
	public  void sayHello(){
		System.out.println("爷爷说了一句话....");
	}
	
	private String GoTravel(){
		System.out.println("去旅行");
		return "success";
	}
}
