package class_29_instanceof;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstanceOfDemo {
	public static void main(String[] args) {

		Father a1 = new Children();
		System.out.println(a1 instanceof Father);
		System.out.println(a1 instanceof Children);

		ArrayList<Integer> a = new ArrayList<>();
		System.out.println(a instanceof ArrayList<?>);
		System.out.println(a instanceof Collection);

		User user = new User(1,"ke");
		User user2 = new User(1,"ke");
		System.out.println(user.equals(user2));
		
		Set<User> users = new HashSet<>();
		users.add(user);
		users.add(user);
		System.out.println(users.size());

		// 覆盖eqauls和hashcode方法的真正目的其实就是为：过滤数据,如何判断多条数据中，是否存心重复的记录
		/**
		 * equals有一个作用，覆盖以后可以判别两个对象是一致的。
		 */
	}
}
