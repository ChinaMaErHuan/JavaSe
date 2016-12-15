package class_27_fanxing;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		//泛型静态---类型参数化--Object--jdk1.7以后ArrayList不用指定类型
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(5000);
		list.add(6543212);
		
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
		for (int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			test((Integer) o);
		}
	}
	public static void test(Integer num){
		System.out.println(num);
	}
}

