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
			e.printStackTrace();//jvm�׸�����Ĵ�����Ϣ
			e.printStackTrace(writer);//���쳣������ļ�����
		}
		
		//throw throws �Զ��쳣 ��������
	}
}
