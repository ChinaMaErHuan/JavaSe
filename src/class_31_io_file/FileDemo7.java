package class_31_io_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * �ļ��Ŀ��� FileDemo7</br> ������:maerhuan </br> ʱ�䣺2016��5��28��-����6:50:11 </br>
 * 
 * @version 1.0.0
 * 
 */
public class FileDemo7 {
	public static void main(String[] args) {
		// �ļ��ĸ���
		File file = new File("G://luoo.html");
		File file2 = new File("F:/luoo2.html");
		if (file2.exists()) {
			// �ֽ���
			// ������
			FileInputStream inputStream = null;
			// �����
			FileOutputStream outputStream = null;

			try {
				inputStream = new FileInputStream(file2);
				outputStream = new FileOutputStream(file);
				// ���FileOutputStream(file,true)�Ļ� ����׷�� ���ϵ�׷�� ������еĻ� ��ʵ�����ļ��Ķ�θ���
				// ���ϵ�׷�ӵ��ƶ��ļ���
				// ��ȡ��(����)
				int len = 0;
				byte[] bs = new byte[1024];
				while ((len = inputStream.read(bs)) != -1) {
					outputStream.write(bs, 0, len);
				}
				 outputStream.flush();
				/*
				 * flush() ����գ�������ˢ�°���
				 * һ����Ҫ����IO�У�����ջ��������ݣ�����˵���ö�д����ʱ����ʵ�������ȱ��������ڴ��У�
				 * Ȼ��������д���ļ��У��������ݶ����ʱ�򲻴�����������Ѿ�д���ˣ� ��Ϊ����һ�����п��ܻ������ڴ�����������С�
				 * ��ʱ������������ close()�����ر��˶�д������ô�ⲿ�����ݾͻᶪʧ��
				 * ����Ӧ���ڹرն�д��֮ǰ��flush()����������ݡ�
				 */
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					// �ر���Ҫ�Գƹر�
					if (outputStream != null)
						outputStream.close();
					if (inputStream != null)
						inputStream.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		}

	}
}
