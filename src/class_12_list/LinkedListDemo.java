package class_12_list;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 
 * 
 * LinkedListDemo 创建人:maerhuan 时间：2016年4月17日-下午3:56:10
 * 
 * @version 1.0.0
 * 
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> integers = new LinkedList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);

		System.out.println(integers.get(1));
		System.out.println(integers.peek());// 不会remove
		System.out.println(integers.poll());// 得到以后再remove掉

		// LinkedList是Queue+List的融合
		// 双向的队列---
		//单向队列只能操纵队列头的元素
		// Queue 先进先出-
		// 栈：先进后出的概念
		// Queue<Integer> queue =new ArrayDeque<>();

		/*优先级队列是不同于先进先出队列的另一种队列。每次从队列中取出的是具有最高优先权的元素。
		　PriorityQueue是从JDK1.5开始提供的新的数据结构接口。
		　如果不提供Comparator的话，优先队列中元素默认按自然顺序排列，也就是数字默认是小的在队列头，字符串则按字典序排列。*/
		PriorityQueue<Integer> queue = new PriorityQueue(100);
		queue.add(100);// 无序的 不允许null
		queue.add(3);
		queue.add(9999);
		queue.add(4);
		queue.add(6);
		
		

		// System.out.println(queue.peek());//获取是队列头元素,不删除队列的元素
		// System.out.println(queue.poll());//获取是队列头元素,删除队列中的元素
		// System.out.println(queue.remove(88));//删除队列中指定的元素
		// queue.element();//等价于peek()方法
		// queue.remove();等价于poll();
		// offer()等价于add();

		for (Integer integer : queue) {
			System.out.print(integer + "\t");
		}

	}
}
