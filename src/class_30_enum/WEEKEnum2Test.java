package class_30_enum;
public class WEEKEnum2Test {
	public static void main(String[] args) {
		
		//枚举类是不能new对象的 所以创建对象的方式有以下两种:
		WEEKEnum weekEnum = WEEKEnum.valueOf("WEEK_Sunday");
		
		System.out.println(weekEnum.getNameString());
		//创建对象的第二种方式:
		WEEKEnum weekEnum2 = WEEKEnum.valueOf(WEEKEnum.class,"WEEK_Sunday");
		
		System.out.println(weekEnum2.getNameString());
	}
}
