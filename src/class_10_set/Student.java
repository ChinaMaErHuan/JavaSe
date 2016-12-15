package class_10_set;
public class Student {
	private String username;
	private Integer age;
	private Integer score;
	
	
	public Student(){
		super();
	}
	
	public Student(String username, Integer age, Integer score) {
		super();
		this.username = username;
		this.age = age;
		this.score = score;
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
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

	

	
}
