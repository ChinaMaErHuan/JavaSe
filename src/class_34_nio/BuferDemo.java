package class_34_nio;

import java.nio.CharBuffer;

public class BuferDemo {
	public static void main(String[] args) {
		CharBuffer charBuffer =  CharBuffer.allocate(8);
		/**
		 * mark 
		 * limit:第一个不应该被写入或者读取的缓冲区的位置,封闭区域， 
		 * 
		 * position()返回buffer设置mark的位置，它只能在0和position中去标志。 
		 * 
		 * clear();准备迎接下一次缓冲数据重置了
		 * 
		 * flip反转缓冲区。首先将限制设置为当前位置，然后将位置设置为 0。
		 * 如果已定义了标记，则丢弃该标记。 常与compact方法一起使用。
		 * 通常情况下，在准备从缓冲区中读取数据时调用flip方法。
		 * 
		 */
		System.out.println("容量是"+charBuffer.capacity());
		System.out.println("limit是:"+charBuffer.limit());
		System.out.println("position:读取和写入的指针:"+charBuffer.position());
		charBuffer.put('a');
		charBuffer.put('b');
		charBuffer.put('c');
		System.out.println("加入三个以后的位置是："+charBuffer.position());//3
		charBuffer.flip();
		System.out.println("flip  position 加入三个以后的位置是："+charBuffer.position());
		System.out.println("flip  limit："+charBuffer.limit());
		
		charBuffer.clear();//准备迎接下一次缓冲数据重置了
		System.out.println("clear position 加入三个以后的位置是："+charBuffer.position());
		System.out.println("clear limit："+charBuffer.limit());
		
	}
}
