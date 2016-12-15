package class_24_finaldesc;



public class Final_jubu {
	
	//被final修饰的局部变量可以不用赋初始值 但是只能赋值一次 不能再修改
	public void getAge(){
		final int age;
		age = 10;
		//age = 15;
	}
//	 被final修饰的成员变量是常量 是公开化的 不允许修改
//	 常量公开的 必须大写 易于区分
}
