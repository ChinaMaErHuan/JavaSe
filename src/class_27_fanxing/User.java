package class_27_fanxing;



public class User extends Bank<Float>{
	
	//属性，成员属性和成员方法
	private Integer id;
	private String username;
	private Float money;
	private String[] teachers;
	private Long num;
	
	//构造函数
	public User(){
		super();
	}
	
	public User(Integer id, String username, Float money, String[] teachers, Long num) {
		super();
		this.id = id;
		this.username = username;
		this.money = money;
		this.teachers = teachers;
		this.num = num;
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

	

	public String[] getTeachers() {
		return teachers;
	}

	public void setTeachers(String[] teachers) {
		this.teachers = teachers;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	@Override
	public void saveMoney(Float money) {
		// TODO Auto-generated method stub
		
	}


	


}