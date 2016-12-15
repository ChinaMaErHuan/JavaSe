package class_22_override;
public class Children extends Father {

	// 注意:子类的构造方法，不管这个构造方法带不带参数， 默认的它都会先去寻找父类的不带参数的构造方法。 如果父类没有不带参数的构造方法，
	// * 那么子类必须用super关键字来调用父类带参数的构造方法，否则编译不能通过。
	public Children(){
		super(null);
	}
	public Children(String username){
		super(username);
		
	}

	@Override
	protected void say() {
		System.out.println("来啊来啊");
	}
	public void test(){
		System.out.println("你打不到我");
	}

}
