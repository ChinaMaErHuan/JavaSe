package class_31_io_file;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDemo4 {
	
	public static void main(String[] args) throws IOException {
		File directory = new File("F:/Program Files");// 255级
		//返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
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

		System.out.println("拿到文件列表的个数:" + files.length);

	}

	private static List<File> files = new ArrayList<>();

	public static List<File> listFiles(File directory) {
		File[] files2 = directory.listFiles();// 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
		for (File file : files2) {
			if (file.isFile()) {
				files.add(file);
			}
			if (file.isDirectory()) {// 如果是目录，继续调用自己
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
			if (file.isDirectory()) {// 如果是目录，
				 //files.add(file);
				listFiles(files, file);
			}
		}

		return files;
	}

	
}
