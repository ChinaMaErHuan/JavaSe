package class_24_finaldesc;
public class Final_quanju {
	//被final修饰的全局变量必须被赋值  只能赋值一次 
	//如果是非静态的话，可以通过直接赋值，构造函数赋值，代码块赋值;
	
	//如果是静态的常量 可以通过静态代码块来赋值 或者是直接赋值
	private final Integer age;
	private static final int age2;
	static{
		age2 = 30;
	}
//	{
//		age = 20;
//	}
	public Final_quanju(Integer ageInteger){
		this.age = ageInteger;
	}
}
