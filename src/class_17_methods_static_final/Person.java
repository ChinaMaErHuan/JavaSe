package class_17_methods_static_final;

import java.util.ArrayList;
import java.util.List;

public class Person {
	// 类是自定义的数据类型
	private int age;

	public void test() {
		System.out.println(this.age);
	}

	public Person() {

	}

	public Person(int age) {
		this.age = age;
	}

	// 动态参数  解决参数多的问题 只能解决同一数据类型 如果数据类型不一致 可以用对象的顶级父类 Object
	public int sum3(int ...params){
		int result = 0;
		for (int i = 0;i<params.length;i++) {
			result += params[i];
		}
		return result;
	}
	
	
	
	
	
	// java代码
	public int sum() {
		int a = 10;
		int b = 10;
		return a + b;
	}
	public int Sum(int a,List<Integer> b){
		System.out.println("该方法被调用。。。");
		return 0;
	}
	//参数的数据类型的问题 可以是基本的数据类型 引用数据类型  调用的函数的参数的数据类型<=方法的数据类型类  集合  
	//但是在集合的情况下 你的参数是List  那么调用的时候要传List的子类
	//js代码:动态参数的问题
	// function sum(){
	// var args = arguments;//实参列表
	// var result = 0;
	// for(var i=0;i<args.length;i++){
	// result+=args[i];
	// }
	// return result;
	//
	// }
	//
	// var result = sum(1,2,3,4,5,6,7,8,9,10,11,12);
	// var result2 = sum(111,222,568);
	// alert(result);
	// alert(result2);
	public static void main(String[] args) {
		// 实例化对象----- 反射-- clone--- new ---Object
		Person person = new Person();
		person.age = 20;
		person.test();
		person.sum();
		List<Integer> numsIntegers = new ArrayList<>();
		person.Sum(10,numsIntegers);
		int st = person.sum3(1,2,3,4,5,698,78,3624,123);
		System.out.println(st);
	}
}
