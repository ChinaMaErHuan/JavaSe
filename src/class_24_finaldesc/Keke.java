package class_24_finaldesc;
public class Keke extends Person{
	
	// final修饰了方法的话 子类不能覆盖 但是会继承下来的 可以调用
	// public void test(){
	//
	// }
	public static void main(String[] args) {
		Keke keke = new Keke();
		keke.test();
	}
}
