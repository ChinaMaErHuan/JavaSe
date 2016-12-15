package class_38_toolutil;

import java.util.Date;

public class Person implements java.io.Serializable {
	/**
	 * serialVersionUID:TODO����һ�仰�������������ʾʲô��
	 * @since 1.0.0
	 */
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	public String username;
	private Integer age;
	private Date birthday;
	private String address;

	public Person() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}