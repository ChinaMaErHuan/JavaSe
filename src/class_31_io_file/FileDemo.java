package class_31_io_file;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import toolsUtils.StringUtils.MehStringUtil;

public class FileDemo {
	public static void main(String[] args) throws ParseException, IOException {
		/**
		 * java.io java.lang java.util(����+����) java.awt java.nio java.text
		 * 
		 * java.sql java.net java.rmi java.secrity
		 * 
		 * 
		 * File�� :��Ҫ��ͨ�����ȥ��ȡһ���ļ������ݵ������С�
		 *  1:�õ��ļ�/�ļ���(Ŀ��)
		 * 	2:�����ļ�(�����ȡ(InputStream)�ͳ���д��(OutPutStream))
		 */
		
		//��ȡ�ļ�
		File file = new File("F:/BaiduYunDownload/html5+css3/01 - ��һ�� - HTML5����(HTML�ķ�չ��HTML5�ĵ���HTM5��HTML�Ĺ�ϵ�����) - ��һ�¡�̶��ѧԺ�� - Arry��ʦ/code/audio.html");
		//��ȡ�ļ���
		//File directroyFile = new File("F:/Program Files");
		//����
		print("�ļ�������=="+file.getName());
		print("�ļ�����Ϊ�ļ���"+file.getParent());//ȫĿ¼
		print("���·����"+file.getPath());
		print("���·����"+file.getAbsolutePath());
		print("���ش˳���·����Ĺ淶·�����ַ�"+file.getCanonicalPath());
		//��鷽��:
		print("��ǰ�ļ��Ƿ���ڣ�"+(file.exists()?"����":"������"));
		print("��ǰ�ļ��Ƿ����ļ�:"+(file.isFile()?"��":"��"));
		print("��ǰ��Ŀ¼��:"+(file.isDirectory()?"��":"��"));
		print("�Ƿ��Ǿ��·��:"+(file.isAbsolute()?"��":"��"));
		print("�ļ��Ƿ�ɶ�:"+(file.canRead()?"��":"��"));
		print("�ļ��Ƿ��д:"+(file.canRead()?"��":"��"));
		print("�ļ��Ƿ�����:"+(file.isHidden()?"��":"��"));
		print("�����Ƿ����ִ�д˳���·�����ʾ���ļ�:"+(file.canExecute()?"��":"��"));
		print("�ļ���С:"+file.length());
		print("����޸�ʱ��:"+new Date(file.lastModified()));
		
		print("�ļ��Ĵ�С1��"+MehStringUtil.countFileSize(file.length()));
		print("�ļ��Ĵ�С2��"+MehStringUtil.countFileSize("F:/BaiduYunDownload/html5+css3/01 - ��һ�� - HTML5����(HTML�ķ�չ��HTML5�ĵ���HTM5��HTML�Ĺ�ϵ�����) - ��һ�¡�̶��ѧԺ�� - Arry��ʦ/code/audio.html"));
		print("�ļ��Ĵ�С3��"+MehStringUtil.countFileSize(file));
		print("�ļ��Ĵ�С4��"+MehStringUtil.byteCountToDisplaySize(file.length()));
		print("�ļ�������޸�ʱ��:"+file.lastModified());
		print("�ļ�������޸�ʱ��:"+MehStringUtil.dateToString(new Date(file.lastModified()), "yyyy/MM/dd HH:mm"));
		
		
		
		
		
		
	}
	
	
	
	
	public static void print(String messgae){
		System.out.println(messgae);
	}
	
}
