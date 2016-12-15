package class_30_enum;
public class WEEKEnumTest {
	public static void main(String[] args) {
//		System.out.println(WEEKEnum.WEEK_Monday);
//		System.out.println(WEEKEnum.WEEK_Tuesday);
//		System.out.println(WEEKEnum.WEEK_Wednesday);
//		System.out.println(WEEKEnum.WEEK_Thursday);
//		System.out.println(WEEKEnum.WEEK_Friday);
//		System.out.println(WEEKEnum.WEEK_Saturday);
//		System.out.println(WEEKEnum.WEEK_Sunday);
		System.out.println(WEEKEnum.WEEK_Friday.ordinal());//位置  在枚举类中的位置
		System.out.println(WEEKEnum.WEEK_Saturday.name());
		
		System.out.println(WEEKEnum.WEEK_Sunday.getDeclaringClass());
		System.out.println(WEEKEnum.WEEK_Sunday.getClass());
		
		
		//循环获取
//		for(WEEKEnum weekEnum:WEEKEnum.values()){
//			System.out.println(weekEnum.name());
//		}
		
		// byte short int char 枚举 1.7以后 String
		//WEEK_Monday, WEEK_Tuesday, WEEK_Wednesday, WEEK_Thursday, WEEK_Friday, WEEK_Saturday, WEEK_Sunday;
		//switch(obj)obj是枚举类的对象
		
		WEEKEnum weekEnum =  WEEKEnum.valueOf("WEEK_Monday");
		switch (weekEnum) {
		case WEEK_Sunday:
			System.out.println("今天是星期日...");
			break;
		case WEEK_Monday:
			System.out.println("今天是星期一...");
			break;
		case WEEK_Tuesday:
			System.out.println("今天是星期二...");
			break;
		case WEEK_Wednesday:
			System.out.println("今天是星期三...");
			break;
		case WEEK_Thursday:
			System.out.println("今天是星期四...");
			break;
		case WEEK_Friday:
			System.out.println("今天是星期五...");
			break;
		case WEEK_Saturday:
			System.out.println("今天是星期六...");
			break;
		default:
			System.out.println("你记错了日期啦...");
			break;
		}
		
		
	}
}
