package class_12_list;

import java.util.ArrayDeque;

/**
 * 
 * 
 * Queue
 * 创建人:maerhuan 
 * 时间：2016年4月17日-下午3:34:59 
 * @version 1.0.0
 *
 */
public class ArrayDeque2 {
	public static void main(String[] args) {
		ArrayDeque<Integer> qArrayDeque = new ArrayDeque<>();
		qArrayDeque.offer(1);
		qArrayDeque.offer(2);
		qArrayDeque.offer(3);
		qArrayDeque.offer(4);
		qArrayDeque.offer(5);
		qArrayDeque.offerFirst(0);
		qArrayDeque.offerLast(6);
		
		for (Integer integer : qArrayDeque) {
			System.out.println(integer);
		}
		
		System.out.println("====================");
		System.out.println(qArrayDeque.getLast());
		System.out.println(qArrayDeque.getFirst());
		//获得头部和尾部
		System.out.println(qArrayDeque.peekLast());
		System.out.println(qArrayDeque.peekFirst());
		//去头去尾
		System.out.println(qArrayDeque.pollFirst());
		System.out.println(qArrayDeque.pollLast());
		
		for (Integer integer : qArrayDeque) {
			System.out.println(integer);
		}
		
	}
}
