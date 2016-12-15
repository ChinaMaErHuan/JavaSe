package class_34_nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class FilesDemo {
	public static void main(String[] args) {
		/**
		 * Files
		 */
		//读取
		try {
			List<String> lineStrings = Files.readAllLines(Paths.get("F:/luoo2.html"));
			for (String string : lineStrings) {
				System.out.println(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//写入
		List<String> strings =  new ArrayList<>();
		//写进去以后是一行一行的
		strings.add("马欢");
		strings.add("发生");
		strings.add("婚纱");
		try {
			Files.write(Paths.get("F:/meh.txt"), strings, Charset.forName("utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String content = "我爱你";
		try {
			Files.write(Paths.get("F://aaa.txt"),content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//其他拷贝
		try {
			Files.copy(Paths.get("F:/luoo2.html"), new FileOutputStream("G:/meh2.html"));//复制
			Files.copy(Paths.get("F:/meh.jpg"),new FileOutputStream("G:/arry.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
