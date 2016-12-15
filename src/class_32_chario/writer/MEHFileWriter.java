package class_32_chario.writer;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * 马二欢重构的类 可以制定FileWriter的编码 MehFileWriter</br> 创建人:MaErhuan </br>
 * 时间：2016年5月29日-下午4:42:38 </br>
 * 
 * @version 1.0.0
 * 
 */

public class MEHFileWriter extends OutputStreamWriter {

	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param fileName
	 * @throws IOException
	 */
	public MEHFileWriter(String fileName) throws IOException {
		super(new FileOutputStream(fileName));
	}
	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param fileName
	 * @param charset
	 * @throws IOException
	 */
	public MEHFileWriter(String fileName, String charset) throws IOException {
		super(new FileOutputStream(fileName), charset);
	}
	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param fileName
	 * @param charset
	 * @throws IOException
	 */
	public MEHFileWriter(File fileName, String charset) throws IOException {
		super(new FileOutputStream(fileName), charset);
	}
	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param fileName
	 * @param charset
	 * @param append
	 * @throws IOException
	 */
	public MEHFileWriter(File fileName, String charset, boolean append)
			throws IOException {
		super(new FileOutputStream(fileName, append), charset);
	}
	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param fileName
	 * @param charset
	 * @param append
	 * @throws IOException
	 */
	public MEHFileWriter(String fileName, String charset, boolean append)
			throws IOException {
		super(new FileOutputStream(fileName, append), charset);
	}
	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param fileName
	 * @param append
	 * @throws IOException
	 */
	public MEHFileWriter(String fileName, boolean append) throws IOException {
		super(new FileOutputStream(fileName, append));
	}

	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param file
	 * @throws IOException
	 */
	public MEHFileWriter(File file) throws IOException {
		super(new FileOutputStream(file));
	}

	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param file
	 * @param append
	 * @throws IOException
	 */
	public MEHFileWriter(File file, boolean append) throws IOException {
		super(new FileOutputStream(file, append));
	}

	/**
	 * 
	 * 创建一个新的实例 MEHFileWriter.
	 * @param fd
	 */
	public MEHFileWriter(FileDescriptor fd) {
		super(new FileOutputStream(fd));
	}

}
