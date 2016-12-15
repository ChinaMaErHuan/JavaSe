package class_17_methods_static_final;





public class Daimakuai {
	private int age=100000;
	private static int id;
	/**
	 * 代码块：初始化成员变量---编译阶段已经写入到java堆 
	 * 了解的知识点
	 * 静态代码块和普通代码块
	 * 静态代码块只能对静态成员赋值 静态代码块在类加载的时候执行一次
	 * 普通代码块能对静态成员和普通成员赋值
	 * 静态代码块>mian方法>构造代码块>构造方法
	 */
	static{
		Daimakuai.id = 15;
		
	}
	//构造代码块：在方法或语句中出现的{}就称为普通代码块。普通代码块和一般的语句执行顺序由他们在代码中出现的次序决定--“先出现先执行”
	{
		age = 10;
		Daimakuai.id = 400;
	}
	public void setage(int age){
		this.age = age;
		System.out.println(this.age);
	}
	public void setid(int id){
		Daimakuai.id = id;
		System.out.println(Daimakuai.id);
	}
	public static void main(String[] args) {
		Daimakuai daimakuai = new Daimakuai();
		System.out.println(daimakuai.age);
		System.out.println(Daimakuai.id);
		//daimakuai.age = 20;
		//Daimakuai.id = 300;
		System.out.println(daimakuai.age);
		System.out.println(Daimakuai.id);
	}
}
