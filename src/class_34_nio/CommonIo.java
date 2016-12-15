package class_34_nio;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * ���Ժ�Ŀ����� javaio�еķ������������Ƿ�װ apache����Ĺ��߰�����common-io�������ṩ�˺ܶ෽��ֱ��ʹ�þͿ�����
 * 
 * CommonIo</br>
 * ������:maerhuan </br>
 * ʱ�䣺2016��6��1��-����2:35:57 </br>
 * @version 1.0.0
 *
 */
public class CommonIo {
	public static void main(String[] args) {
		try {
			//String string = FileUtils.readFileToString(new File("F:/luoo2.html"), "utf-8");
			//System.out.println(string);
			//�����ļ���
			FileUtils.copyDirectory(new File("F:/text/a"), new File("F:/text/b"));
			
			//commons-fileupload.jar---���� commons-io-.jar
			List<String> htmlList = FileUtils.readLines(new File("F:/luoo2.html"),"utf-8");
			for (String string : htmlList) {
				System.out.println(string);
			}
			
			String string = FileUtils.byteCountToDisplaySize(123456L);
			System.out.println(string);
//			BigInteger bigInteger = FileUtils.sizeOfAsBigInteger(new File("F:/1.txt"));
//			System.out.println(bigInteger);
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
