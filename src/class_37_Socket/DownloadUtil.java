/**
 * Tm系统平台
 * JavaSe
 * class_37_Socket
 * DownloadUtil.java
 * 创建人:maerhuan 
 * 时间：2016年10月9日-下午3:21:57 
 * 2016Tm公司-版权所有
 */
package class_37_Socket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import toolsUtils.StringUtils.MehStringUtil;

public class DownloadUtil {
	/**
	 * 
	 * 下载网络资源文件</br>
	 * class_37_Socket </br>
	 * 方法名：downloadFile </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年6月6日-下午9:35:13 </br>
	 * @param linkFile utl网址 下载资源文件的地址
	 * @param path void 目标文件 </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static void downloadFile(String linkFile, String path) {
		try {
			
			URL url = new URL(linkFile);
			
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			
			connection
					.setRequestProperty(
							"User-Agent",
							"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");
	
		    String encoding = MehStringUtil.defaultValue(
					connection.getContentEncoding(), "UTF-8");
			System.out.println(encoding);
			//通过IO网络下载 InputStream
			String name = linkFile.substring(linkFile.lastIndexOf("/")+1);
			//创建磁盘目录
			File file = new File(path);
			if(!file.exists())file.mkdirs();
			//输入到目标文件
			File filename = new File(file,name);
//			File file2 = new File(parent, child);
			try (
					//字节流
					InputStream inputStream = connection.getInputStream();
					FileOutputStream outputStream = new FileOutputStream(filename);	
					){
				byte[] b = new byte[2048];
				int len = 0;
				while((len=inputStream.read(b))!=-1){
					outputStream.write(b, 0, len);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//程序入口
	public static void main(String[] args) {
		for(int j=700;j<=702;j++){
			for(int i=1;i<=12;i++){
				try {
					String name = i+"";
					if(i<10)name = "0"+i;
					String url = "http://luoo-mp3.kssws.ks-cdn.com/low/luoo/radio"+j+"/"+name+".mp3";
					downloadFile(url,"F://download/radio"+j);
				} catch (Exception e) {
					continue;
				}
			}
		}
	}
}
