package class_36_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
	public static void main(String[] args) {
		/**
		 * 异常的捕获通常是try/catch进行捕获,
		 * 一种:throws/throw
		 * throws:定义在方法结构上异常抛出，定义者不要进行异常的处理，而是让我们调用者去进行捕获。
		 * 1：一般应用接口调用和自定义异常中。
		 * 2：测试代码中
		 * 
		 * 访问修饰符  返回值  方法名 throws e1,e2,e3....{
		 *	  //方法体
		 * }
		 * 
		 * throw它针对异常对象的，是定义在方法体重的异常抛出，如果用了throw抛出的话，一定要用throws往上抛出.
		 * 1：一种情况不需要throws抛出，那么你抛出的异常是RuntimeException就不需要.如果是
		 * 2：Checked exception那么久必须一定要用throws进行继续抛出，让我们调用者进行处理.
		 * 
		 * 总结： 
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
			//写入逻辑
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
