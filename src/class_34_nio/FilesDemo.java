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
		//��ȡ
		try {
			List<String> lineStrings = Files.readAllLines(Paths.get("F:/luoo2.html"));
			for (String string : lineStrings) {
				System.out.println(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//д��
		List<String> strings =  new ArrayList<>();
		//д��ȥ�Ժ���һ��һ�е�
		strings.add("��");
		strings.add("����");
		strings.add("��ɴ");
		try {
			Files.write(Paths.get("F:/meh.txt"), strings, Charset.forName("utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String content = "�Ұ���";
		try {
			Files.write(Paths.get("F://aaa.txt"),content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//��������
		try {
			Files.copy(Paths.get("F:/luoo2.html"), new FileOutputStream("G:/meh2.html"));//����
			Files.copy(Paths.get("F:/meh.jpg"),new FileOutputStream("G:/arry.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
