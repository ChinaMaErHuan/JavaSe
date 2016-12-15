package class_33_io_toolutils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderFileUtil {
	/**
	 * 
	 * ���ֽڶ�ȡ</br> class_33_iotoolutils </br> ��������ReaderFileBytes
	 * </br> �����ˣ�maerhuan </br> ʱ�䣺2016��5��30��-����11:24:44 </br>
	 * 
	 * @param fileName
	 * @return String </br> 
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static String ReaderFileBytes(String fileName) {
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (FileInputStream in = new FileInputStream(fileName);

		) {

			byte[] b = new byte[1024];
			int len = 0;
			StringBuilder builder = new StringBuilder();
			while ((len = in.read(b)) != -1) {
				builder.append(new String(b, 0, len));
			}
			return builder.toString();

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 
	 * ���ַ���ȡ</br> class_33_iotoolutils </br> ��������ReaderFileChars </br>
	 * �����ˣ�maerhuan </br> ʱ�䣺2016��5��30��-����11:24:49 </br>
	 * 
	 * @param fileName
	 * @return String </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static String ReaderFileChars(String fileName) {
		// ��ȡ��ǰ���ļ�
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (
		// FileReader reader = new FileReader(fileName);
		FileInputStream in = new FileInputStream(fileName);
				InputStreamReader isReader = new InputStreamReader(in);) {
			char[] b = new char[64];
			int len = 0;
			StringBuilder builder = new StringBuilder();
			while ((len = isReader.read(b)) != -1) {
				builder.append(new String(b, 0, len));
			}
			return builder.toString();

		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 
	 * ���ж�ȡ</br> class_33_iotoolutils </br> ��������ReaderLine </br> �����ˣ�maerhuan
	 * </br> ʱ�䣺2016��5��30��-����11:24:54 </br>
	 * 
	 * @param fileName
	 * @return String </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static String ReaderLine(String fileName) {
		// ��ȡ��ǰ���ļ�
		File file = new File(fileName);
		// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();

		try (
		// ���������
		FileReader fileReader = new FileReader(fileName);
				BufferedReader reader = new BufferedReader(fileReader);) {

			String line = null;
			StringBuilder builder = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				if (!line.trim().equals("")) {
					builder.append(line + "\r\n");
				}
			}
			return builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	 public static void main(String[] args) {
	 String file = "F:/text/1.txt";
	 String result1 = ReaderFileBytes(file);
	 System.out.println(result1);
	 String result2 = ReaderFileChars(file);
	 System.out.println(result2);
	 String result3 = ReaderLine(file);
	 System.out.println(result3);
	 }

}
