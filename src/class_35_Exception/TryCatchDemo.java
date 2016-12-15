
package class_35_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * TryCatchDemo</br>
 * 创建人:maerhuan </br>
 * 时间：2016年6月2日-下午2:07:08 </br>
 * @version 1.0.0
 *
 */
public class TryCatchDemo {
	/**
	 * Exception ---是用try/catch进行提示错误，在未来的程序开发中，除了checkedException需要强制进行捕获，其他的 
	 * 可以不用进行捕获，但是如果你的代码执行的结果不是你想要的话，又没有报错的情况下，
	 * 记住要try/catch包裹起来 看看你有没有错误
	 * 
	 * 异常定义的方式:
	 * 1.tc
	 * 2.tc...
	 * 3.tc...f
	 * 4.tf
	 * 
	 * 1.如果在程序代码，如果遇到异常信息以后，jvm直接退出，后面的代码直接忽略，方法执行终止，也不会return
	 * 2.2:异常规则：先小异常，后大异常  (平级异常顺序无关)
	 */
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = a/5;
			String[] names = {"keke","xiaozhang"};
			names[2]="xiaoke";
			System.out.println("这里会执行吗？");
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException 数组越界了....");
		}
		
		catch(ArithmeticException e){
			System.out.println("ArithmeticException 你程序代码中，0不能被整除!!");
		}
		
		catch (RuntimeException e) {
			System.out.println("RuntimeException 出错了...");
		}
		catch (Exception e) {
			System.out.println("Exception 出错了...");
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
