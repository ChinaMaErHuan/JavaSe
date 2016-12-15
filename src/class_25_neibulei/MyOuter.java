package class_25_neibulei;

//二.静态内部类：与类的其他成员相似，可以用static修饰内部类，这样的类称为静态内部类。静态内部类与静态内部方法相似，只能访问外部类的static成员，不能直接访问外部类的实例变量，与实例方法，只有通过对象引用才能访问。
//3.由于static内部类不具有任何对外部类实例的引用，因此static内部类中不能使用this关键字来访问外部类中的实例成员，但是可以访问外部类中的static成员。这与一般类的static方法想通
//4.实例代码：

public class MyOuter {
	public static int x = 100;

	public static class MyInner {
		private String y = "Hello!";

		public void innerMethod() {
			System.out.println("x=" + MyOuter.x);
			System.out.println("y=" + this.y);
			
			
		}

	}
	
	public  void test(){
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyOuter.MyInner si = new MyOuter.MyInner();// 静态内部类不通过外部实例就可以创建对象；与类变量可以通过类名访问相似
		si.innerMethod();
	}
}
