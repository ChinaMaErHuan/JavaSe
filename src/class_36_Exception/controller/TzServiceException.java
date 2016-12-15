package class_36_Exception.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
/**
 * 在程序框架中 捕获异常  自定义异常 为了程序更好的记录异常的信息
 * TzServiceException </br>
 * 创建人:maerhuan </br>
 * 时间：2016年6月5日-下午3:29:04 </br>
 * @version 1.0.0
 *
 */

public class TzServiceException extends Exception {

	/**
	 * serialVersionUID:（用一句话描述这个变量表示什么）
	 * 
	 * @since 1.0.0
	 */

	private static final long serialVersionUID = 1L;

	public TzServiceException() {
		super();
	}

	public TzServiceException(String message) {
		super("TzServiceException==>" + message);
		try {
			String ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			FileUtils.write(new File("F://log-" + ymd + ".txt"), message,
					"utf-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public TzServiceException(String message, Class<?> clz, String method) {
		super(message);
		try {
			String ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			FileUtils.write(new File("F://log-" + ymd + ".txt"), clz.getName()
					+ "===【" + method + "】异常信息是：" + message + "\r\n", "utf-8",
					true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public TzServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public TzServiceException(Throwable cause) {
		super(cause);
	}

}
