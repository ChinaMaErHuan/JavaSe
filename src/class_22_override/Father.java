package class_22_override;

public abstract class Father {
	private String username;

//	public Father() {
//
//	}

	public Father(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void goSleep(){
		System.out.println("去睡觉去吧...");
	}
	//抽象方法
	protected abstract void say();
}
