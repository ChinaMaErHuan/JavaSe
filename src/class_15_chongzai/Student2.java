package class_15_chongzai;

//静态导入
import static class_15_chongzai.StudentDao.DRIVER;
import static class_15_chongzai.StudentDao.PASSWORD;
import static class_15_chongzai.StudentDao.URL;
import static class_15_chongzai.StudentDao.USERNAME;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 * 
 * 
 * Student2
 * 创建人:maerhuan 
 * 时间：2016年4月28日-下午6:58:52 
 * @version 1.0.0
 *
 */

public class Student2 {

	private int age;
	private String nameString;
	private Float moneyFloat;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Float getMoneyFloat() {
		return moneyFloat;
	}

	public void setMoneyFloat(Float moneyFloat) {
		this.moneyFloat = moneyFloat;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {

		this.nameString = nameString;
	}

	// 下面俩个方法都是构造函数 是重载的
	public void SetStudent(int age, String name) {
		this.age = age;
		this.nameString = name;

	}

	public void SetStudent(Integer age, String name) {
		this.age = age;
		this.nameString = name;

	}

	/**
	 * 重载是针对方法 --针对当前类本身的方法 方法名相同 参数列表的数据类型不一致就是重载 与修饰符无关 与返回值无关 为什么与返回值无关？
	 * 好处：提高代码的复用性
	 */
	
	
	/**
	 * 静态导入的问题 吧一个类中的静态成员通过静态导入的方式 可以当作自己的静态成员一样使用
	 * 可以把mysql数据库连接的问题写成一个类
	 *  
	 */
	// 在以后的开发中对文件的操作可能会产生两个方法:
	public static String readFile(File file) {
		// 对文件的读写全部写在这里
		return "";
	}

	public static String readFie(String filename) {
		File file = new File(filename);
		return Student2.readFile(file);
	}
	/**
	 * 
	 * 获取数据库链接的方法
	 * fifteen_gouzaofun_chongzai 
	 * 方法名：getConnection
	 * 创建人：maerhuan 
	 * 时间：2016年4月28日-下午11:05:48 
	 * @return Connection
	 * @exception 
	 * @since  1.0.0
	 */
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(
					URL, USERNAME, PASSWORD);
			return connection;
		} catch (Exception e) {
			return null;

		}

	}

	public static void main(String[] args) {
		// Student2 student2 = new Student2();
		// student2.readFie("d:1.txt");
		// student2.readFile(new File("d:1.txt"));
	}
}
