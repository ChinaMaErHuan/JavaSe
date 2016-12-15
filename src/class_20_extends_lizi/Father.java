package class_20_extends_lizi;
public class Father extends GrandFather {
	private String address;
	static final int size;
	public Father(){
		super();
		
		System.out.println("父亲构造函数代码块");
	}
	static{
		size = 10;
		System.out.println("父亲的静态代码块...");
	}
	
	{
		
		System.out.println("父亲成员代码块...");
	}
	
	public void goSleep(){
		System.out.println("父亲睡觉了.....");
	}
	public  void sayHello(){
		System.out.println("父亲了一句话....");
	}
}
