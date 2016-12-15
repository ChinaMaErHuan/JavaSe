package class_16_public;
/**
 * 
 * Person</br>
 * 创建人:maerhuan </br>
 * 时间：2016年10月1日-上午1:33:49 </br>
 * @version 1.0.0
 *
 */
public class Person {
	
	private Integer age;
	private String username;
	
	public Person(){
		super();
	}

	public Person(Integer age, String username) {
	
		this.age = age;
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString(){
		return "名称:" + this.username + "==年龄" + this.age;	
	}
	
	public String toString(String message){
		return message;
	}
	
	
	
	public static void main(String[] args) {
		
		
		Person person = new Person(20,"maerhuan");
		System.out.println(person.getUsername());
		System.out.println(person.toString());
		Person person2 = new Person();
		person2.setAge(20);
		person2.setUsername("hahaha");
		System.out.println(person2.getUsername());
		
	}
	
	
}
