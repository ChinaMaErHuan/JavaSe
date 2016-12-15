package class_31_io_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo6 {
	/**
	 * 
	 * 不同的字符所占的字节是不同的。 　　ASCII码：
	 *　　一个英文字母（不分大小写）占一个字节的空间，一个中文汉字占两个字节的空间。一个二进制数字序列
	 * ，在计算机中作为一个数字单元，一般为8位二进制数，换算为十进制。最小值0，最大值255。如一个ASCII码就是一个字节。 　　UTF-8编码：
	　　一个英文字符等于一个字节，一个中文（含繁体）等于三个字节。 　　Unicode编码：
	 *　　一个英文等于两个字节，一个中文（含繁体）等于两个字节。 　　符号：
	 *　　英文标点占一个字节，中文标点占两个字节。举例：英文句号“.”占1个字节的大小，中文句号“。”占2个字节的大小。
	 * 
	 * IO:输入流(InputStream)和输出流(OutStream)---操作File对象的过程
	 * 
	 * IO:
	 * 
	 * 字节流 : 基类(父类)：InputStream ----范围：文件拷贝，复制，粘贴，生成文件
	 * ----应用于：二进制文件的处理(图片，视频，音频。) ---典型的子类：FileInputStream ---方法： ---int
	 * read()===从输入流里面取单个字节，返回所读取的内容。 ---int read(byte[] b)===
	 * 从输入流中最多读取b.length个字节数据，并将其存储在字节数组中b中，返回字节数 ---int read(byte[] b,int
	 * off,int len)===从输入流中最多读取len个字节的数据, - --available()代表还剩下多少没有读取完毕。读取完毕返回0
	 * 字符流:用来操作文件内容的,---文本文件 一般是对应文本文件内容的添加，修改，追加，和删除。
	 * 
	 * 字节流 和 字符流一般的用户几乎一摸一样的，区别在于字节流和字符流操作的单元不同--字节流操作数据单元8位。 而字符流可以操作16位。
	 * 
	 * 1byte = 8 bit 中 2byte = 16bit;
	 * 
	 * char[]--字符流 byte[]---字节流
	 * 
	 * 缓冲流:它是对字节流和字符流的以缓冲作用
	 * 
	 * 
	 * 二进制文件:图片，视频，音频。 文本文件:html,java,txt,
	 * 
	 * office文件:.doc,docx,pdf,--io读取---poi/jxl去读取--io
	 * */

	public static void main(String[] args) {
		//字节流:
		//InputStream:直接已知子类
		/*
		 * AudioInputStream, ByteArrayInputStream, FileInputStream,
		 * FilterInputStream, InputStream, ObjectInputStream, PipedInputStream,
		 * SequenceInputStream, StringBufferInputStream
		 */
		
		// OutputStream:直接已知子类:
		/*
		 * ByteArrayOutputStream, FileOutputStream, FilterOutputStream,
		 * ObjectOutputStream, OutputStream, PipedOutputStream
		 */
		File aFile = new File("F:/luoo2.html");//创建文件
		if (aFile.exists()) {
			FileInputStream in = null;
			try {
				//获取流
				in = new FileInputStream(aFile);
				int count = 0;
				//byte[] b = new byte[1024];
				
				//单个字节读取:说白了就是一个字母一个字母的读取
				/*int len = 0;
				while ((len = in.read()) != -1) {
					System.out.println((char) len);
					count++;
				}

				System.out.println("============>" + count);*/
				 
				
				//多字节读取
//				byte[] b = new byte[1024];
//				int len2 = 0;
//				while((	len2 = in.read(b))!=-1){
//					System.out.println(new String(b));
//					count++;
//				}
//				System.out.println("============>"+count);
				
				long total = aFile.length();
				byte[] bb = new byte[1024];
				int len = 0;
				while((	len = in.read(bb))!=-1){
					System.out.println(new String(bb,0,len,"UTF-8"));//从数组的多少位开始到多少位结束组成字符串 制定字符集
					System.out.println("还剩下："+in.available()+"byte");
					System.out.println("====读取进度====="+(1-(in.available() / (float)total))*100);
					count++;
				}
				System.out.println("一共读取了============>"+count);
				 
				 
			} catch (IOException e) {
					e.printStackTrace();
			} finally {
				try {
					if (in != null)
						in.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
