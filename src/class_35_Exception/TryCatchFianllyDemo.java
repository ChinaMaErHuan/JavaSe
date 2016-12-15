package class_35_Exception;

import java.io.PrintStream;


public class TryCatchFianllyDemo {
	
		
	public static void main(String[] args) {
		PrintStream writer = null;
		try {
			writer = new PrintStream("F://luoo2.html");
			int a = 0;
			int b = 1/0;
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();//jvm抛给程序的错误信息
			e.printStackTrace(writer);//将异常输出到文件里面
		}
		
		//throw throws 自定异常 和网络编程
	}
}
