/**
 * Tm系统平台
 * JavaSe
 * class_42_xiancheng
 * Test.java
 * 创建人:maerhuan 
 * 时间：2016年10月12日-下午11:14:22 
 * 2016Tm公司-版权所有
 */
package class_42_xiancheng.exp;
public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("主线程开始运行");
		//一个线程类继承Thread它是一个独立的线程
//		Thread aThread1 = new MyThread();
//		aThread1.start();
//		Thread aThread2 = new MyThread();
//		aThread2.start();
		
		//线程类--任务 100 0 1 2 3 4 5 6 7 8 9  
		MyRunable runnable = new MyRunable();
				
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
				
		thread1.start();
		thread2.start();
		thread1.join();
		//thread2.join();//确保主线程最后结束
		System.out.println("主线程结束");
	}
}
