package class_12_list;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Deque2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue(100);
		LinkedList<Integer> list = new LinkedList<>();
		//linkedList实现原理是List+Queue
		//在开发中我们大部分时候是使用ArrayList，但是在牵涉到元素的插入和删除的时候包括大量的数据的集合的操作 
		//用LinkedList比较合理因为LinkedList是通过一种队列去维护数组的 
		
		queue.offer(10);
		queue.peek();
		
		
		
	}

}
