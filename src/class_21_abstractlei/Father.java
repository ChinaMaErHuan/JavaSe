package class_21_abstractlei;
public abstract class Father {
	public String username;
	int age;
	private String password;
	public static Integer aInteger= 5;
	public abstract void buyCigarette();
	
	public Father(){
		
	}
	//试题 A
	public void sleepA(){
		System.out.println("到了十二点了，要去睡觉了...");
	}
	//试题 A
	public void sleepB(){
		System.out.println("到了十二点了，要去睡觉了...");
	}
	//试题 A
	public void sleepC(){
		System.out.println("到了十二点了，要去睡觉了...");
	}
		
	//抽象方法
	public abstract void doExam();
	public abstract void result();
	
}
