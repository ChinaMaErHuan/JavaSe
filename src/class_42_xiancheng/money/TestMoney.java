/**
 * Tm系统平台
 * JavaSe
 * class_42_xiancheng.money
 * TestMoney.java
 * 创建人:maerhuan 
 * 时间：2016年10月13日-下午4:00:13 
 * 2016Tm公司-版权所有
 */
package class_42_xiancheng.money;
public class TestMoney {
	public static void main(String[] args) {
		Account account = new Account("中国银行",1000);
	
		//取钱--钱够-吐钞，如果不够，---余额不足
		//三个线程其实是各做各的事，各取各的钱 互不干扰 这种任务有时候是不现实的 为了解决它 我们可以同步方法和同步对象
		Thread keke = new DrawThread("柯柯", account, 300);
		keke.start();
		
		Thread meh = new DrawThread("柯柯2", account, 200);
		meh.start();
		Thread meh2 = new DrawThread("柯柯3", account, 300);
		meh2.start();
//		 keke = new DrawThread3("柯柯3", account, 300);
//		keke.start();
				
		Thread xiaochen = new DrawThread("小晨", account, 100);
		xiaochen.start();
				
		Thread xiaobin = new DrawThread("小斌", account, 900);
		xiaobin.start();
		
		short a = 128;
		byte b = (byte)a;
		System.out.println(a+"==="+b);
		
	}
}
