package class_30_enum;

public class GenderTest {
	public static void main(String[] args) {

		Gender2 gender2 = Gender2.valueOf("MALE");
		gender2.setName("女");// 限制了
		System.out.println(gender2.getName());
		
		
		Gender2 gender22 = Gender2.valueOf("MALE");
		gender22.setName("男");// 限制了
		System.out.println(gender22.getName());
		
		
		
		Gender3 gender3 = Gender3.valueOf("MALE");
		
		System.out.println(gender3.getName());
		
		
		Gender4 gender4 = Gender4.valueOf("MAN");
		gender4.message();

	}
}
