package class_32_chario.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo {
	public static void main(String[] args) {
		String content = "������ɽ��"
				+"�ƺ��뺣��"
				+ "����ǧ��Ŀ"
				+ "����һ��¥";
		
		try (
				
				StringReader reader = new StringReader(content);
				//StringWriter writer = new StringWriter();
				FileWriter writer = new FileWriter("F:/1.txt");//����ƶ����ļ����� ���������� �������������

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
