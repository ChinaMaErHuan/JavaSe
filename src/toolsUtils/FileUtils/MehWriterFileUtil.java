package toolsUtils.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * 工具类
 * WriterFileUtil</br>
 * 创建人:maerhuan </br>
 * 时间：2016年5月30日-下午7:51:52 </br>
 * @version 1.0.0
 *
 */
public class MehWriterFileUtil {
	/**
	 * 
	 * 按字节的方式写入</br>
	 * toolsUtils </br>
	 * 方法名：wirterFileBytes </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月30日-下午11:26:27 </br>
	 * @param content
	 * @param fileName
	 * @param append void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void wirterFileBytes(String content,String fileName,boolean append){
		//获取当前的文件
		File file = new File(fileName);
		//获取当前文件的所在的目录，如果目录不存在，就采用自动创建目录的方式
		File rootPath  = file.getParentFile();
		if(!rootPath.exists()) rootPath.mkdirs();
		try (
				FileOutputStream out = new FileOutputStream(fileName,append); 
				
				){
			
			byte[] b = content.getBytes();
			out.write(b);
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	/**
	 * 
	 * 按字符的方式写入</br>
	 * toolsUtils </br>
	 * 方法名：wirterFileChars </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月30日-下午11:26:32 </br>
	 * @param content
	 * @param fileName
	 * @param append void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void wirterFileChars(String content,String fileName,boolean append){
		//获取当前的文件
				File file  = new File(fileName);
				//获取当前文件的所在的目录，如果目录不存在，就采用自动创建目录的方式 
				File rootPath = file.getParentFile();
				if(!rootPath.exists())rootPath.mkdirs();
				try (
					//建立输出流
					FileOutputStream out = new FileOutputStream(fileName,append);
					//InputStreamReader()和OutputStreamWrriter可以指定编码
					OutputStreamWriter writer = new OutputStreamWriter(out);
					//FileWriter writer = new FileWriter(fileName,append);	
				){
					writer.write(content);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	/**
	 * 
	 * 按行写入</br>
	 * toolsUtils </br>
	 * 方法名：wirterFileLine </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月30日-下午11:26:39 </br>
	 * @param content
	 * @param fileName
	 * @param append void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void wirterFileLine(String content, String fileName,boolean append) {
		// 获取当前的文件
		File file = new File(fileName);
		// 获取当前文件的所在的目录，如果目录不存在，就采用自动创建目录的方式
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (
		// 建立输出流
		FileOutputStream out = new FileOutputStream(fileName, append);
				OutputStreamWriter outwriter = new OutputStreamWriter(out);
				BufferedWriter writer = new BufferedWriter(outwriter);
				) {
			
			writer.write(content);
			writer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * 按行写入</br>
	 * toolsUtils </br>
	 * 方法名：wirterFileLines </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月30日-下午11:26:44 </br>
	 * @param content
	 * @param fileName
	 * @param append void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void wirterFileLines(String content,String fileName,boolean append){
		//获取当前的文件
		File file  = new File(fileName);
		//获取当前文件的所在的目录，如果目录不存在，就采用自动创建目录的方式 
		File rootPath = file.getParentFile();
		if(!rootPath.exists())rootPath.mkdirs();
		try (
			//建立输出流
				PrintWriter writer = new PrintWriter(new FileOutputStream(file, append));
				
		){
			writer.println(content);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String file = "F:/text/1.txt";
		MehWriterFileUtil.wirterFileBytes("我爱你", file, true);
		MehWriterFileUtil.wirterFileChars("哈几号房哈士大夫看见螺丝钉间是空的回复", file, true);
		MehWriterFileUtil.wirterFileLine("哈说客家话艰苦的", file, true);
		MehWriterFileUtil.wirterFileLines("哈哈哈哈吗耳环", file, true);
		wirterFileLines("白日依山尽，\r\n黄河入海流。\r\n欲穷千里目，\r\n更上一层楼。",file,false);
	}
	
}
