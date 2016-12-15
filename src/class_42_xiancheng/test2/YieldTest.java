package class_42_xiancheng.test2;
public class YieldTest extends Thread {

	private int i;
	
	@Override
	public void run() {
		for (; i < 100; i++) {
			
			System.out.println(getName()+" ====> "+i);
			if(i==20){
				Thread.yield();// 暂停当前正在执行的线程对象，并执行其他线程
				//yield并不意味着退出和暂停，只是，告诉线程调度如果有人需要，可以先拿去，我过会再执行，没人需要，我继续执行）
//				try {
//					Thread.sleep(30);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		//启动第一个线程
		YieldTest t1 = new YieldTest();
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		//t1.join();
		
		//启动第二线程
		YieldTest t2 = new YieldTest();
		t2.setPriority(MIN_PRIORITY);
		t2.start();
	}
}
