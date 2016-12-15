package class_33_io_toolutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 
 * �ļ�������������д
 * RandomAccessFileUtil</br>
 * ������:maerhuan </br>
 * ʱ�䣺2016��5��31��-����2:54:52 </br>
 * @version 1.0.0
 *
 */
public class RandomAccessFileUtil {
	/*
	 * java.io.RandomAccessFile:
	 * ��javaio����Ϊ�ḻ��һ���������������빦�������빦�ܸ���ͬʱ�����Խ����ļ��ָ�ͺϲ�
	 * �Լ�ָ��λ�ÿ�ʼ����д��
	 * getFilePointer(),��ȡ��ȡ�ļ����ݵ�seek�趨��λ��
	 * seek(long post):�趨��ȡָ���λ��
	 * RandomAccessFile(file,)
	 * r:ֻ�����ļ�
	 * rw:�Զ�д�ķ�ʽ���ļ�
	 * rws
	 * rwd
	 * 
	 * */
	
	/**
	 * 
	 * ��ȡ�ļ�</br>
	 * class_33_io_toolutils </br>
	 * ��������readFile </br>
	 * �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��5��30��-����11:59:00 </br>
	 * @param file
	 * @param pos
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String readFile(String file,int pos){
		try (
				//����һ���������������ֻ���ķ�ʽ����
				RandomAccessFile randomAccessFile = new RandomAccessFile(file,"r");
				
				){
			
			//�趨��ȡ��ʼλ��
			randomAccessFile.seek(pos);
			//���ֽ����ķ�ʽ���ж���
			byte[] b = new byte[1024];
			int len = 0;
			StringBuilder builder = new StringBuilder();
			//��ʼ��
			while((len = randomAccessFile.read(b))!=-1){
				builder.append(new String(b, 0, len));
			}
			//����
			return builder.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * 
	 * content�滻��ԭ���ļ�������</br>
	 * class_33_io_toolutils </br>
	 * ��������writerFile </br>
	 * �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��5��31��-����12:02:21 </br>
	 * @param content
	 * @param file
	 * @return boolean </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static boolean writerFile(String content,String file){
		try (
				//����һ���������������ֻ���ķ�ʽ����
				RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
				
				){
			
			//�����趨��ȡ���λ��
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
	 * ָ��λ�ò���</br>
	 * class_33_io_toolutils </br>
	 * ��������insertContent </br>
	 * �����ˣ�maerhuan </br>
	 * ʱ�䣺2016��5��31��-����12:13:06 </br>
	 * @param content
	 * @param fileName
	 * @param pos void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void insertContent(String content,String fileName,long pos){
		// ����һ����ʱ�ļ�
		File tmpFile = null;
		try {
			tmpFile = File.createTempFile("tmp", null);
			tmpFile.deleteOnExit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (
				//����һ���������������ֻ���ķ�ʽ����
				RandomAccessFile randomAccessFile = new RandomAccessFile(fileName,"rw");
				
				//�����
				FileOutputStream out = new FileOutputStream(tmpFile);
				//������
				FileInputStream in = new FileInputStream(tmpFile);
				
			){
				//a.txt===0123 456789
				//temp.tmp== 456789
				randomAccessFile.seek(pos);
				/*�����������ʼ��ȡ����,���뵽��ʱ�ļ�*/
				byte[] b = new byte[1024];
				int len = 0;
				while((len=randomAccessFile.read(b))!=-1){
					out.write(b, 0, len);
				}
				//�趨д������λ��
				randomAccessFile.seek(pos);
				
				randomAccessFile.write(content.getBytes());
				//System.out.println(randomAccessFile.getFilePointer());//7
				//0123ccc789
				//�õ���ʱ�ļ�������,ƴ�ӻ�ȥ
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
		//writerFile("�Ұ���",file);
		
	}
}
