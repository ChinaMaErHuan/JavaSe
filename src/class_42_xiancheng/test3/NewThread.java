/**
 * Tm系统平台
 * JavaSe
 * class_42_xiancheng.test3
 * NewThread.java
 * 创建人:maerhuan 
 * 时间：2016年10月13日-下午9:16:42 
 * 2016Tm公司-版权所有
 */
package class_42_xiancheng.test3;
public class NewThread implements Runnable {

	String name;
	Thread t;
	public NewThread(String threadname){
		name = threadname;
		t=new Thread(this,name);
		System.out.println("newthread"+t);
		t.start();
	}
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+"退出");
		}
	}
	
	public static void main(String[] args) {
		NewThread o1 = new NewThread("线程1");
		NewThread o2 = new NewThread("线程2");
		NewThread o3 = new NewThread("线程3");
		System.out.println("o1活着么？"+o1.t.isAlive());
		System.out.println("o2活着么？"+o2.t.isAlive());
		System.out.println("o3活着么？"+o2.t.isAlive());
		System.out.println("等你们死了");
		try {
			o1.t.join();
			//o2.t.join();
			//o3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("o1活着么？"+o1.t.isAlive());
		System.out.println("o2活着么？"+o2.t.isAlive());
		System.out.println("o3活着么？"+o2.t.isAlive());
		System.out.println("主线程结束");
	}
	
}
