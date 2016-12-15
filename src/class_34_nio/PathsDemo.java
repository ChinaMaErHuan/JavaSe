package class_34_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * PathsDemo</br>
 * ������:maerhuan </br>
 * ʱ�䣺2016��6��1��-����2:59:30 </br>
 * @version 1.0.0
 *
 */
public class PathsDemo {
	public static void main(String[] args) {
		Path path = Paths.get("F:/luoo2.html");
		Path path2 = Paths.get("F:", "text","a","a.txt");
		System.out.println(path+"===="+path2);
		System.out.println(path2.getNameCount());
		System.out.println("��Ŀ¼��"+path2.getRoot());
		System.out.println("��Ŀ¼��"+path2.getParent());
		System.out.println(path2.getFileSystem());
		System.out.println("�ļ�����"+path2.getFileName());
		System.out.println("��ȡ����·��"+path2.toAbsolutePath());
	}
}
