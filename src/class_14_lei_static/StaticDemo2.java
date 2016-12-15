package class_14_lei_static;
/**
 * 
 * 
 * StaiticDemo2
 * 创建人:maerhuan 
 * 时间：2016年4月24日-下午5:07:03 
 * @version 1.0.0
 *
 */
public class StaticDemo2 {
	
	public static int num;
	public  int num2;
	//静态成员在编译的时候就已经确定内存空间的大小，和当前类本身，存放入静态区中。---栈区
	//非静态成员，在new在申请空间地址的时候 创建的=---堆区
	//总结：
		//1:静态方法中只能调用静态成员
		//2:非静态方法可以调用静态成员也可以调用非静态成员
		//3:静态成员，一定通过类去调用，
		//4:既然静态方法属于类，没有对象的产生和那么方法就不能用this关键字
	
	public static void test(){
		System.out.println(StaticDemo2.num);
	}
	
	public void test2(){
		System.out.println(this.num2+"==="+StaticDemo2.num);
	}
	
	
	
	public static void main(String[] args) {
		
		StaticDemo2 demo = new StaticDemo2();
		StaticDemo2.num++;
		demo.num2++;
		demo.test2();
		
		StaticDemo2 demo2 = new StaticDemo2();
		StaticDemo2.num++;
		demo2.num2++;
		demo2.test2();
	}
	
	
	
}
