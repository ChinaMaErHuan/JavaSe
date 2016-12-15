package class_33_io_toolutils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * ������ WriterFileUtil</br> ������:maerhuan </br> ʱ�䣺2016��5��30��-����7:51:52 </br>
 * 
 * @version 1.0.0
 * 
 */
public class WriterFileUtil {
	/**
	 * 
	 * ���ֽڵķ�ʽд�ļ�</br> class_33_iotoolutils </br> ��������wirterFileChars </br>
	 * �����ˣ�maerhuan </br> ʱ�䣺2016��5��30��-����11:23:07 </br>
	 * 
	 * @param content
	 * @param fileName
	 * @param append
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void wirterFileBytes(String content, String fileName,
			boolean append) {
		// ��ȡ��ǰ���ļ�
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (FileOutputStream out = new FileOutputStream(fileName, append);

		) {

			byte[] b = content.getBytes();
			out.write(b);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * ���ַ��ķ�ʽд��</br> class_33_iotoolutils </br> ��������wirterFileChars </br>
	 * �����ˣ�maerhuan </br> ʱ�䣺2016��5��30��-����11:23:33 </br>
	 * 
	 * @param content
	 * @param fileName
	 * @param append
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void wirterFileChars(String content, String fileName,
			boolean append) {
		// ��ȡ��ǰ���ļ�
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (
		// ���������
		FileOutputStream out = new FileOutputStream(fileName, append);
				// InputStreamReader()��OutputStreamWrriter����ָ������
				OutputStreamWriter writer = new OutputStreamWriter(out);
		// FileWriter writer = new FileWriter(fileName,append);
		) {
			writer.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * ����ָ������</br>
	 * class_33_io_toolutils </br>
	 * ��������wirterFileCharsCharSet </br>
	 * �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��5��31��-����12:33:23 </br>
	 * @param content
	 * @param fileName
	 * @param append
	 * @param charset void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void wirterFileCharsCharSet(String content, String fileName,
			boolean append,String charset) {
		// ��ȡ��ǰ���ļ�
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (
		// ���������
		FileOutputStream out = new FileOutputStream(fileName, append);
				// InputStreamReader()��OutputStreamWrriter����ָ������
				OutputStreamWriter writer = new OutputStreamWriter(out,charset);
		// FileWriter writer = new FileWriter(fileName,append);
		) {
			writer.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * ����д�� </br> class_33_iotoolutils </br> ��������wirterFileLine </br>
	 * �����ˣ�maerhuan </br> ʱ�䣺2016��5��30��-����11:23:50 </br>
	 * 
	 * @param content
	 * @param fileName
	 * @param append
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void wirterFileLine(String content, String fileName,
			boolean append) {
		// ��ȡ��ǰ���ļ�
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (
		// ���������
		FileOutputStream out = new FileOutputStream(fileName, append);
				OutputStreamWriter outwriter = new OutputStreamWriter(out);
				BufferedWriter writer = new BufferedWriter(outwriter);) {

			writer.write(content);
			writer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * ����д�� ָ������</br>
	 * class_33_io_toolutils </br>
	 * ��������wirterFileLineCharSet </br>
	 * �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��5��31��-����12:35:12 </br>
	 * @param content
	 * @param fileName
	 * @param append
	 * @param charset void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void wirterFileLineCharSet(String content, String fileName,
			boolean append,String charset) {
		// ��ȡ��ǰ���ļ�
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (
		// ���������
		FileOutputStream out = new FileOutputStream(fileName, append);
				OutputStreamWriter outwriter = new OutputStreamWriter(out,charset);
				BufferedWriter writer = new BufferedWriter(outwriter);) {

			writer.write(content);
			writer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * ����д��ĵڶ��ַ�ʽ</br> class_33_iotoolutils </br> ��������wirterFileLines </br>
	 * �����ˣ�maerhuan </br> ʱ�䣺2016��5��30��-����11:24:06 </br>
	 * 
	 * @param content
	 * @param fileName
	 * @param append
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void wirterFileLines(String content, String fileName,
			boolean append) {
		// ��ȡ��ǰ���ļ�
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (
		// ���������
		PrintWriter writer = new PrintWriter(new FileOutputStream(file,append));

		) {
			writer.println(content);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String file = "F:/text/1.txt";
		WriterFileUtil.wirterFileBytes("�Ұ���", file, true);
		WriterFileUtil.wirterFileChars("�����ŷ���ʿ��򿴼���˿�����ǿյĻظ�", file, true);
		WriterFileUtil.wirterFileLine("��˵�ͼһ�����", file, true);
		WriterFileUtil.wirterFileLines("�������������", file, true);
		wirterFileLines("������ɽ����\r\n�ƺ��뺣����\r\n����ǧ��Ŀ��\r\n����һ��¥��", file, false);
	}

}
