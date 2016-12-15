package class_32_chario.writer;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * ������ع����� �����ƶ�FileWriter�ı��� MehFileWriter</br> ������:MaErhuan </br>
 * ʱ�䣺2016��5��29��-����4:42:38 </br>
 * 
 * @version 1.0.0
 * 
 */

public class MEHFileWriter extends OutputStreamWriter {

	/**
	 * 
	 * ����һ���µ�ʵ�� MEHFileWriter.
	 * @param fileName
	 * @throws IOException
	 */
	public MEHFileWriter(String fileName) throws IOException {
		super(new FileOutputStream(fileName));
	}
	/**
	 * 
	 * ����һ���µ�ʵ�� MEHFileWriter.
	 * @param fileName
	 * @param charset
	 * @throws IOException
	 */
	public MEHFileWriter(String fileName, String charset) throws IOException {
		super(new FileOutputStream(fileName), charset);
	}
	/**
	 * 
	 * ����һ���µ�ʵ�� MEHFileWriter.
	 * @param fileName
	 * @param charset
	 * @throws IOException
	 */
	public MEHFileWriter(File fileName, String charset) throws IOException {
		super(new FileOutputStream(fileName), charset);
	}
	/**
	 * 
	 * ����һ���µ�ʵ�� MEHFileWriter.
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
	 * ����һ���µ�ʵ�� MEHFileWriter.
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
	 * ����һ���µ�ʵ�� MEHFileWriter.
	 * @param fileName
	 * @param append
	 * @throws IOException
	 */
	public MEHFileWriter(String fileName, boolean append) throws IOException {
		super(new FileOutputStream(fileName, append));
	}

	/**
	 * 
	 * ����һ���µ�ʵ�� MEHFileWriter.
	 * @param file
	 * @throws IOException
	 */
	public MEHFileWriter(File file) throws IOException {
		super(new FileOutputStream(file));
	}

	/**
	 * 
	 * ����һ���µ�ʵ�� MEHFileWriter.
	 * @param file
	 * @param append
	 * @throws IOException
	 */
	public MEHFileWriter(File file, boolean append) throws IOException {
		super(new FileOutputStream(file, append));
	}

	/**
	 * 
	 * ����һ���µ�ʵ�� MEHFileWriter.
	 * @param fd
	 */
	public MEHFileWriter(FileDescriptor fd) {
		super(new FileOutputStream(fd));
	}

}
