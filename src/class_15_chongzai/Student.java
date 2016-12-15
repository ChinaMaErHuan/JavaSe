package class_15_chongzai;

public class Student {
	private Integer age;
	private String ID;


	/**
	 * 构造函数: 
	 * 1.申请内存空间地址 创建对象 如果一个类中没有显式的定义构造函数，就会自动调用默认的构造函数 
	 * 2.收集属性和方法 给属性赋值
	 * 3.构造函数可以重载
	 * 4.构造函数必须与类名字一样  但是方法可以和类名一样 
	 * 
	 * 
	 * a.在调用之前执行方法
	 * b.在创建对象的时候会自动调用默认的构造函数 如果进行了构造函数的重载,那么就会覆盖原来的
	 * c.如果想继续使用原来的方法 就要显式的定义出来
	 * d.构造函数可以调用构造函数 例如你定义了一个构造方法有俩参数 下一个构造函数有三个参数 (参数1,参数2,参数3)
	 * 包括了前面俩个参数你可以将this(参数1,参数2)放到那个有三个参数的构造函数方法里面前提是必须放到第一行代码的位置上
	 * 
	 *  
	 * 方法重载:函数名字一样 参数不一样 参数列表不一致 void 没有返回值
	 * 方法修饰符 void name(){} 
	 * 方法修饰符 return_type name(){}
	 */
	
	public Student(){
		System.out.println("我是构造函数....");
	}
	
	public  Student(Integer age,String id) {
		this.age = age;
		this.ID =id;
		System.out.println("我是有参数的构造函数....");
	}
	
	
	
	


	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	//类是一种自定义数据类型
	//下面方法不是构造函数
	public Student Sum(){
		this.age++;
		return this;//这样方法就能连续使用；。sum().sum().sum();
	}
	

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.age = 20;
		stu1.ID = "001";
//		int result = stu1.Sum();
//		System.out.println(result);
		Student stu2 = new Student(20,"002");
		System.out.println(stu2.age);
		
	}

}
