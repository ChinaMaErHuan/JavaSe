package class_32_chario.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	// FileReader�ڶ�ȡ��ʱ����û�����ƶ�����Ĺ��캯���� ����Ҫʵ�ֵĻ� �����Լ��ع�
	public static void main(String[] args) {
		File file = new File("f:/luoo2.html");
		if (file.exists()) {

			try (
			 FileInputStream in = new FileInputStream(file);
			// ���õĹ��캯������InputStreamReader
			//MEHFileReader isr = new MEHFileReader(file,"utf-8");
			FileReader isr = new FileReader(file);

			) {
				char[] c = new char[128];
				int len = 0;
				while ((len = isr.read(c)) != -1) {
					System.out.println(new String(c, 0, len));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
