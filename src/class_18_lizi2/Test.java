package class_18_lizi2;
public class Test {
	public static void main(String[] args) {
		PhoneMessage2 message = new YiDong("keke");
		//产生了多态 所以父类的构造方法就显的没有任何意义
		String result = message.sendMessage("我用的是移动的");
		if(result=="success"){
			System.out.println("发送成功...");
		}
		message.callPhone("156...");
		
		
		PhoneMessage2 message2 = new DianXin("maerhuan");
		String result2 = message2.sendMessage("我用的是电信的");
		if(result2=="success"){
			System.out.println("发送成功...");
		}
		
		PhoneMessage2 message3 = new LianTong("wangsisi");
		String result3 = message3.sendMessage("我用的是联通的");
		if(result3=="success"){
			System.out.println("发送成功...");
		}
	}
}
