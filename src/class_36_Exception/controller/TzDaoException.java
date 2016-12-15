package class_36_Exception.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class TzDaoException extends Exception {

	/**
	 * serialVersionUID:TODO����һ�仰�������������ʾʲô��
	 * 
	 * @since 1.0.0
	 */

	private static final long serialVersionUID = 1L;
	/*
	 *  serialVersionUID ����������Ĳ�ͬ�汾��ļ����ԡ�������޸��˴���, Ҫ�޸Ĵ�ֵ�� 
	 * ������ǰ���ϰ汾�������л�����ָ�ʱ�����Ϊ���ڷ����л�ʱ��  ȷ����汾�ļ����ԣ������ÿ��Ҫ���л������м���private static
	 * final long serialVersionUID ������ԣ�������ֵ�Լ����塣�ھ����ϵ�����Ϳ����Զ���ӡ� 
	 * ��ȻҲ����ȥ�����档���ã�Window-->Preferences-->Java ��serializable class without
	 * serialVersionUID��������warning��ΪIgnore��  Ȼ��Eclipse�����±��������Щ������ϢҲ����ʧ�ˡ�
	 */


	    public TzDaoException() {
	        super();
	    }

	    public TzDaoException(String message) {
	        super("TzServiceException==>"+message);
	    }
	    
	    
	    public void writerFile(String message){
	    	try {
	    		String ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
				FileUtils.write(new File("F://log-"+ymd+".txt"),message, "utf-8", true);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    public void writerFile(String message,Class<?> clz,String method){
	    	try {
	    		String ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
				FileUtils.write(new File("F://log-"+ymd+".txt"),clz.getName()+"===��"+method+"���쳣��Ϣ�ǣ�"+message, "utf-8", true);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

	    public TzDaoException(String message, Throwable cause) {
	        super(message, cause);
	    }

	    public TzDaoException(Throwable cause) {
	        super(cause);
	    }
	
	
}
