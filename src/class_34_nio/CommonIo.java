package class_34_nio;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 在以后的开发中 javaio中的方法或许不用我们封装 apache下面的工具包下面common-io包里面提供了很多方法直接使用就可以了
 * 
 * CommonIo</br>
 * 创建人:maerhuan </br>
 * 时间：2016年6月1日-下午2:35:57 </br>
 * @version 1.0.0
 *
 */
public class CommonIo {
	public static void main(String[] args) {
		try {
			//String string = FileUtils.readFileToString(new File("F:/luoo2.html"), "utf-8");
			//System.out.println(string);
			//拷贝文件夹
			FileUtils.copyDirectory(new File("F:/text/a"), new File("F:/text/b"));
			
			//commons-fileupload.jar---依赖 commons-io-.jar
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
