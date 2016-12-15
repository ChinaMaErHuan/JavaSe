package class_42_xiancheng.test2;
public class SecondThread implements Runnable{

	private int i;

	@Override
	public void run() {
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" ====> "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
				//启动第一个线程
				SecondThread thread = new SecondThread();
				Thread t1 = new Thread(thread);
				t1.start();
				Thread t2 = new Thread(thread);
				t2.start();
				t1.join();
				t2.join();
				
			
			
		
			System.out.println("主线程结束");
	}
}
