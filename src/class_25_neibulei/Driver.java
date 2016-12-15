package class_25_neibulei;




public class Driver {

	static{
		System.out.println("1");
	}
	
	{
		System.out.println("2");
	}
	
	
	Driver(){
		System.out.println(3);
	}
	
	/**
	 *  JDBC中使用Class.forName("xxx")的意义
		在Java开发特别是数据库开发中，经常会用到Class.forName( )这个方法。
		通过上面的介绍，已经了解了Class.forName()方法的作用就是为了动态加载类，并决定是否需要初始化类的静态部分
		，而在JDBC规范中明确要求Driver(数据库驱动)类必须向DriverManager注册自己。写到这里
		，相信大家都应该明白为什么在我们加载数据库驱动包的时候有的仅仅需要Class.forName(xxx);
		而有的需要Class.forName(xxx).newInstance()。
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class.forName("com.tz.op24.Driver");
		
//		Driver driver = new Driver();
//		
//		Class.forName("com.tz.op24.Driver");
//		Class.forName("com.tz.op24.Driver").newInstance();
		
		
		
//		AppletClassLoader a=null;
//		System.out.println(Driver.class.getClassLoader());
//		System.out.println(Driver.class.getClassLoader().getParent().getClass());
//		Class.forName(Driver.class.getName()).newInstance();
		
		//DriverManager.getConnection(url);
	}
}
