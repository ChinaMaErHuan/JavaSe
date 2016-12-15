package class_18_lizi;
public class PhoneMessage {
	private String company;
	private String username;
	
	public PhoneMessage(){
		super();
	}
	
	public PhoneMessage(String username,String company){
		super();
		this.username = username;
		this.company = company;
	}
	public String sendMessage(String message){
		return this.username+"==信号来自"+this.company+"==发送的内容是:"+message;
	}
}
