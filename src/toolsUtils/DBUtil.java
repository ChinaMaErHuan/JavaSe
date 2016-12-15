package toolsUtils;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {

	
	private static final DBUtil instance = new DBUtil();
	private DBUtil(){
		
	}
	
	public static DBUtil getInstance(){
		return instance;
	}
	
	/**
	 * 
	 * (这里用一句话描述这个方法的作用)
	 * 方法名：getConnection
	 * 创建人：maerhuan
	 * 时间：2016年4月22日-下午1:26:44 
	 * 手机:1564545646464
	 * @return Connection
	 * @exception 
	 * @since  1.0.0
	 */
	public Connection getConnection(){
		Connection connection = null;
		try {
			Context context = new InitialContext();
			DataSource dataSource = (DataSource)context.lookup("java:comp/env/jdbc/kekeblog");
			connection = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		System.out.println(DBUtil.getInstance().getConnection());
	}
}
