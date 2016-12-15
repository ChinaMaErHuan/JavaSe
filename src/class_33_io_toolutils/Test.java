package class_33_io_toolutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) {
		try(
				FileInputStream in =  new FileInputStream("E:/照片/长沙大学/1.jpg");
				//转成字符流char
				InputStreamReader reader = new InputStreamReader(in);
				FileOutputStream out = new FileOutputStream("F:/1.jpg");
				OutputStreamWriter writer = new OutputStreamWriter(out);
				
				) {

			byte[] c = new byte[1024];
			int len = 0;
			while((len=in.read(c))!=-1){
				out.write(c,0,len);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
