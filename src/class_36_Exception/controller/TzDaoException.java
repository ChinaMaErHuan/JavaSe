package class_36_Exception.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class TzDaoException extends Exception {

	/**
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）
	 * 
	 * @since 1.0.0
	 */

	private static final long serialVersionUID = 1L;
	/*
	 *  serialVersionUID 用来表明类的不同版本间的兼容性。如果你修改了此类, 要修改此值。 
	 * 否则以前用老版本的类序列化的类恢复时会出错。为了在反序列化时，  确保类版本的兼容性，最好在每个要序列化的类中加入private static
	 * final long serialVersionUID 这个属性，具体数值自己定义。在警告上点左键就可以自动添加。 
	 * 当然也可以去掉警告。设置：Window-->Preferences-->Java 将serializable class without
	 * serialVersionUID的设置由warning改为Ignore。  然后Eclipse会重新编译程序，那些警告信息也就消失了。
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
				FileUtils.write(new File("F://log-"+ymd+".txt"),clz.getName()+"===【"+method+"】异常信息是："+message, "utf-8", true);
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
