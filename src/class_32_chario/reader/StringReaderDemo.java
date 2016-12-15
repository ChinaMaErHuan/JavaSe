package class_32_chario.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo {
	public static void main(String[] args) {
		String content = "白日依山尽"
				+"黄河入海流"
				+ "欲穷千里目"
				+ "更上一层楼";
		
		try (
				
				StringReader reader = new StringReader(content);
				//StringWriter writer = new StringWriter();
				FileWriter writer = new FileWriter("F:/1.txt");//如果制定的文件存在 将发生覆盖 覆盖里面的内容

		) {
			char[] c = new char[128];
			int len = 0;
			while ((len = reader.read(c)) != -1) {
				writer.write(c, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
