package class_34_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * PathsDemo</br>
 * 创建人:maerhuan </br>
 * 时间：2016年6月1日-下午2:59:30 </br>
 * @version 1.0.0
 *
 */
public class PathsDemo {
	public static void main(String[] args) {
		Path path = Paths.get("F:/luoo2.html");
		Path path2 = Paths.get("F:", "text","a","a.txt");
		System.out.println(path+"===="+path2);
		System.out.println(path2.getNameCount());
		System.out.println("根目录："+path2.getRoot());
		System.out.println("父目录："+path2.getParent());
		System.out.println(path2.getFileSystem());
		System.out.println("文件名字"+path2.getFileName());
		System.out.println("获取绝对路径"+path2.toAbsolutePath());
	}
}
