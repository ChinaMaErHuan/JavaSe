/**
 * Tm系统平台
 * JavaSe
 * class_42_xiancheng
 * MyRunable.java
 * 创建人:maerhuan 
 * 时间：2016年10月12日-下午11:18:05 
 * 2016Tm公司-版权所有
 */
package class_42_xiancheng.exp;
public class MyRunable implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	private int i;
	@Override
	public void run() {
			//要执行的任务--都一种任务--抓取网页（）存数据库
			for (; i < 100; i++) {
				System.out.println(Thread.currentThread().getName()+"=="+i);
			}
	}

}
