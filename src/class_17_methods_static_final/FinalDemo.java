package class_17_methods_static_final;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {
	//被final修饰的全局变量必须由程序员显式地赋值的
	static final String username = "maerhuan"; 
	static final int age = 10;
	/**
	 * Final:是用来修饰类，属性方法的关键字。
	 * 在java中每一个关键字它们是各司其职的，
	 * 配合使用是没有任何关系的，也不会改变每个关键词的修饰成员变量和属性 方法和类的特征.
	 * 被final修饰的引用数据类型不能是null
	 * 
	 * 针对成员变量: 
	 * 被final修饰的成员变量是常量 只能赋值一次 
	 * final修饰的成员变量要赋值
	 * 赋值的方法：
	 * 非静态的：直接赋值  构造函数赋值 代码块赋值  
	 * 静态的final常量：就通过静态代码块或者直接赋值
	 * 
	 * 
	 * 针对局部变量:(方法中的变量)
	 * 可以不用赋初始值 但是只能被赋值一次
	 * 
	 * 被final修饰的成员变量是常量 是公开化的 不允许修改
	 * 常量公开的 必须大写 易于区分
	 */
	
	
	public static final List<Integer> findUsers(){
		final List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		return nums;
	}
	public static void main(String[] args) {
//		final int age;
//		age = 10;
//		System.out.println(age);
		final List<Integer> nums = FinalDemo.findUsers();
		nums.set(0, 20);
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		System.out.println(FinalDemo.age);
		System.out.println(username);
		
	}
}
