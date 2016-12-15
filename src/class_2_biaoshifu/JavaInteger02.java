package class_2_biaoshifu;

public class JavaInteger02{
	private static int age = 30 ;

	public static void main(String[] args){
		byte a = 100;
		int b = a ;
		b = 200;
		int c = b;
		float e = c;
		e = 110; 
		double f = a;
			
		console(a);//100
		console(b);//200
		console(c);//200
		console(e);//110.0
		console(f);//100.0
		

	}


	public static void console(Object message){
		System.out.println("打印的结果是："+message);
	}
}
