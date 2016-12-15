package class_32_chario.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	// �ַ���(������)
	/*
	 * Reader:--
	 * 
	 * @see FileReader  ��InputStreamReader������ 
	 * 
	 * @see InputStreamReader ����ָ������
	 * 
	 * @see StringReader �����ַ��� ���Խ��ַ���д���ļ�����
	 * 
	 * 
	 * @see BufferedReader--���Ƕ��ַ�����һ������
	 * 
	 * @see LineNumberReader
	 * 
	 * @see CharArrayReader
	 * 
	 * @see FilterReader
	 * 
	 * @see PushbackReader
	 * 
	 * @see PipedReader
	 * 
	 * �ֽ��� int read() int read(byte[] b) int read(byte[] b,int off,int len) �ַ���
	 * int read() int read(char[] b) int read(char[] b,int off,int len)
	 */
	public static void main(String[] args) {

		// File file = new File("F:/1.txt");
		// if (file.exists()) {
		// FileInputStream in = null;
		// InputStreamReader isr = null;
		//
		//
		// try {
		// //�ֽ���ת---2byte--�����ַ���
		// in = new FileInputStream(file);
		// isr = new InputStreamReader(in,"gbk");
		// char[] c = new char[128];
		// int len = 0;
		// while ((len = isr.read(c)) != -1) {
		// System.out.println(new String(c, 0, len));
		// }
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		
		//��jdk1.7�Ժ� ���Ĺرտ���ʹ�����·�ʽ:

		File file = new File("d://luoo2.html");
		if (!file.exists()) {
			System.out.println("�ļ�������...");
			return;
		}

		try (
		// �ֽ���--�ı��ļ�
		FileInputStream in = new FileInputStream(file);
		// ����������--ת���� -�ֽ���---ת����--�ַ���
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");) {
			char[] c = new char[128];
			int len = 0;
			while ((len = isr.read(c)) != -1) {
				System.out.println(new String(c, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		
//		try (
//				FileInputStream in = new FileInputStream(file);
//				// ����������--ת���� ---�ֽ���---ת����--�ַ���
//				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
//				
//				){
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
