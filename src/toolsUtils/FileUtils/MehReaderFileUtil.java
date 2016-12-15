package toolsUtils.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MehReaderFileUtil {
	/**
	 * 
	 * 按字节读取</br>
	 * toolsUtils </br>
	 * 方法名：ReaderFileBytes </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月30日-下午11:28:07 </br>
	 * @param fileName
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String ReaderFileBytes(String fileName) {
		File file = new File(fileName);
		// 获取当前文件的所在的目录，如果目录不存在，就采用自动创建目录的方式
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try(
				FileInputStream in = new FileInputStream(fileName);
				
				
				) {
			
			byte [] b = new byte[1024];
			int len = 0;
			StringBuilder builder  = new StringBuilder();
			while((len = in.read(b))!=-1){
				builder.append(new String(b, 0, len));
			}
			return builder.toString();
			
			
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 * 按字符读取</br>
	 * toolsUtils </br>
	 * 方法名：ReaderFileChars </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月30日-下午11:28:11 </br>
	 * @param fileName
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String ReaderFileChars(String fileName){
		// 获取当前的文件
		File file = new File(fileName);
		// 获取当前文件的所在的目录，如果目录不存在，就采用自动创建目录的方式
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		try (
				//FileReader reader = new FileReader(fileName);
				FileInputStream in = new FileInputStream(fileName);
				InputStreamReader isReader = new InputStreamReader(in);
				) {
				char[] b = new char[64];
				int len = 0;
				StringBuilder builder  = new StringBuilder();
				while((len=isReader.read(b))!=-1){
					builder.append(new String(b, 0, len));
				}
				return builder.toString();
			
		} catch (Exception e) {
			return null;
		}	
	}
	/**
	 * 
	 * 按行读取</br>
	 * toolsUtils </br>
	 * 方法名：ReaderLine </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月30日-下午11:28:19 </br>
	 * @param fileName
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String ReaderLine(String fileName) {
		// 获取当前的文件
		File file = new File(fileName);
		// 获取当前文件的所在的目录，如果目录不存在，就采用自动创建目录的方式
		File rootPath = file.getParentFile();
		if (!rootPath.exists())
			rootPath.mkdirs();
		
		try (
				//建立输出流
				FileReader fileReader = new FileReader(fileName);	
				BufferedReader reader = new BufferedReader(fileReader);
				){
			
			String line = null;
			StringBuilder builder  = new StringBuilder();
			while((line = reader.readLine())!=null){
				if (!line.trim().equals("")) {
				builder.append(line+"\r\n");
				}
			}
			return builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
//	public static void main(String[] args) {
//		String file = "F:/text/1.txt";
//		String result1 = ReaderFileBytes(file);
//		System.out.println(result1);
//		String result2 = ReaderFileChars(file);
//		System.out.println(result2);
//		String result3 = ReaderLine(file);
//		System.out.println(result3);
//	}
	
}
