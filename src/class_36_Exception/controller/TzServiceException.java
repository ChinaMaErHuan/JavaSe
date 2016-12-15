package class_36_Exception.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
/**
 * �ڳ������� �����쳣  �Զ����쳣 Ϊ�˳�����õļ�¼�쳣����Ϣ
 * TzServiceException </br>
 * ������:maerhuan </br>
 * ʱ�䣺2016��6��5��-����3:29:04 </br>
 * @version 1.0.0
 *
 */

public class TzServiceException extends Exception {

	/**
	 * serialVersionUID:����һ�仰�������������ʾʲô��
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
					+ "===��" + method + "���쳣��Ϣ�ǣ�" + message + "\r\n", "utf-8",
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
