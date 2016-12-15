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
 * ������:maerhuan </br>
 * ʱ�䣺2016��5��29��-����6:49:45 </br>
 * @version 1.0.0
 *
 */

public class BufferedWriterDemo {
	// �ַ���(������)
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
	 * @see PrintWriter--jsp���������� reponse.getWriter()
	 * 
	 * @see CharArrayWriter
	 * 
	 * @see FilterWriter
	 * 
	 * @see PipedWriter
	 * 
	 * �ֽ��� int read() int read(byte[] b) int read(byte[] b,int off,int len) �ַ���
	 * int read() int read(char[] b) int read(char[] b,int off,int len)
	 */
	
	public static void main(String[] args) {
		File file = new File("F:/luoo2.html");
		File file2 = new File("F:/index.html");
		if (file.exists()) {
			try (
			// �����ֽ���
			FileInputStream inputStream = new FileInputStream(file);
					// �ֽ���ת��
					InputStreamReader isr = new InputStreamReader(inputStream,
							"UTF-8");
					// ��������п��Ի��������:
					// FileReader isr = new FileReader(file);ֻ�����ǲ���ָ��д�ı���
					// ����
					// MEHFileReader isr = new MEHFileReader(file, "UTF-8");
					// ������
					BufferedReader bReader = new BufferedReader(isr);
					//�������
					FileOutputStream outputStream = new FileOutputStream(file2,
							true);
					OutputStreamWriter osr = new OutputStreamWriter(
							outputStream, "UTF-8");
					// ��������п��Ի��������:
					// FileWriter osr = new FileWriter(file2);ֻ�����ǲ����ƶ�д�ı�����Ƿ�׷��
					// ����
					// MEHFileWriter osr = new MEHFileWriter(file2, "UTF-8",
					// true);

					BufferedWriter bWriter = new BufferedWriter(osr);
					 //PrintWriter bWriter = new PrintWriter(file2);
			) {
				String line = null;
				while ((line = bReader.readLine()) != null) {// ����ļ���ȡ����Ժ�ͷ���null,���ػ�����û�ж�ȡ���
					if (!line.trim().equals("")) {
						bWriter.write(line + "\n");
						//����:
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
