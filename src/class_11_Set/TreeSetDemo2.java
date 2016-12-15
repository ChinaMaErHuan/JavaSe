package class_11_Set;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * 
 * TreeSetDemo2
 * 创建人:maerhuan 
 * 时间：2016年4月15日-下午8:35:46 
 * @version 1.0.0
 *
 */
public class TreeSetDemo2 {
	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);//set.push(1)
		set.add(-3);//set.push(-3)
		set.add(11);//set.push(11)
		set.add(321);//set.push(321)
		set.add(15);//set.push(15)
		set.add(10);//set.push(10)
		set.add(-41);//set.push(-41)
		
		for (Integer integer : set) {
			System.out.println(integer+"======");
		}
		
		System.out.println("first==="+set.first());
		System.out.println("last==="+set.last());
		System.out.println(set.lower(15));//返回集合中小于指定元素之前的最大元素 // set[set.indexOf(15)-1]
		System.out.println(set.higher(15));//返回集合中大于指定元素之前的最大元素 // set[set.indexOf(15)+1]
		System.out.println(set.subSet(-3,11));//var arr = set.slice(set.indexOf(-3),set.indexOf(11));
		System.out.println(set.headSet(1));//返回一个小于-3的集合var arr = set.slice(0,set.indexOf(1));
		System.out.println(set.tailSet(10));//返回一个大于等于5的集合 var ar = set.slice(set.indexOf(15),set.length);
		
		
		
		
		TreeSet<Integer> seTreeSet= (TreeSet<Integer>) set.headSet(1);
		//SortedSet<Integer> seTreeSet= set.headSet(1);
		for (Integer integer : seTreeSet) {
			System.out.println(integer);
		}
		
		/**
		 * HashSet和TreeSet是Set的两个典型的实现，到底如何选择它们两者呢?HashSet的性能总是比TreeSet好，特别是添加，
		 * 查询元素等操作，因为TreeSet需要额外的红黑树算法来维护集合的顺序。只有当需要一个保持排序的Set时，我们才会用到TreeSet，
		 * 其他情况下都是使用HashSet。 HashSet还有一个子类，LinkedHashSet,对于普通的插入，删除操作，
		 * LinkedHashSet比HashSet性能要差一些
		 * ，只是由于维护链表所带来的额外开销造成的。但由于有了链表，遍历LinkedHashSet会更快。
		 * EnumSet是所有Set集合中性能最好的，但它只能保存同一个枚举类的枚举值作为集合元素。
		 * 必须指出的是：它们三个都不是线程安全的，如果有多个线程同时方位一个set集合
		 * ，并且有超过一个线程修改了该集合，则必须通过手动的方式保证Set集合的同步
		 * ，可以通过Collections的工具类的SynchronizedSortedSet方法来包装该Set集合
		 * ，此操作最好在创建时进行，以防止对Set集	的意外非同步访问。例如： SortedSet s =
		 * Collections.synchronizedSortedSet(new HashSet());
		 */
		
		
	}

}
