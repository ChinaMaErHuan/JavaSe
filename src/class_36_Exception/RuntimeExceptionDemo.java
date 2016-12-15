package class_36_Exception;

public class RuntimeExceptionDemo {
	public static void main(String[] args) {
		int count = saveUser();
		System.out.println(count==1?"success":"fail");
		
		try {
			Class.forName("com.tz.user.testse");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("找不到类...."+e.getMessage());
		}
	}
	
	
	
	public static int saveUser(){
		//runtime异常如果不进行try/catch去捕获的话，是允许的，jvm就是调用默认的处理异常机制，进行异常的处理
		try {  
			User user = new User();//初始化
			user.setUsername("keke");
			System.out.println(user.getUsername());
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("有空指针....");
			return 0;
		}
		
	}
}
