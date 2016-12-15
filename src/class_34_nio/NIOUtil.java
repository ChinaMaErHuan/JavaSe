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
 * NIO������ NIOUtil</br> ������:maerhuan </br> ʱ�䣺2016��6��1��-����7:20:06 </br>
 * 
 * @version 1.0.0
 * 
 */
public class NIOUtil {
	/**
	 * 
	 * ��Զ������ļ��Ŀ���</br> class_34_nio </br> ��������copyFile </br> �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��6��1��-����7:23:11 </br>
	 * 
	 * @param sourceFile
	 * @param targetFile
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void copyFile(String sourceFile, String targetFile) {
		if (new File(sourceFile).exists()) {
			// ��ȡ��ǰ���ļ�
			File file = new File(targetFile);
			// ��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ
			File rootPath = file.getParentFile();
			if (!rootPath.exists())
				rootPath.mkdirs();
			try (
			// ����ͨ��
			FileChannel inChannel = new FileInputStream(sourceFile).getChannel();
			// ���ͨ��
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
	 * ��ָ���ַ���д��</br>
	 * class_34_nio </br>
	 * ��������readtoFile </br>
	 * �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��6��1��-����7:41:44 </br>
	 * @param content
	 * @param sourceFile void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void readtoFile(String content, String sourceFile) {
		if (null != content && "".equals(content)){
			System.out.println("�հ�");
			return;
		}
		if (new File(sourceFile).exists()) {
			// д�빦��
			try (
			// ���ͨ��
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
	 * д������ ָ���Ƿ�׷��</br>
	 * class_34_nio </br>
	 * ��������readtoFile </br>
	 * �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��6��1��-����7:48:54 </br>
	 * @param content
	 * @param sourceFile
	 * @param flag void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void readtoFile(String content, String sourceFile,boolean flag) {
		if (null != content && "".equals(content)){
			System.out.println("�հ�");
			return;
		}
		if (new File(sourceFile).exists()) {
			// д�빦��
			try (
			// ���ͨ��
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
	 * �ֶζ�ȡ����</br>
	 * class_34_nio </br>
	 * ��������readFile </br>
	 * �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��6��1��-����7:44:41 </br>
	 * @param sourceFile
	 * @param encoding void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void readFile(String sourceFile,String encoding){
		if(!new File(sourceFile).exists()){
			System.out.println("ָ�����ļ�������...");
			return ;
		}
		try (
				
				FileInputStream inputStream =  new FileInputStream(sourceFile);
				//����һ��ͨ��
				FileChannel fileChannel = inputStream.getChannel();
			){
				//����һ��ByteBuffer����

				ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
				while(fileChannel.read(byteBuffer)!=-1){
					byteBuffer.flip();
					//�����ַ�������
					Charset charset = Charset.forName(encoding);
					//�����ֽ���
					CharBuffer charBuffer = charset.decode(byteBuffer);
					//��ӡ
					System.out.println(charBuffer.toString());
					//���³�ʼ����Ϊ��һ�ζ�ȡ������׼��
					byteBuffer.clear();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		NIOUtil.copyFile("E:/��Ƭ/��ɳ��ѧ/1.jpg", "F:/test/2.jpg");
		NIOUtil.readtoFile("asda", "F:/1.txt");
		NIOUtil.readtoFile("asda", "F:/1.txt",true);
		NIOUtil.readFile("F:/luoo2.html", "utf-8");
	}
}
