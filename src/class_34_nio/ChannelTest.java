package class_34_nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;



public class ChannelTest {
	public static void main(String[] args) {
		//针对小文件的处理 
		File file = new File("E:/照片/长沙大学/1.jpg");
		try (
				//输入通道
				FileChannel inChannel = new FileInputStream(file).getChannel();
				//输出通道
				FileChannel outChannel = new FileOutputStream("F:/meh.jpg").getChannel();
			){
			//map()	
			MappedByteBuffer buffer = inChannel.map(MapMode.READ_ONLY, 0, file.length());
			outChannel.write(buffer);
			buffer.clear();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//字符流的处理
		File file2 = new File("F:/luoo2.html");
		try (
				//输入通道
				FileChannel inChannel = new FileInputStream(file2).getChannel();
				//输出通道
				FileChannel outChannel = new FileOutputStream("F://luooo.html").getChannel();
				){
			
			MappedByteBuffer buffer = inChannel.map(MapMode.READ_ONLY, 0, file2.length());
			outChannel.write(buffer);
			buffer.clear();
			
			//字符集工具类
			Charset charset = Charset.forName("UTF-8");
			//文件内容解码器
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charBuffer = decoder.decode(buffer);
			System.out.println(charBuffer.toString());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//写入功能
		try (
				//输出通道
				FileChannel outChannel = new FileOutputStream("F:/1.txt",true).getChannel();
				
			){
			CharBuffer buffer = CharBuffer.wrap("1苏轼2苏辙3苏洵");
			Charset charset = Charset.defaultCharset();
			ByteBuffer byteBuffer = charset.encode(buffer);
//			ByteBuffer byteBuffer = Charset.defaultCharset().encode("我爱你");
			//map
			outChannel.write(byteBuffer);
			//重新初始化 为下一次读取做准备
			byteBuffer.clear();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//分段读取内容 在读取大文件的时候.map方法是不合适的 因为map方法是将整块东西映射到了内存中 所以文件过大的话内存是吃不消的
		try (
				FileInputStream inputStream = new FileInputStream("F:/luoo2.html");
				FileChannel fileChannel = inputStream.getChannel();
				) {
			
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
			//byte[] b = new byte[1024];
			// int len =0;
			// while((len = inputStream.read())!=-1){
			// System.out.println(new String(b,0,len));
			// }
			
			while(fileChannel.read(byteBuffer)!=-1){
				// 反转缓冲区。首先将限制设置为当前位置，然后将位置设置为 0。
				// 如果已定义了标记，则丢弃该标记。 常与compact方法一起使用。
				// 通常情况下，在准备从缓冲区中读取数据时调用flip方法。
				byteBuffer.flip();
				//创建字符解析类
				Charset charset = Charset.forName("UTF-8");
				//解析字节类
				CharBuffer charBuffer = charset.decode(byteBuffer);
				//打印
				System.out.println(charBuffer.toString());
				//重新初始化，为下一次读取数据做准备
				byteBuffer.clear();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
