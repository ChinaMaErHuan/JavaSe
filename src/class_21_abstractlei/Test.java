package class_21_abstractlei;
public class Test {
	public static void main(String[] args) {
		Father father = new SonA();
		
		father.result();
		SonA sonA = new SonA();
		sonA.buyCigarette();
		
		
		System.out.println(IUserDao.AGE);
		System.out.println(IUserDao.USERNAME);
		
	}
}
