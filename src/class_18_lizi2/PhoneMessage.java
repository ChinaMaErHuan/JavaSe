package class_18_lizi2;

public class PhoneMessage {
	private String company;
	private String username;

	public PhoneMessage() {
		super();
	}

	public PhoneMessage(String username) {
		super();
	}

	public String sendMessage(String message) {
		return this.username + "==信号来自" + this.company + "==发送的内容是:" + message;
	}

	public void callPhone(String telephone) {
		System.out.println(this.username + "用" + this.company + "的电话拨通了"
				+ telephone);

	}
	// 因为这个父类中的方法被重写了 在调用的过程中 永远都不会使用到 所以这两个方法就是毫无意义的 这时我们就用到了抽象类
}
