package class_11_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		
		//List是有序的  有重复的集合,不会去重 实现原理是数组,有长度 默认长度是10,
		//一旦调用方法add超过了10个以后  会自动扩展 是原来length1.5倍 
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		list.add(null);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		
		
		
		System.out.println("size="+list.size());
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
		
		Integer[] nums2 = {1,2,3,4,5,6,7,8,9,10};
		
		Integer[] nums3= Arrays.copyOf(nums2, 4);//快速将一个数组的元素拷贝成为一个新的数组对象，并且初始化长度
		System.out.println(nums3.length);
		
	}
}
