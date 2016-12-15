package class_10_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * 
 * 
 * ArraydDmo 创建人:maerhuan 时间：2016年4月7日-下午3:45:39
 * 
 * @version 1.0.0
 * 
 */
public class ArraydDmo {
	public static void main(String[] args) {
		/**
		 * 数组的缺点是明显的:长度固定不能添加元素和删除元素 只能修改值 Arrays 工具类
		 * 
		 * Set -----集合就是为了弥补数组的静态性，动态扩展一个形式。
		 * 
		 * JDK1.8---集合---stream(统计学：平均数，个数，过滤，) 和lam表达对集合的操作的封装
		 */
		// 数组的定义有两种:
		Integer[] nums = { 110, 1, 2, 3, 4, 5, 6 };
		// Integer[] nums2 = new Integer[10];
		Arrays.sort(nums);
		// Arrays.sort(nums,new IntegerComparator(false));
		// Arrays.sort(nums,new ObjectComparator(false));
		// Arrays.fill(nums,2);//快速初始化
		// for (Integer integer : nums) {
		// System.out.print(integer+"\t");
		// }

		// 在开发中用的最多的是List ---ArrayList Map---Hashmap
		// 接口是一个规范---一定一个约束子类的命名规则和行为
		// 增删插改，长度，索引 循环 排序 去重，取交集，

		/**
		 * Collection顶级接口中：
		 * Collection接口是List和Set和Queue接口的父接口，该接口即可以操作Set集合也可以用于操作List和Queue集合
		 * ，其中通用的方法如下： boolean add(Object o)
		 * ：为集合添加元素，如果被添加到集合中改变集合的长度，添加成功返回true; boolean addAll(Collection c)
		 * 该方法把集合c里所有的元素添加到指定的集合里。 void clear():清空集合，长度变0. boolean
		 * contains(Object c):判断元素是否在集合中。 boolean containsAll(Collection
		 * c):判断某集合是否包含另外一个集合所有的元素，如果是返回:true boolean
		 * isEmpty();判断集合是否为空，如果size=0;返回true否则false. Iterator
		 * iterator()返回一个迭代对象，用于遍历集合里的元素。 boolean remove(Object
		 * c);根据某个元素从集合中删除。改变长度 boolean removeAll(Collection
		 * c);删除一个集合中在另外一个集合中的所有元素。如果删除有一个或者多个返回true;否则false; boolean
		 * retainAll(Collection c);从集合中删除集合c里不包含的元素， int size();获取集合的长度 object[]
		 * toArray() 该方法把一个集合快速的转换成数组。
		 * Set子元素有一个特征：不允许出现相同的元素，里面进行过滤，每次执行是无序进行存储. 里面叫hashcode--
		 * 
		 */

		/**
		 * Set底层是通过hashCode实现的 所以就决定了他的元素的唯一性
		 * 
		 * 1.Set集合不允许包含相同的元素，如果试图把两个相同的元素加入到一个对象中，则添加失败，add方法返回false，且元素
		 * 不会被加入，他的子类有HashSet TreeSet EnumSet
		 * 三个实现类，HashSet()是Set接口的典型实现，大多数时候使用Set
		 * 集合时，就是使用该类，HashSet是按照hash算法来存储集合中的元素，特点如下: 1.不能保证元素的排列顺序。
		 * 2.非线程安全的，如果多个线程同时访问一个HashSet，可能会造成数据的窜行 3.集合元素可以为null 只能有一个
		 * 
		 * 2.当向一个HashSet集合中存入一个元素时，HashSet会调用对象的HahCode()方法来得到对象的HashCode值，
		 * 然后根据这个值 来决定该对象在HashSet中的存储位置，如果两个元素的equals()返回true，但是hashcode值不一样，
		 * HashSet会把他们放在 不一样的位置
		 * 
		 * 3.LinkedHashset性能低于HashSet的性能，但是在取数组的时候有很好的性能
		 * 
		 * 4.TreeSet是SortTable接口的实现类，比HashSet新增了一些功能，
		 * 
		 * 
		 * 
		 */

		// Set s1 = new HashSet<>();// 只能调用Set中被覆盖的方法和属性 不能调用HashSet自己的方法
		// Set s2 = new LinkedHashSet<>();
		// Set s3 = new TreeSet<>();

		Set<Integer> ageSet = new HashSet<>();
		ageSet.add(20);
		ageSet.add(320);
		// System.out.println(ageSet.add(20));//false
		ageSet.add(40);
		ageSet.add(50);
		ageSet.add(630);

		// for (int i = 0; i <=100000; i++) {
		// ageSet.add(i);//不是连续的
		// }
		// for (Integer integer : ageSet) {
		// System.out.println(integer);
		// }//无序的
		for (Iterator iterator = ageSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);

		}

	}
}
