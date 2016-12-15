package class_2_biaoshifu;

public class JavaInteger03{


	public static void main(String[] args){
		/*
			float类型:如果接受整型，
			定义是比较特殊：
			如果float接受的是一个整数.不需要加f或者F
			但是如果是小数一定要加f或者F

			因为java一个小数的默认数据类型是:double
		*/
		float c = 100f;
		float d = 36.5f;//JavaInteger03.java:12: 错误: 不兼容的类型: 从double转换到float可能会有损失

		console(c);
		console(d);

		console("==============================");
		double cc = 100d;
		double dd = 36.5d;//默认省去尾巴d或者D
		double f = 36.589d;
		double g = 236.589D;
		double h = d;

		console(cc);
		console(dd);
		console(f);
		console(g);
		console(h);


	}

	//打印方法
	public static void console(Object message){
		System.out.println("打印的结果是："+message);
	}
}
