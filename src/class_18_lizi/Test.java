package class_18_lizi;
public class Test {
	public static void main(String[] args) {
		DianXin dianXin = new DianXin("maerhuan","电信");
		String result1 = dianXin.sendMessage("哈哈哈");
		System.out.println(result1);
		
		YiDong yiDong = new YiDong("maerhuan","移动");
		String result2 = yiDong.sendMessage("是的粉红色");
		System.out.println(result2);
		
		LianTong lianTong = new LianTong("maerhuan","联通");
		String result3= lianTong.sendMessage("的撒后付款时间的");
		System.out.println(result3);
	}
}
