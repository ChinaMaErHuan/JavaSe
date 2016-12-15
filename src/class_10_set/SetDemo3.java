package class_10_set;

import java.util.HashSet;

public class SetDemo3 {
	public static void main(String[] args) {
		HashSet<Integer> ages = new HashSet<>();
		ages.add(10);
		ages.add(20);
		ages.add(30);
		ages.add(40);
		ages.add(50);
		HashSet<Integer> ages2 = new HashSet<>();
		ages2.add(8);
		ages2.add(10);
		ages2.add(20);
		ages2.add(30);
		ages2.add(70);
		ages2.add(80);
		
		//ages.addAll(ages2);
		System.out.println(ages2.contains(20));
		System.out.println(ages2.contains(100));
		System.out.println(ages.containsAll(ages2));
		//retainAll方法用于从列表中移除未包含在指定collection中的所有元素。交集
		//ages.retainAll(ages2);
		//ages2.retainAll(ages);
		for (Integer integer : ages2) {
			System.out.println(integer);
		}
	}
}
