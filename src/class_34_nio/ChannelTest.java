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
		//���С�ļ��Ĵ��� 
		File file = new File("E:/��Ƭ/��ɳ��ѧ/1.jpg");
		try (
				//����ͨ��
				FileChannel inChannel = new FileInputStream(file).getChannel();
				//���ͨ��
				FileChannel outChannel = new FileOutputStream("F:/meh.jpg").getChannel();
			){
			//map()	
			MappedByteBuffer buffer = inChannel.map(MapMode.READ_ONLY, 0, file.length());
			outChannel.write(buffer);
			buffer.clear();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�ַ����Ĵ���
		File file2 = new File("F:/luoo2.html");
		try (
				//����ͨ��
				FileChannel inChannel = new FileInputStream(file2).getChannel();
				//���ͨ��
				FileChannel outChannel = new FileOutputStream("F://luooo.html").getChannel();
				){
			
			MappedByteBuffer buffer = inChannel.map(MapMode.READ_ONLY, 0, file2.length());
			outChannel.write(buffer);
			buffer.clear();
			
			//�ַ���������
			Charset charset = Charset.forName("UTF-8");
			//�ļ����ݽ�����
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charBuffer = decoder.decode(buffer);
			System.out.println(charBuffer.toString());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//д�빦��
		try (
				//���ͨ��
				FileChannel outChannel = new FileOutputStream("F:/1.txt",true).getChannel();
				
			){
			CharBuffer buffer = CharBuffer.wrap("1����2����3���");
			Charset charset = Charset.defaultCharset();
			ByteBuffer byteBuffer = charset.encode(buffer);
//			ByteBuffer byteBuffer = Charset.defaultCharset().encode("�Ұ���");
			//map
			outChannel.write(byteBuffer);
			//���³�ʼ�� Ϊ��һ�ζ�ȡ��׼��
			byteBuffer.clear();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�ֶζ�ȡ���� �ڶ�ȡ���ļ���ʱ��.map�����ǲ����ʵ� ��Ϊmap�����ǽ����鶫��ӳ�䵽���ڴ��� �����ļ�����Ļ��ڴ��ǳԲ�����
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
				// ��ת�����������Ƚ���������Ϊ��ǰλ�ã�Ȼ��λ������Ϊ 0��
				// ����Ѷ����˱�ǣ������ñ�ǡ� ����compact����һ��ʹ�á�
				// ͨ������£���׼���ӻ������ж�ȡ����ʱ����flip������
				byteBuffer.flip();
				//�����ַ�������
				Charset charset = Charset.forName("UTF-8");
				//�����ֽ���
				CharBuffer charBuffer = charset.decode(byteBuffer);
				//��ӡ
				System.out.println(charBuffer.toString());
				//���³�ʼ����Ϊ��һ�ζ�ȡ������׼��
				byteBuffer.clear();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
