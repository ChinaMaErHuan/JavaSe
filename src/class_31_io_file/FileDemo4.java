package class_31_io_file;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDemo4 {
	
	public static void main(String[] args) throws IOException {
		File directory = new File("F:/Program Files");// 255��
		//����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
		// String[] files = directory.list();

		// List<File> list = listFiles(directory);
		List<File> lFiles = new ArrayList<>();
		List<File> list = listFiles(lFiles, directory);
		for (File file : list) {
			System.out.println(file.getAbsolutePath());
		}

		String[] files = directory.list();
//		 for (String string : files) {
//		 System.out.println(string);
//		 }

		System.out.println("�õ��ļ��б�ĸ���:" + files.length);

	}

	private static List<File> files = new ArrayList<>();

	public static List<File> listFiles(File directory) {
		File[] files2 = directory.listFiles();// ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���
		for (File file : files2) {
			if (file.isFile()) {
				files.add(file);
			}
			if (file.isDirectory()) {// �����Ŀ¼�����������Լ�
			 //files.add(file);
				listFiles(file);
			}
		}

		return files;
	}

	public static List<File> listFiles(List<File> files, File directory) {
		File[] files2 = directory.listFiles();
		for (File file : files2) {
			if (file.isFile()) {
				files.add(file);
			}
			if (file.isDirectory()) {// �����Ŀ¼��
				 //files.add(file);
				listFiles(files, file);
			}
		}

		return files;
	}

	
}
