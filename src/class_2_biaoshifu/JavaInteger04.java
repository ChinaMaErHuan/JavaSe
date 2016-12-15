package class_2_biaoshifu;

public class JavaInteger04{


	public static void main(String[] args){
		/*
		
			float(4) 和long(8)的关系
			long定义一定结尾一定要加L或者l
		*/

		long c = 3546465464l;
		float f = c;
		console(f);


	}

	//打印方法
	public static void console(Object message){
		System.out.println("打印的结果是："+message);
	}
}
