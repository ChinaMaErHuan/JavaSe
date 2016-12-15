package class_11_Set;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import class_10_set.Student;
import class_8_Array.IntegerComparator;

/**
 * 
 * 
 * SetDemo 创建人:maerhuan 时间：2016年4月12日-下午7:20:50
 * 
 * @version 1.0.0
 * 
 */
public class SetDemo {
	public static void main(String[] args) throws ParseException {
		String kekString = "我是深刻揭露和反对撒";
		System.out.println(kekString.hashCode());
		System.out.println(kekString.toString());
		// hashCode是jdk根据对象的地址或者字符串或者数字算出来的int类型的数值 详细了解请 参考 [1]
		// public int hashCode()返回该对象的哈希码值。支持此方法是为了提高哈希表（例如 java.util.Hashtable
		// 提供的哈希表）的性能。
		// 如果两个hashCode()返回的 结果相等，则两个对象的equals方法不一定相等。

		// 比较一定是通过比较值的 ==比较比较的是内存地址和值 而equals比较的是值 相同数据类型用equals

		HashSet<String> hh = new HashSet<>();
		hh.add("ahha");

		Student student = new Student("maerhuan", 22, 99);
		System.out.println(student.toString());
		System.out.println(student);

		// Set
		// 无序，不允许重复---根据hashcode去比较两个元素是否不相同，如果相同会自动调用equals方法去比较，如果比较是true,自然过滤掉，
		// Set它允许存储null值

		Set<Integer> nums = new HashSet<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(50);
		nums.add(50);
		nums.add(null);
		// for (Integer integer : nums) {
		// System.out.println(integer);
		// }

		// LinkedHashSet<E>有序的 是HashSet的子类 性能差一些
		// 链表来维护有序序列--性能要比hashset要差一些--多线程--任务分发
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		
		set2.add(20);
		set2.add(30);
		set2.add(40);
		set2.add(260);
		set2.add(50);
		set2.add(22);
		set2.add(22);
		

//		 for (Integer integer : set2) {
//		 System.out.println(integer);
//		 }

		// TreeSet---红黑树算法--来维护元素的顺序---内置了一个排序器
		// TreeSet会调用集合中的一个方法叫conpareTo(Object o)的方法比较元素的大小关系，这种方式排序叫自然排序(升序),
		// 如果你想你通过改变排序的规则，那么你可以自定一个类实现Comparator接口，覆盖compare方法的进行比较。
		// jdk为Comparator接口提供了一个默认排序机制：
		// 1:八种封装数据类型和BigDecimal和BigInteger等都是根据数值的大小进行比较排序
		// 2:Character,String会自动根据字符或者字符串的unicode值进行比较
		// 3:Date，Time都是根据日期比较来进行排序

		TreeSet<Integer> tree = new TreeSet<>(new IntegerComparator(false));
		tree.add(20);
		tree.add(60);
		tree.add(40);
		tree.add(50);
		// 默认的升序的
		//System.out.println(tree.comparator());
//		for (Integer integer : tree) {
//			System.out.println(integer);
//		}
		System.out.println("============");
		TreeSet<Integer> tree2 = new TreeSet<>();
		tree2.add(20);
		tree2.add(60);
		tree2.add(40);
		tree2.add(50);
		// 默认的升序的
		//System.out.println(tree2.comparator());
//		for (Integer integer : tree2) {
//			System.out.println(integer);
//		}
		
		
		
		
		//TreeSet<Date> setd = new TreeSet<>();
		//TreeSet<Date> setd = new TreeSet<>(new DateComparator(false));
		TreeSet<Date> setd = new TreeSet<>(new DateComparator());
		
		setd.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-12-12 12:12:11"));
		setd.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-08-12 01:12:08"));
		setd.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2014-03-12 11:12:12"));
		setd.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2012-02-12 01:12:10"));
		setd.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2012-10-12 01:12:10"));
		setd.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-12-12 02:11:22"));
		setd.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-11-12 11:12:24"));
		
		for (Date date : setd) {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
		}
		/*
		 * jdk--数值型和 布尔型
		 * 八种基础数据类型
		 * byte short int long 0
		 * float double  0.0
		 * char \u0000
		 * 
		 * 
		 * 其他的都是null作为默认值
		 * 
		 * 
		 * boolean
		 * 
		 * 
		 * */
		
	}

}
