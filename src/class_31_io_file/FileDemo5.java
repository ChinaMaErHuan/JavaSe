package class_31_io_file;

import java.io.File;
import java.util.List;

public class FileDemo5 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		//System.out.println(path);
		List<File> list = MehFileUtil.listFiles(new File(path),"src,","java");
		for (File file : list) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
