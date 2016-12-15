package class_32_chario.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferdeReaderDemo {
	public static void main(String[] args) {
		// 在io流读写文件的过程中都会不可避免的遇到一个问题 就是在不需要换行的时候 会换行 这有时候和我们的需求是不符的
		// 这时我们就用到了BufferedReader 缓冲流
		File file = new File("F:/luoo2.html");
		if (file.exists()) {
			try (
					// 建立输入流
					FileInputStream in = new FileInputStream(file);
					// 流的转换--转换为字符流
					InputStreamReader isr = new InputStreamReader(in, "utf-8");
					// 缓冲流--数据数据缓冲的作用，高效运行--可以一行读取
					BufferedReader bReader = new BufferedReader(isr);
					
				) {
				String line = null;
				while ((line = bReader.readLine()) != null) {//如果文件读取完毕以后就返回null,返回还内容没有读取完毕
					if (!line.trim().equals("")) {

						System.out.println(line);
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
