package class_16_public;
public class Book2 {
	//访问修饰符
	//public>protected>default(friednly)没必要写出来>private
	//在当前类中 访问修饰符没有任何意义
	
	//在继承的前提下才有意义
	
	public int id;
	 String name;
	public void test(){
		System.out.println("公开的方法");
		
	}
	private void say(){
		System.out.println("私有方法");
	}
	public static void main(String[] args) {
		Book2 book2 = new Book2();
		book2.say();
		book2.test();
	}
}
