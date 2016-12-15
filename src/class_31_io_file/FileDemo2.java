package class_31_io_file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/luoo2.html");
		// 文件创建
		if (!file.exists()) {
			file.createNewFile();// 当File对象对应的文件不存在时，该方法就会创建一个文件，否则返回false,不创建
			System.out.println("创建成功...");
		} else {
			System.out.println("文件已经存在...");
		}

		// //删除
		if (file.exists()) {
			file.delete();// 文件在打开状态或者使用的时候不会删除
			file.deleteOnExit();// 注册一个删除钩子，只有当java虚拟机退出的时候，才会删除
		}
	}
}
