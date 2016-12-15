package class_31_io_file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import toolsUtils.StringUtils.MehStringUtil;

public class MehFileUtil {

	
	private static List<File> files = new ArrayList<>();
	/**
	 * �ݹ��ȡĿ¼�����е��ļ���Ϣ
	 * ������listFiles<br/>
	 * �����ˣ�maerhuan <br/>
	 * ʱ�䣺2016��5��5��-����10:38:19 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param directory
	 * @return List<File><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static List<File> listFiles(File directory){
		File[] files2 = directory.listFiles();
		for (File file : files2) {
			if(file.isFile()){
				files.add(file);
			}
			if(file.isDirectory()){//�����Ŀ¼����������Լ�
//				files.add(file);
				listFiles(file);
			}
		}
		
		return files;
	}
	
	
	/**
	 * �ݹ��ȡĿ¼�����е��ļ���Ϣ ���Թ��˵�
	 * ������listFiles<br/>
	 * �����ˣ�maerhuan <br/>
	 * ʱ�䣺2016��5��5��-����10:38:19 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param directory
	 * @return List<File><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static List<File> listFiles(File directory,final String filterDirectory,String suffix){
		File[] files2 = directory.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(MehStringUtil.isNotEmpty(filterDirectory)){
					return !name.equals(filterDirectory);
				}else{
					return true;
				}
			}
		});
		for (File file : files2) {
			if(file.isFile()){
				if(suffix!=null && file.getName().endsWith(suffix)){
					files.add(file);
				}
				
				if(suffix==null){
					files.add(file);
				}
			}
			if(file.isDirectory()){//�����Ŀ¼����������Լ�
//				files.add(file);
				listFiles(file,filterDirectory,suffix);
			}
		}
		
		return files;
	}
	/**
	 * �ݹ��ȡĿ¼�����е��ļ���Ϣ
	 * ������listFiles<br/>
	 * �����ˣ�maerhuan <br/>
	 * ʱ�䣺2016��5��5��-����10:37:53 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param files
	 * @param directory
	 * @return List<File><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static List<File> listFiles(List<File> files,File directory){
		File[] files2 = directory.listFiles();
		for (File file : files2) {
			if(file.isFile()){
				files.add(file);
			}
			if(file.isDirectory()){//�����Ŀ¼��
				listFiles(files,file);
			}
		}
		
		return files;
	}
	
	/**
	 * 
	 * (������һ�仰�����������������)<br/>
	 * ������listFiles<br/>
	 * �����ˣ�maerhuan <br/>
	 * ʱ�䣺2016��5��5��-����10:38:42 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param files
	 * @param directory
	 * @return List<File><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static List<File> listFiles(String directory){
		return listFiles(new File(directory));
	}
	
	public static void main(String[] args) {
		List<File> files = MehFileUtil.listFiles("E:/myworks/JavaSe/src");//ɨ��
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		

	}
	
}
