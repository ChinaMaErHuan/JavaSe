/**
 * Tm系统平台
 * JavaSe
 * class_42_xiancheng
 * MyThread.java
 * 创建人:maerhuan 
 * 时间：2016年10月12日-下午11:12:36 
 * 2016Tm公司-版权所有
 */
package class_42_xiancheng.exp;
public class MyThread extends Thread {
	private int i=0;
	public void run(){
		for (;i < 100;i++) {
			System.out.println("进程:"+getName()+"==="+i+"优先级："+getPriority());
		}
	}
}
