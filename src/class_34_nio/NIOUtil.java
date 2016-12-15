package class_34_nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;

/**
 * 
 * NIO工具类 NIOUtil</br> 创建人:maerhuan </br> 时间：2016年6月1日-下午7:20:06 </br>
 * 
 * @version 1.0.0
 * 
 */
public class NIOUtil {
	/**
	 * 
	 * 针对二进制文件的拷贝</br> class_34_nio </br> 方法名：copyFile </br> 创建人：maerhuan </br>
	 * 时间：2016年6月1日-下午7:23:11 </br>
	 * 
	 * @param sourceFile
	 * @param targetFile
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void copyFile(String sourceFile, String targetFile) {
		if (new File(sourceFile).exists()) {
			// 获取当前的文件
			File file = new File(targetFile);
			// 获取当前文件的所在的目录，如果目录不存在，就采用自动创建目录的方式
			File rootPath = file.getParentFile();
			if (!rootPath.exists())
				rootPath.mkdirs();
			try (
			// 输入通道
			FileChannel inChannel = new FileInputStream(sourceFile).getChannel();
			// 输出通道
			FileChannel outChannel = new FileOutputStream(targetFile).getChannel();
					) {
				// map()
				MappedByteBuffer buffer = inChannel.map(MapMode.READ_ONLY, 0,
						sourceFile.length());
				outChannel.write(buffer);
				buffer.clear();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		

	}
	
	/**
	 * 
	 * 将指定字符串写入</br>
	 * class_34_nio </br>
	 * 方法名：readtoFile </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年6月1日-下午7:41:44 </br>
	 * @param content
	 * @param sourceFile void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void readtoFile(String content, String sourceFile) {
		if (null != content && "".equals(content)){
			System.out.println("空白");
			return;
		}
		if (new File(sourceFile).exists()) {
			// 写入功能
			try (
			// 输出通道
			FileChannel outChannel = new FileOutputStream(sourceFile)
					.getChannel();) {

				ByteBuffer byteBuffer = Charset.defaultCharset()
						.encode(content);
				// map()
				outChannel.write(byteBuffer);
				byteBuffer.clear();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	/**
	 * 
	 * 写入内容 指定是否追加</br>
	 * class_34_nio </br>
	 * 方法名：readtoFile </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年6月1日-下午7:48:54 </br>
	 * @param content
	 * @param sourceFile
	 * @param flag void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void readtoFile(String content, String sourceFile,boolean flag) {
		if (null != content && "".equals(content)){
			System.out.println("空白");
			return;
		}
		if (new File(sourceFile).exists()) {
			// 写入功能
			try (
			// 输出通道
			FileChannel outChannel = new FileOutputStream(sourceFile,flag)
					.getChannel();) {

				ByteBuffer byteBuffer = Charset.defaultCharset()
						.encode(content);
				// map()
				outChannel.write(byteBuffer);
				byteBuffer.clear();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	/**
	 * 
	 * 分段读取内容</br>
	 * class_34_nio </br>
	 * 方法名：readFile </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年6月1日-下午7:44:41 </br>
	 * @param sourceFile
	 * @param encoding void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void readFile(String sourceFile,String encoding){
		if(!new File(sourceFile).exists()){
			System.out.println("指定的文件不存在...");
			return ;
		}
		try (
				
				FileInputStream inputStream =  new FileInputStream(sourceFile);
				//创建一个通道
				FileChannel fileChannel = inputStream.getChannel();
			){
				//定义一个ByteBuffer对象

				ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
				while(fileChannel.read(byteBuffer)!=-1){
					byteBuffer.flip();
					//创建字符解析类
					Charset charset = Charset.forName(encoding);
					//解析字节类
					CharBuffer charBuffer = charset.decode(byteBuffer);
					//打印
					System.out.println(charBuffer.toString());
					//重新初始化，为下一次读取数据做准备
					byteBuffer.clear();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		NIOUtil.copyFile("E:/照片/长沙大学/1.jpg", "F:/test/2.jpg");
		NIOUtil.readtoFile("asda", "F:/1.txt");
		NIOUtil.readtoFile("asda", "F:/1.txt",true);
		NIOUtil.readFile("F:/luoo2.html", "utf-8");
	}
}
