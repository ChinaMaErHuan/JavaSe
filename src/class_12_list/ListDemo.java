package class_12_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * 
 * ListDemo
 * 创建人:maerhuan 
 * 时间：2016年4月16日-下午7:48:27 
 * @version 1.0.0
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		/**
		 * 在java中数组一旦被定义 就不能改变数组的长度了 值的修改只能通过覆盖来实现 这就是数组的缺陷 所以就引入 了集合
		 * 
		 * 回忆:set和list都是collections接口下的
		 * Set集合接口下的:
		 * 				HashSet--->LinkedHashSet 通过链表类维护数据的
		 * 				SortedSet--->TreeSet  红黑树算法来实现排序 默认升序
		 * 				Numset---枚举
		 * 	HashSet集合石无序的不可重复的
		 *  LinkedHashSet是有序的 不可重复的
		 *  TreeSet是有序的 不可重复的 内置了排序器来维护元素的顺序
		 *  Set集合实现的原理是HashCode和equals() 都不是线程安全的 
		 *  
		 *  
		 *  List:实现的原理是数组 元素是有序的 可重复的 有默认的索引 就是动态数组
		 *  	Vector---->Stack
		 *  	ArrayList	---jdk1.5以后引入的 默认的长度是10 一旦超过就调用扩展因子并惊进行拷贝扩展为原来的1.5倍
		 *  		
		 * Arrays.asList(a)数组转集合 	a是数组
		 * Integer[] nums2 = new Integer[set.size()];
		 * set.toArray(nums2)/集合转成数组 nums2是存放set的数组
		 */
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.set(0, 100);
		
		
		
		
		
		
		//list.add(1, 100);//插队的意思
		//list.remove(1);
		//list.clear();
		
		//list.forEach(x=>x=x+1);//lamba表达式
		
		//list.addAll(c);//添加集合的方法
		//list.addAll(2, c)//指定的位置上索引为2的位置上添加集合 其余的元素向后移
		System.out.println(list.subList(0, 5));
		//System.out.println(list.contains(1));
		System.out.println("list.indexOf(1)"+"====="+list.indexOf(1));
		System.out.println("list.lastIndexOf(5)"+"======="+list.lastIndexOf(5));
		System.out.println("list.get(2)"+"==========="+list.get(2));
		//System.out.println(list.indexOf(list.get(2)));
		System.out.println(list.isEmpty());
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(7);
		list2.add(7);
		list2.add(9);
		list.addAll(list2);
		
		Stream<Integer> stream = list.stream().distinct();
		//Stream<Integer> stream = list.stream().filter(x->x<0);
		
		Iterator<Integer> iterator = stream.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().intValue());
		}
		
		
		
		
		
		//list.addAll(2, list2);
		
		
		//System.out.println(list.containsAll(list2));
		
		//System.out.println(list.retainAll(list2));
		
		
		
		
		
		
		
		
		
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
		
		
		
		//jdk1.8新增了list的方法 sort  replaceAll
		
		
	}
}
