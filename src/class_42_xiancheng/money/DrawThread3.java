/**
 * Tm系统平台
 * JavaSe
 * class_42_xiancheng.money
 * DrawThread3.java
 * 创建人:maerhuan 
 * 时间：2016年10月13日-下午10:53:04 
 * 2016Tm公司-版权所有
 */
package class_42_xiancheng.money;
public class DrawThread3 extends Thread {
	//取钱账户
	private Account account;
	//取多少钱
	private double money;
	
	public DrawThread3(String name,Account account,double money){
		super(name);//getName()获取 如果是Runnable是没有getName方法，Thread.currentThread.getName();
		this.account = account;
		this.money = money;
	}

	public void run(){
		account.save(getName(), money);
	}
}
