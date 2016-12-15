package class_32_chario.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	// 字符流(输入流)
	/*
	 * Reader:--
	 * 
	 * @see FileReader  是InputStreamReader的子类 
	 * 
	 * @see InputStreamReader 可以指定编码
	 * 
	 * @see StringReader 操作字符串 可以将字符串写到文件里面
	 * 
	 * 
	 * @see BufferedReader--都是对字符流的一个缓冲
	 * 
	 * @see LineNumberReader
	 * 
	 * @see CharArrayReader
	 * 
	 * @see FilterReader
	 * 
	 * @see PushbackReader
	 * 
	 * @see PipedReader
	 * 
	 * 字节流 int read() int read(byte[] b) int read(byte[] b,int off,int len) 字符流
	 * int read() int read(char[] b) int read(char[] b,int off,int len)
	 */
	public static void main(String[] args) {

		// File file = new File("F:/1.txt");
		// if (file.exists()) {
		// FileInputStream in = null;
		// InputStreamReader isr = null;
		//
		//
		// try {
		// //字节流转---2byte--换成字符流
		// in = new FileInputStream(file);
		// isr = new InputStreamReader(in,"gbk");
		// char[] c = new char[128];
		// int len = 0;
		// while ((len = isr.read(c)) != -1) {
		// System.out.println(new String(c, 0, len));
		// }
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		
		//在jdk1.7以后 流的关闭可以使用如下方式:

		File file = new File("d://luoo2.html");
		if (!file.exists()) {
			System.out.println("文件不存在...");
			return;
		}

		try (
		// 字节流--文本文件
		FileInputStream in = new FileInputStream(file);
		// 建立输入流--转换流 -字节流---转换成--字符流
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");) {
			char[] c = new char[128];
			int len = 0;
			while ((len = isr.read(c)) != -1) {
				System.out.println(new String(c, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		
//		try (
//				FileInputStream in = new FileInputStream(file);
//				// 建立输入流--转换流 ---字节流---转换成--字符流
//				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
//				
//				){
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
