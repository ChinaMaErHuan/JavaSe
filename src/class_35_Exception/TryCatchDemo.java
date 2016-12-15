
package class_35_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * TryCatchDemo</br>
 * ������:maerhuan </br>
 * ʱ�䣺2016��6��2��-����2:07:08 </br>
 * @version 1.0.0
 *
 */
public class TryCatchDemo {
	/**
	 * Exception ---����try/catch������ʾ������δ���ĳ��򿪷��У�����checkedException��Ҫǿ�ƽ��в��������� 
	 * ���Բ��ý��в��񣬵��������Ĵ���ִ�еĽ����������Ҫ�Ļ�����û�б��������£�
	 * ��סҪtry/catch�������� ��������û�д���
	 * 
	 * �쳣����ķ�ʽ:
	 * 1.tc
	 * 2.tc...
	 * 3.tc...f
	 * 4.tf
	 * 
	 * 1.����ڳ�����룬��������쳣��Ϣ�Ժ�jvmֱ���˳�������Ĵ���ֱ�Ӻ��ԣ�����ִ����ֹ��Ҳ����return
	 * 2.2:�쳣������С�쳣������쳣  (ƽ���쳣˳���޹�)
	 */
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = a/5;
			String[] names = {"keke","xiaozhang"};
			names[2]="xiaoke";
			System.out.println("�����ִ����");
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException ����Խ����....");
		}
		
		catch(ArithmeticException e){
			System.out.println("ArithmeticException ���������У�0���ܱ�����!!");
		}
		
		catch (RuntimeException e) {
			System.out.println("RuntimeException ������...");
		}
		catch (Exception e) {
			System.out.println("Exception ������...");
		}
		
		
		FileInputStream fStream = null;
		try {
			 fStream = new FileInputStream("F:/1.txt");
			fStream.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}
