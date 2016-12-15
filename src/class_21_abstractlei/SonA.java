package class_21_abstractlei;
public class SonA extends Father{
	public String password;
	protected double money;
	@Override
	public void buyCigarette() {
		// TODO Auto-generated method stub
		System.out.println("SonA走路去买烟...");
	}
	@Override
	public void doExam() {
		// TODO Auto-generated method stub
		System.out.println("SonA去考试...");
	}
	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("SonA有结果...");
	}
	
}
