package class_18_lizi2;

public abstract class PhoneMessage2 {

	public PhoneMessage2() {
		super();
	}

	public PhoneMessage2(String username) {
		super();
	}

	/**
	 * 抽象类中不 一定存在抽象方法 但是抽象方法必须在抽象类中 抽象类: 
	 * 
	 * abstract不能与private、static、final、native并列修饰同一个方法
	 * 
	 *  抽象类：
	 * 不能实现化对象，但是可以定义构造函数. 实现抽象类，方式有两种---一种:通过匿名内部类，一种是：具体子类
	 * 1:抽象类必须使用abstract修饰，抽象方法必须用abstract修饰，抽象方法中不能又具体的实现。
	 * 2:抽象类不能被实例化对象的，但是可以定义构造函数，目的是给当前抽象类的私有成员属性赋值目的。（注：一种:通过匿名内部类，一种是：具体子类）
	 * 3：抽象方法，必须定义在抽象类中或者接口中。如果有抽象方法就要必然是抽象类或者接口。
	 *  4:final不能够abstract共用
	 * 5:不能私有private 可以是public protected 
	 * 6:没有抽象属性的概念
	 * 
	 * 抽象方法的意义在于，规定了他的所有子类必须拥有一个这样子的方法，或者提供一个这样子的服务，
	 * 但是实现这个方法的方式会因为子类的不同的结构而有所不同。 之所以需要继承，是因为这个方法是这些子类的一个共同属性。
	 * 或者说，父类要通过这些抽象的方法，提供某种特定的服务， 但是实现方式在子类中有所不同，
	 * 所以在父类中写了抽象方法强制子类实现，保证能够提供这种服务。
	 * 
	 * 
	 */
	// 抽象方法 必须在抽象类中
	public abstract String sendMessage(String message);

	public abstract void callPhone(String telephone);
}
