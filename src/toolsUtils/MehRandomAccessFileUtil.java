package toolsUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MehRandomAccessFileUtil {
	/*
	 * java.io.RandomAccessFile:
	 * 是javaio中最为丰富的一个流，它既有输入功能有输入功能更。同时他可以进行文件分割和合并
	 * 以及指定位置开始读和写。
	 * getFilePointer(),获取读取文件内容的seek设定的位置
	 * seek(long post):设定读取指针的位置
	 * RandomAccessFile(file,)
	 * r:只读打开文件
	 * rw:以读写的方式打开文件
	 * rws
	 * rwd
	 * 
	 * */
	
	/**
	 * 
	 * 读取文件</br>
	 * class_33_io_toolutils </br>
	 * 方法名：readFile </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月30日-下午11:59:00 </br>
	 * @param file
	 * @param pos
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String readFile(String file,int pos){
		try (
				//创建一个任意访问流，以只读的方式创建
				RandomAccessFile randomAccessFile = new RandomAccessFile(file,"r");
				
				){
			
			//设定读取开始位置
			randomAccessFile.seek(pos);
			//以字节流的方式进行读入
			byte[] b = new byte[1024];
			int len = 0;
			StringBuilder builder = new StringBuilder();
			//开始读
			while((len = randomAccessFile.read(b))!=-1){
				builder.append(new String(b, 0, len));
			}
			//返回
			return builder.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * 
	 * content替换了原来文件的内容</br>
	 * class_33_io_toolutils </br>
	 * 方法名：writerFile </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月31日-上午12:02:21 </br>
	 * @param content
	 * @param file
	 * @return boolean </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static boolean writerFile(String content,String file){
		try (
				//创建一个任意访问流，以只读的方式创建
				RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
				
				){
			
			//可以设定读取起点位置
			//randomAccessFile.seek(randomAccessFile.length());
			randomAccessFile.seek(2);
			randomAccessFile.write(content.getBytes());
			return true;
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}	
	}
	
	/**
	 * 
	 * 指定位置插入</br>
	 * class_33_io_toolutils </br>
	 * 方法名：insertContent </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月31日-上午12:13:06 </br>
	 * @param content
	 * @param fileName
	 * @param pos void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void insertContent(String content,String fileName,long pos){
		// 创建一个临时文件
		File tmpFile = null;
		try {
			tmpFile = File.createTempFile("tmp", null);
			tmpFile.deleteOnExit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (
				//创建一个任意访问流，以只读的方式创建
				RandomAccessFile randomAccessFile = new RandomAccessFile(fileName,"rw");
				
				//输出流
				FileOutputStream out = new FileOutputStream(tmpFile);
				//输入流
				FileInputStream in = new FileInputStream(tmpFile);
				
			){
				//a.txt===01 23456789
				//temp.tmp== 23456789
				randomAccessFile.seek(pos);
				/*任意访问流开始读取内容,插入到临时文件*/
				byte[] b = new byte[1024];
				int len = 0;
				while((len=randomAccessFile.read(b))!=-1){
					out.write(b, 0, len);
				}
				//设定写的起跑位置
				randomAccessFile.seek(pos);
				randomAccessFile.write(content.getBytes());
				//01ccc5789
				//拿到临时文件的内容,拼接回去
				while((len=in.read(b))!=-1){
					randomAccessFile.write(b,0,len);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	} 
	
	
	public static void main(String[] args) {
		String file = "F:/text/1.txt";
//		String result = readFile(file, 4);
//		System.out.println(result);
		
		insertContent("ccc",file,4);
//		
		//writerFile("我爱你",file);
		
	}
}
