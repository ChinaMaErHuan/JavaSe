package class_30_enum;
public class DBEnumTest {
	public static void main(String[] args) {
		DBEnum dbEnum = DBEnum.valueOf("MYSQL");
		System.out.println(dbEnum.getDriver());
		System.out.println(dbEnum.getUrl());
		System.out.println(dbEnum.getPassword());
		System.out.println(dbEnum.getUsername());
	}
}
