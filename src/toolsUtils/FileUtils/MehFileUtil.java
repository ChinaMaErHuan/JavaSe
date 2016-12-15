package toolsUtils.FileUtils;


import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import toolsUtils.StringUtils.MehStringUtil;

public class MehFileUtil {

	
	private static List<File> files = new ArrayList<>();
	/**
	 * 递归获取目录下所有的文件信息
	 * 方法名：listFiles<br/>
	 * 创建人：xuchengfei <br/>
	 * 时间：2016年5月5日-下午10:38:19 <br/>
	 * 手机:1564545646464<br/>
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
			if(file.isDirectory()){//如果是目录，继续调用自己
//				files.add(file);
				listFiles(file);
			}
		}
		
		return files;
	}
	
	
	/**
	 * 递归获取目录下所有的文件信息
	 * 方法名：listFiles<br/>
	 * 创建人：xuchengfei <br/>
	 * 时间：2016年5月5日-下午10:38:19 <br/>
	 * 手机:1564545646464<br/>
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
			if(file.isDirectory()){//如果是目录，继续调用自己
//				files.add(file);
				listFiles(file,filterDirectory,suffix);
			}
		}
		
		return files;
	}
	/**
	 * 递归获取目录下所有的文件信息
	 * 方法名：listFiles<br/>
	 * 创建人：xuchengfei <br/>
	 * 时间：2016年5月5日-下午10:37:53 <br/>
	 * 手机:1564545646464<br/>
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
			if(file.isDirectory()){//如果是目录，
				listFiles(files,file);
			}
		}
		
		return files;
	}
	
	/**
	 * 
	 * (这里用一句话描述这个方法的作用)<br/>
	 * 方法名：listFiles<br/>
	 * 创建人：xuchengfei <br/>
	 * 时间：2016年5月5日-下午10:38:42 <br/>
	 * 手机:1564545646464<br/>
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
		List<File> files = MehFileUtil.listFiles("E:/myworks/JavaSe/src");//扫包
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
//		FileUtil.listFiles(new File("D:/jdk"));
	}
	
}



