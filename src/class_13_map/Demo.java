package class_13_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("keke");
		list.add("小任");
		list.add("蚂蚁");
		list.add("小白");
		list.add("lee");

		// hashcode机制 为了保证元素的hashcode值得唯一 例如：
		// aa hashcode至是：97*31+97;乘素数
		// 但是即使是这种机制 还是会出现相同的hashcode值 所以才有 了链表
		// hashmap

		// Map ---HashMap--获取数据快速，存储能力方便，
		// key存储的是hashcode值不允许重复--set维护关系--里面是通过一个entry对象维护key--value的关系。entry是链表的维护关系
		/**
		 * 
		 * map.put(key,value); 添加元素 map.get(key 获取元素) map.containsKey(key)
		 * map.isEmpty() map.remove(key) map.values() map.entrySet()
		 * map.keySet() //分配entry---key转成hashcode存在一个entry中，然后把entry用集合存储起来
		 * get(key),---key转成hashcode和name--在集合中去找entry有没有有返回引用调用getValue方法
		 */
		 //Map<String, Object> map = new HashMap<>();
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "keke");
		map.put("address", "changsha");

		map.put("age", "30");
		map.put("phone", "15675858943");
		// map.remove("name");

		map.replace("age", "30", "33");

		System.out.println(map.get("name"));
		System.out.println(map.isEmpty());
		System.out.println(map.toString());
		System.out.println(map.containsKey("name"));

		// keys
		// Set<String> keys= map.keySet();
		// for (Object object : keys) {
		// System.out.println(object);
		// }

		// values
		// Collection<Object> objects= map.values();
		// for (Object object : objects) {
		// System.out.println(object);
		// }

		// map也可以循环的 entrySet()
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=====" + entry.getValue());
		}

		// 迭代器循环
		// Set<String> keySet = map.keySet();
		// java.util.Iterator<String> iterator = keySet.iterator();
		// while (iterator.hasNext()) {
		// String key = iterator.next();
		// System.out.println(key+"===="+map.get(key));
		//
		// }

		// remove add set都可能随时会碰到数组扩容的临界点，进行频繁的内存数组的拷贝和覆盖操作。数据可能会丢失
		// ArrayList是线程不安全的。

		// Set HashSet LinkedHashSer EnumSet TreeSet<E>
		// Map HashMap LinkedHashMap EnumMap TreeMap<E>
		// TreeMap也有天然的排序功能
		
		
		
		
		/**
		 * HashMap：我们最常用的Map，它根据key的HashCode 值来存储数据,根据key可以直接获取它的Value，
		 * 同时它具有很快的访问速度。 HashMap最多只允许一条记录的key值为Null(多条会覆盖);允许多条记录的Value为
		 * Null。非同步的。
		 *  TreeMap: 能够把它保存的记录根据key排序,默认是按升序排序，也可以指定排序的比较器， 当用Iterator
		 * 遍历TreeMap时，得到的记录是排过序的。TreeMap不允许key的值为null。非同步的。 
		 * Hashtable: 与HashMap类似,不同的是:key和value的值均不允许为null;
		 * 它支持线程的同步，即任一时刻只有一个线程能写Hashtable,因此也导致了Hashtale在写入时会比较慢。
		 * LinkedHashMap: 保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，
		 * 先得到的记录肯定是先插入的.在遍历的时候会比HashMap慢。key和value均允许为空，非同步的。
		 */

		// Hashtable<K, V>线程安全的

	}
}
