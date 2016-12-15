package class_17_methods_static_final;

public class Child extends Father {

	static {
		System.out.println("child-->static");
	}

	private int n = 20;

	{
		System.out.println("Child Non-Static");
		n = 30;
	}

	public int x = 200;

	public Child() {
		
		this("The other constructor");
		System.out.println("child constructor body: " + n);
	}

	public Child(String s) {
		System.out.println(s);
	}

	public void age() {
		System.out.println("age=" + n);
	}

	public void printX() {
		System.out.println("x=" + x);
	}

	public static void main(String[] args) {
		new Child().printX();
	}
}

class Father {

	static {
		// 当n定义在下面时，会提示Cannot reference a field before it is defined，
		// 所以必须把n定义移到上面才可以输出
		System.out.println("super-->static");
		System.out.println("Father's n = "+Father.n);
	}

	public static int n = 10;
	public int x = 100;

	public Father() {
		System.out.println("Father's n = "+n);
		System.out.println("super's x=" + x);
		age();
	}

	{
		System.out.println("Father Non-Static");
	}

	public void age() {
		System.out.println("nothing");
	}

	/**
	 * 1、先执行父类的静态代码块和静态变量初始化，并且静态代码块和静态变量的执行顺序只跟代码中出现的顺序有关。 
		2、执行子类的静态代码块和静态变量初始化。 
		3、执行父类的实例变量初始化 
		4、执行父类的构造函数 
		5、执行子类的实例变量初始化 
		6、执行子类的构造函数 
	 */
	
	
	/*
	 * 父类静态代码块 -> 子类静态代码块 -> 父类非静态代码块 -> 父类构造函数 -> 子类非静态代码块 -> 子类构造函数
	 */
	/**
	 * 下面说说我个人理解的过程：
	 * (1).Child的main(...)方法内的new语句会触发JVM对类的加载。因为Child是继承自Father的，所以会先加载Father
	 * .class.加载过程会执行两步：
	 * (a).所有的static数据域初始化为默认值(0,false,null)，所以Father内的static的n首先默认值为0.
	 * (b).执行所有的static域的初始化语句或者初始化块
	 * （按出现的顺序），此时Father内static块的打印语句执行：super-->static，并且static的n赋值语句n = 10执行。
	 * 父类的方法表建立后算是父类加载完毕
	 * ，接着会加载子类Child，执行的过程与父类类似。因为子类没有static的数据域，所以仅仅static的初始化块内的打印语句执行
	 * ：child-->static。 这也解释了为什么static的初始化只有一次，因为它仅仅在类加载的时候执行而与实例化没有关系。
	 * 
	 * (2).需要的类加载完毕之后new Child()开始使用类构造器创建实例。我理解的构造器的执行有以下几步：
	 * (a)所有数据域初始化为默认值(0,false,null)。 (b)如果有父类则先执行父类的构造器。
	 * (c)按声明出现的顺序执行所有数据域的初始化语句或者初始化块
	 * (d)如果构造器主体的第一句调用了另一个构造器，则执行第二个构造器的主体（非super） 
	 * (e)执行构造器的主体部分
	 * 现在对号入座看看此例的情况，首先Child的数据域初始化为默认值：n=0,
	 * x=0.接着由于继承Father如果没有在构造器主体显示使用super(
	 * ...)调用Father有参或者无参的构造器，则隐式的去调用无参的构造器。此时开始了Father构造器的执行过程：
	 * 首先Father的所有数据域初始化为默认值
	 * ：x=0；接着是Father的父类Object的构造器执行；完毕后Fahter开始数据域的初始化语句的执行
	 * ：x=100；Father构造器主体没有调用自身的其他的构造器，第四步跳过；最后一步就是Father构造器的主体：先执行打印super's
	 * x=100，接着调用age().这里Father和Child的方法表内都有age()方法，但是因为要创建的是Child实例，
	 * 所以JVM会动态的绑定到Child的age()方法，所以执行了System.out.println("age=" +
	 * n);而此时n仅仅是默认值0，所以打印age=0.
	 * 父类的构造器调用完毕之后，继续Child构造器执行的第三步：数据域的初始化语句和初始化块，此时按照声明的顺序n
	 * =20，接着在初始化块中n=30，然后就是x=200；Child的第四步满足条件，所以会执行Child(String
	 * s)有参构造器的主体，打印The other constructor；最后一步执行本构造器的主体，打印child constructor
	 * body: 30。
	 * 
	 * 至此实例化完毕，main函数内调用了实例的printX()方法执行System.out.println("x=" +
	 * x)语句。这里虽然Father和Child都有public的x
	 * 。但是由于语句内没有显示使用super.x，则会隐式的使用this.x。这样打印x=200.完整的执行结果如下： super-->static
	 * child-->static super's x=100 age=0 The other constructor child
	 * constructor body: 30 x=200
	 * 
	 * 
	 * */

	/**
	 * 总结: 对象的初始化顺序:首先执行父类静态的内容，父类静态的内容执行完毕后， 接着去执行子类的静态的内容，当子类的静态内容执行完毕之后，
	 * 再去看父类有没有非静态代码块，如果有就执行父类的非静态代码块，父类的非静态代码块执行完毕，
	 * 接着执行父类的构造方法；父类的构造方法执行完毕之后，它接着去看子类有没有非静态代码块，如果有就执行子类的非静态代码块。
	 * 子类的非静态代码块执行完毕再去执行子类的构造方法。总之一句话，静态代码块内容先执行，
	 * 接着执行父类非静态代码块和构造方法，然后执行子类非静态代码块和构造方法。
	 * 
	 * 
	 * 注意:子类的构造方法，不管这个构造方法带不带参数， 默认的它都会先去寻找父类的不带参数的构造方法。 如果父类没有不带参数的构造方法，
	 * 那么子类必须用super关键子来调用父类带参数的构造方法，否则编译不能通过。
	 */
}
