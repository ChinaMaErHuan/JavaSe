package class_10_set;

import java.util.HashSet;

public class SetDemo4 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> ageSet = new HashSet<>();
		ageSet.add(20);
		ageSet.add(30);
		ageSet.add(40);
		ageSet.add(50);
		
		/*ageSet.removeIf(age->age.equals(20));
		ageSet.removeIf(age->age>20);
		System.out.println("删除以后的元素是:");
		for (Object integer : ageSet) {
			System.out.println(integer);
		}*/
		
		HashSet<String> books = new HashSet<>();
		books.add("是的发送到发送到水电费");
		books.add("123");
		books.add("123456");
		books.add("是的地方");
		books.add("水电费水电费水电费");
//		books.removeIf(book->book.length()>5);
//		books.removeIf(book->book.indexOf("123")!=-1);
//		books.removeIf(book->book.endsWith("水电费"));
//		books.removeIf(book->(!book.contains("的")  && book.endsWith("方")));
		
		//把不包含的
		for (String string : books) {
			System.out.println(string);
		}
		
	}
}
