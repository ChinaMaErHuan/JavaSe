package class_18_mianshi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class One {
	public static void main(String[] args) {
		// 1.错误 没有加{}
		// for(int i = 0;i<10;i++)
		// Integer integer = new Integer(i);
		// System.out.println("Hello World");
		// 2.
		// for(int i = 0;i<10;i++);
		// Integer integer = new Integer(i);//i没有定义
		// System.out.println("Hello World");
		// 3.
		// int i;
		// for( i = 0;i<=10;i++)
		// {
		// Integer integer = new Integer(i);
		// System.out.println(i+"Hello World");
		// }
		// Integer integer = new Integer(i);
		// System.out.println(integer);

		

		/**
		 * HashMap最多只允许一条记录的key值为Null(多条会覆盖);允许多条记录的Value为 Null。非同步的。
		 * 
		 * TreeMap不允许key的值为null。非同步的。
		 * 
		 * HashTable()key和value的值均不允许为null
		 * 
		 * LinkedHashMap()key value 都允许为空
		 * 
		 */
		 //Hashtable<String,String> hashtable = new Hashtable<>();
		 //hashtable.put(null,null);
		// hashtable.put(null,null);
		// System.out.println(hashtable.get(null));

		Map<String, String> map = new HashMap<>();
		map.put("1a", "1");
		map.put("2a", "2");
		map.put("3a", "3");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getValue()+entry.getKey());
		}
		
//		Father aFather = new Father();
//		System.out.println(aFather.getName());
		
//		Father bFather = new Children();
//		System.out.println(bFather.getName());
		
		Children aChildren = new Children();
		System.out.println(aChildren.getName());
		
		
		 new Z();
		 //Y X Y Z

	}
}
