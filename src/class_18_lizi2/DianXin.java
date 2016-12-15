package class_18_lizi2;

public class DianXin extends PhoneMessage2 {
	private String company="电信";
	private String username;
	
	
	public DianXin(String username){
		//this.username = username;
		super(username);
	}
	
	@Override
	public String sendMessage(String message) {
		System.out.println(this.company+"用户"+this.username+"发送的短信内容是:"+message);
		System.out.println("扣除4毛钱");
		return "success";
	}

	@Override
	public void callPhone(String telephone) {
		System.out.println(this.company+"的用户"+this.username+"拨通了电话号码:"+telephone);
		System.out.println("扣除4块");
	}
}