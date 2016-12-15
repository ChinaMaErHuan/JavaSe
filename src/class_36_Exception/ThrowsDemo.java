package class_36_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
	public static void main(String[] args) {
		/**
		 * �쳣�Ĳ���ͨ����try/catch���в���,
		 * һ��:throws/throw
		 * throws:�����ڷ����ṹ���쳣�׳��������߲�Ҫ�����쳣�Ĵ������������ǵ�����ȥ���в���
		 * 1��һ��Ӧ�ýӿڵ��ú��Զ����쳣�С�
		 * 2�����Դ�����
		 * 
		 * �������η�  ����ֵ  ������ throws e1,e2,e3....{
		 *	  //������
		 * }
		 * 
		 * throw������쳣����ģ��Ƕ����ڷ������ص��쳣�׳����������throw�׳��Ļ���һ��Ҫ��throws�����׳�.
		 * 1��һ���������Ҫthrows�׳�����ô���׳����쳣��RuntimeException�Ͳ���Ҫ.�����
		 * 2��Checked exception��ô�ñ���һ��Ҫ��throws���м����׳��������ǵ����߽��д���.
		 * 
		 * �ܽ᣺ 
		 */
		//readFile();
		
//		try {
//			readFile2();
//			System.out.println("success");
//		} catch (IOException e) {
//			System.out.println("fail");
//			e.printStackTrace();
//		}
		
		//saveStudent();
		
//		try {
//			writerFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
	public static int readFile(){
		FileInputStream inputStream = null;;
		try {
			inputStream = new FileInputStream("");
			inputStream.read(null);
			return 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}finally{
			try {
				if(inputStream!=null) inputStream.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	}
	
	public static void writerFile() throws IOException{
			//д���߼�
		String reesult = readFile2();
	}
	
	public static String readFile2() throws IOException{
		FileInputStream inputStream = new FileInputStream("");
		inputStream.read(null);
		return "keke";
	}
	
	public static void saveStudent(){
		User user = new User();
		System.out.println(user.getUsername());
	}
}
