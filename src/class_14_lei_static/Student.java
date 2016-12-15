package class_14_lei_static;



public class Student {
	private String name;
	private Float money;
	
	private String address;
	private Integer age;
	
	
	public void buybook(String message){
		int age = 30;
		System.out.println(this.name+"==="+this.address+"==="+this.age+"==="+this.money+"===="+age);
		print(message);
	}
	
	public void print(String message){
		System.out.println(message);
	}
	/* 1.JAVA中的类是具备某些共同特征的实体的集合，它是一种抽象的概念；
	   2.用程序设计的语言来说，类是一种抽象的数据类型，它是对所具有相同特征实体的抽象；
	3.所谓对象就是真实世界中的实体，对象与实体是一一对应的，也就是说现实世界中每一个实体都是一个对象，
	对象是一种具体的概念。
	4.类是对象的集合，对象是类的实例;对象是通过new className产生的，用来调用类的方法;类的构造方法 。
	5.对象是类通过构造函数到堆里面申请的一块内存空间地址 非静态成员拷贝
	*
	*/
	
	/**
	 * 类的结构：(类就是一种特殊的数据类型)
	 * 访问修饰符  ClassName(){
	 * 		
	 * 
	 * 		//属性的定义
	 * 		[访问修饰符][修饰词 final static]数据类型 变量名 = value;
	 * 		[访问修饰符][修饰词 final static]数据类型 变量名 
	 * 		.....
	 * 		
	 *		//构造函数
	 * 		访问修饰符 类名(){
	 * 
	 * 		}
	 * 
	 * 		//重写的构造函数
	 * 		访问修饰符 类名(参数列表){
	 * 
	 * 		}
	 * 		.....
	 * 
	 * 		//方法
	 * 		访问修饰符[修饰词 static final] 返回值  方法名(){
	 * 			//方法体
	 * 			return 对应的返回值
	 * 		}
	 * 
	 * 		//代码块
	 * 		[static]{
	 * 
	 * 		}
	 * }
	 * 
	 */
	public static void main(String[] args) {
		Student kekeStudent = new Student();
		kekeStudent.name = "keke";
		kekeStudent.address="changsha";
		kekeStudent.age=20;
		kekeStudent.money = 12.5f;
		kekeStudent.buybook("你妹的");
		
	}
}
