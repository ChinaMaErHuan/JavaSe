package class_30_enum;

public enum DBEnum {
	MYSQL("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/blog", "root",
			"147852"), ORACLE("com.oracle.jdbc.Driver",
			"jdbc:mysql://localhost:3306/blog", "root", "147852");

	private String driver;
	private String url;
	private String username;
	private String password;

	// 私有构造函数
	private DBEnum(String driver, String url, String username, String password) {
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
