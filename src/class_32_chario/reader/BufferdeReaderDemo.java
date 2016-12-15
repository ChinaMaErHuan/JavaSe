package class_32_chario.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferdeReaderDemo {
	public static void main(String[] args) {
		// ��io����д�ļ��Ĺ����ж��᲻�ɱ��������һ������ �����ڲ���Ҫ���е�ʱ�� �ỻ�� ����ʱ������ǵ������ǲ�����
		// ��ʱ���Ǿ��õ���BufferedReader ������
		File file = new File("F:/luoo2.html");
		if (file.exists()) {
			try (
					// ����������
					FileInputStream in = new FileInputStream(file);
					// ����ת��--ת��Ϊ�ַ���
					InputStreamReader isr = new InputStreamReader(in, "utf-8");
					// ������--�������ݻ�������ã���Ч����--����һ�ж�ȡ
					BufferedReader bReader = new BufferedReader(isr);
					
				) {
				String line = null;
				while ((line = bReader.readLine()) != null) {//����ļ���ȡ����Ժ�ͷ���null,���ػ�����û�ж�ȡ���
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
