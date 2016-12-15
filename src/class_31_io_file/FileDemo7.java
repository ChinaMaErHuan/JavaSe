package class_31_io_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 文件的拷贝 FileDemo7</br> 创建人:maerhuan </br> 时间：2016年5月28日-下午6:50:11 </br>
 * 
 * @version 1.0.0
 * 
 */
public class FileDemo7 {
	public static void main(String[] args) {
		// 文件的复制
		File file = new File("G://luoo.html");
		File file2 = new File("F:/luoo2.html");
		if (file2.exists()) {
			// 字节流
			// 输入流
			FileInputStream inputStream = null;
			// 输出流
			FileOutputStream outputStream = null;

			try {
				inputStream = new FileInputStream(file2);
				outputStream = new FileOutputStream(file);
				// 如果FileOutputStream(file,true)的话 就是追加 不断的追加 你多运行的话 其实就是文件的多次复制
				// 不断的追加到制定文件中
				// 获取流(读入)
				int len = 0;
				byte[] bs = new byte[1024];
				while ((len = inputStream.read(bs)) != -1) {
					outputStream.write(bs, 0, len);
				}
				 outputStream.flush();
				/*
				 * flush() 是清空，而不是刷新啊。
				 * 一般主要用在IO中，即清空缓冲区数据，就是说你用读写流的时候，其实数据是先被读到了内存中，
				 * 然后用数据写到文件中，当你数据读完的时候不代表你的数据已经写完了， 因为还有一部分有可能会留在内存这个缓冲区中。
				 * 这时候如果你调用了 close()方法关闭了读写流，那么这部分数据就会丢失，
				 * 所以应该在关闭读写流之前先flush()，先清空数据。
				 */
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					// 关闭流要对称关闭
					if (outputStream != null)
						outputStream.close();
					if (inputStream != null)
						inputStream.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		}

	}
}
