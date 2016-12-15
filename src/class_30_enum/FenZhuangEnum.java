package class_30_enum;
//WEEK_Sunday, // 星期日
//WEEK_Monday, // 星期一
//WEEK_Tuesday, // 星期二
//WEEK_Wednesday, // 星期三
//WEEK_Thursday, // 星期四
//WEEK_Friday, // 星期五
//WEEK_Saturday; // 星期六
public class FenZhuangEnum {
	public static void getPlan(WEEKEnum weeknum){
		switch (weeknum) {
		case WEEK_Sunday:
			System.out.println("今天是星期日,我要睡觉...");
			break;
		case WEEK_Monday:
			System.out.println("今天是星期一,我要去爬山..");
			break;
		case WEEK_Tuesday:
			System.out.println("今天是星期二,我要游泳...");
			break;
		case WEEK_Wednesday:
			System.out.println("今天是星期三,....");
			break;
		case WEEK_Thursday:
			System.out.println("今天是星期四,....");
			break;
		case WEEK_Friday:
			System.out.println("今天是星期五...");
			break;
		case WEEK_Saturday:
			System.out.println("今天是星期六...");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		WEEKEnum weekEnum = WEEKEnum.valueOf("WEEK_Sunday");
		getPlan(weekEnum);
	}
}
