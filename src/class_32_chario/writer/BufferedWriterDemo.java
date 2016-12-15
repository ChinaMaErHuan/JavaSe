package class_32_chario.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
/**
 * 
 * 
 * BufferedWriterDemo</br>
 * 创建人:maerhuan </br>
 * 时间：2016年5月29日-下午6:49:45 </br>
 * @version 1.0.0
 *
 */

public class BufferedWriterDemo {
	// 字符流(输入流)
	/**
	 * Writer:--
	 * 
	 * @see BufferedWriter
	 * 
	 * @see OutputStreamWriter
	 * 
	 * @see FileWriter
	 * 
	 * @see StringWriter
	 * 
	 * @see PrintWriter--jsp浏览器输出流 reponse.getWriter()
	 * 
	 * @see CharArrayWriter
	 * 
	 * @see FilterWriter
	 * 
	 * @see PipedWriter
	 * 
	 * 字节流 int read() int read(byte[] b) int read(byte[] b,int off,int len) 字符流
	 * int read() int read(char[] b) int read(char[] b,int off,int len)
	 */
	
	public static void main(String[] args) {
		File file = new File("F:/luoo2.html");
		File file2 = new File("F:/index.html");
		if (file.exists()) {
			try (
			// 建立字节流
			FileInputStream inputStream = new FileInputStream(file);
					// 字节流转换
					InputStreamReader isr = new InputStreamReader(inputStream,
							"UTF-8");
					// 上面的两行可以换做下面的:
					// FileReader isr = new FileReader(file);只不过是不能指定写的编码
					// 或者
					// MEHFileReader isr = new MEHFileReader(file, "UTF-8");
					// 缓冲流
					BufferedReader bReader = new BufferedReader(isr);
					//输出流：
					FileOutputStream outputStream = new FileOutputStream(file2,
							true);
					OutputStreamWriter osr = new OutputStreamWriter(
							outputStream, "UTF-8");
					// 上面的两行可以换做下面的:
					// FileWriter osr = new FileWriter(file2);只不过是不能制定写的编码和是否追加
					// 或者
					// MEHFileWriter osr = new MEHFileWriter(file2, "UTF-8",
					// true);

					BufferedWriter bWriter = new BufferedWriter(osr);
					 //PrintWriter bWriter = new PrintWriter(file2);
			) {
				String line = null;
				while ((line = bReader.readLine()) != null) {// 如果文件读取完毕以后就返回null,返回还内容没有读取完毕
					if (!line.trim().equals("")) {
						bWriter.write(line + "\n");
						//或者:
						// bWriter.write(line, 0, line.length());
						// bWriter.newLine();
					}
				}
				bWriter.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
