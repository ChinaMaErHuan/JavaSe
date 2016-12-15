package class_37_Socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.FileUtils;

import toolsUtils.StringUtils.MehStringUtil;

/** 
 * 
 * MEHDownloadUtil</br> 创建人:maerhuan </br> 时间：2016年6月6日-下午9:07:52 </br>
 * 
 * @version 1.0.0
 * 
 */
public class MEHDownloadUtil {

	public static void main(String[] args) {
		//1.测试第一个方法
//		String link = "http://www.luoo.net/";
//		String htmlsource = getHTMLSource(link);
//		try {
//			FileUtils.writeStringToFile(new File("F://luooindex.html"), htmlsource, "utf-8");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//正则 jsoup htmlparser都获取网页源码中的图片地址---进行批量下载
//		String url2 = "http://7xkszy.com2.z0.glb.qiniucdn.com/pics/vol/573b56cd3e387.jpg";
		
//		
		for(int j=818;j<=821;j++){
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

	/**
	 * 
	 * 抓取网页源代码</br>
	 * class_37_Socket </br>
	 * 方法名：getHTMLSource </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年6月6日-下午9:35:21 </br>
	 * @param link
	 * @return String </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public static String getHTMLSource(String link) {
		try {
			// 第一步：初始化以URL对象
			URL url = new URL(link);
			// 第二步：获取打开URL和java程序之间连接
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			// connection.setConnectTimeout(6000);//6秒之内如果没有响应，此次请求结束,如果不设定是一致等待
			// 伪装浏览器的方式去抓取网络信息
			connection
					.setRequestProperty(
							"User-Agent",
							"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");
			// 获取网页代码的编码
			String encoding = MehStringUtil.defaultValue(
					connection.getContentEncoding(), "utf-8");
			//System.out.println(encoding);
			StringBuilder builder = new StringBuilder();
			try (
					InputStream inputStream = connection.getInputStream();
					InputStreamReader isReader = new InputStreamReader(
							inputStream,encoding);
					BufferedReader reader = new BufferedReader(isReader);

			) {
				String lineString = "";
				while ((lineString = reader.readLine()) != null) {
					if (!lineString.trim().equals("")){//去掉空格行
					builder.append(lineString + "\r\n");
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return builder.toString();

		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
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
			// 第一步：初始化以URL对象
			URL url = new URL(linkFile);
			// 第二步：获取打开URL和java程序之间连接
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			// connection.setConnectTimeout(6000);//6秒之内如果没有响应，此次请求结束,如果不设定是一致等待
			// 伪装浏览器的方式去抓取网络信息
			connection
					.setRequestProperty(
							"User-Agent",
							"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");
			// 获取网页代码的编码
			String encoding = MehStringUtil.defaultValue(
					connection.getContentEncoding(), "UTF-8");
			System.out.println(encoding);
			//第三步:通过IO网络下载 InputStream
			System.out.println(connection.getContentLengthLong());
			System.out.println(connection.getContentType());
			System.out.println(connection.getResponseMessage());
			System.out.println(connection.getDate());
//			System.out.println(connection.getFileNameMap());
			System.out.println(connection.getRequestMethod());
			System.out.println(connection.getContentLength());
			
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
}
