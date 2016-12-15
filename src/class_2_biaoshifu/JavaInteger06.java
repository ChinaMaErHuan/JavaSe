package class_2_biaoshifu;

public class JavaInteger06{

	public static void main(String[] args){
		
		double c = 59.8998;

		int money = (int)c; //直接丢掉小数，留下整数部分，不会四舍五入。
		//在开发过程，命令进制在万不得已的情况下，不允许使用强制数据类型转换，为什么呢？
		console(money);


	}

	//打印方法
	public static void console(Object message){
		System.out.println("打印的结果是："+message);
	}
}
