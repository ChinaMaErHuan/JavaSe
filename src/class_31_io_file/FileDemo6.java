package class_31_io_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo6 {
	/**
	 * 
	 * ��ͬ���ַ���ռ���ֽ��ǲ�ͬ�ġ� ����ASCII�룺
	 *����һ��Ӣ����ĸ�����ִ�Сд��ռһ���ֽڵĿռ䣬һ�����ĺ���ռ�����ֽڵĿռ䡣һ����������������
	 * ���ڼ��������Ϊһ�����ֵ�Ԫ��һ��Ϊ8λ��������������Ϊʮ���ơ���Сֵ0�����ֵ255����һ��ASCII�����һ���ֽڡ� ����UTF-8���룺
	����һ��Ӣ���ַ�����һ���ֽڣ�һ�����ģ������壩���������ֽڡ� ����Unicode���룺
	 *����һ��Ӣ�ĵ��������ֽڣ�һ�����ģ������壩���������ֽڡ� �������ţ�
	 *����Ӣ�ı��ռһ���ֽڣ����ı��ռ�����ֽڡ�������Ӣ�ľ�š�.��ռ1���ֽڵĴ�С�����ľ�š�����ռ2���ֽڵĴ�С��
	 * 
	 * IO:������(InputStream)�������(OutStream)---����File����Ĺ���
	 * 
	 * IO:
	 * 
	 * �ֽ��� : ����(����)��InputStream ----��Χ���ļ����������ƣ�ճ���������ļ�
	 * ----Ӧ���ڣ��������ļ��Ĵ���(ͼƬ����Ƶ����Ƶ��) ---���͵����ࣺFileInputStream ---������ ---int
	 * read()===������������ȡ�����ֽڣ���������ȡ�����ݡ� ---int read(byte[] b)===
	 * ��������������ȡb.length���ֽ����ݣ�������洢���ֽ�������b�У������ֽ��� ---int read(byte[] b,int
	 * off,int len)===��������������ȡlen���ֽڵ�����, - --available()����ʣ�¶���û�ж�ȡ��ϡ���ȡ��Ϸ���0
	 * �ַ���:���������ļ����ݵ�,---�ı��ļ� һ���Ƕ�Ӧ�ı��ļ����ݵ���ӣ��޸ģ�׷�ӣ���ɾ����
	 * 
	 * �ֽ��� �� �ַ���һ����û�����һ��һ���ģ����������ֽ������ַ��������ĵ�Ԫ��ͬ--�ֽ����������ݵ�Ԫ8λ�� ���ַ������Բ���16λ��
	 * 
	 * 1byte = 8 bit �� 2byte = 16bit;
	 * 
	 * char[]--�ַ��� byte[]---�ֽ���
	 * 
	 * ������:���Ƕ��ֽ������ַ������Ի�������
	 * 
	 * 
	 * �������ļ�:ͼƬ����Ƶ����Ƶ�� �ı��ļ�:html,java,txt,
	 * 
	 * office�ļ�:.doc,docx,pdf,--io��ȡ---poi/jxlȥ��ȡ--io
	 * */

	public static void main(String[] args) {
		//�ֽ���:
		//InputStream:ֱ����֪����
		/*
		 * AudioInputStream, ByteArrayInputStream, FileInputStream,
		 * FilterInputStream, InputStream, ObjectInputStream, PipedInputStream,
		 * SequenceInputStream, StringBufferInputStream
		 */
		
		// OutputStream:ֱ����֪����:
		/*
		 * ByteArrayOutputStream, FileOutputStream, FilterOutputStream,
		 * ObjectOutputStream, OutputStream, PipedOutputStream
		 */
		File aFile = new File("F:/luoo2.html");//�����ļ�
		if (aFile.exists()) {
			FileInputStream in = null;
			try {
				//��ȡ��
				in = new FileInputStream(aFile);
				int count = 0;
				//byte[] b = new byte[1024];
				
				//�����ֽڶ�ȡ:˵���˾���һ����ĸһ����ĸ�Ķ�ȡ
				/*int len = 0;
				while ((len = in.read()) != -1) {
					System.out.println((char) len);
					count++;
				}

				System.out.println("============>" + count);*/
				 
				
				//���ֽڶ�ȡ
//				byte[] b = new byte[1024];
//				int len2 = 0;
//				while((	len2 = in.read(b))!=-1){
//					System.out.println(new String(b));
//					count++;
//				}
//				System.out.println("============>"+count);
				
				long total = aFile.length();
				byte[] bb = new byte[1024];
				int len = 0;
				while((	len = in.read(bb))!=-1){
					System.out.println(new String(bb,0,len,"UTF-8"));//������Ķ���λ��ʼ������λ��������ַ��� �ƶ��ַ���
					System.out.println("��ʣ�£�"+in.available()+"byte");
					System.out.println("====��ȡ����====="+(1-(in.available() / (float)total))*100);
					count++;
				}
				System.out.println("һ����ȡ��============>"+count);
				 
				 
			} catch (IOException e) {
					e.printStackTrace();
			} finally {
				try {
					if (in != null)
						in.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
