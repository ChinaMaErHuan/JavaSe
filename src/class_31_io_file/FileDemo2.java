package class_31_io_file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/luoo2.html");
		// �ļ�����
		if (!file.exists()) {
			file.createNewFile();// ��File�����Ӧ���ļ�������ʱ���÷����ͻᴴ��һ���ļ������򷵻�false,������
			System.out.println("�����ɹ�...");
		} else {
			System.out.println("�ļ��Ѿ�����...");
		}

		// //ɾ��
		if (file.exists()) {
			file.delete();// �ļ��ڴ�״̬����ʹ�õ�ʱ�򲻻�ɾ��
			file.deleteOnExit();// ע��һ��ɾ�����ӣ�ֻ�е�java������˳���ʱ�򣬲Ż�ɾ��
		}
	}
}
