package class_26_reflect;
@KeKeMapping(desc = "用户管理类")
public class User implements Cloneable{
	public Integer id;// id
	@KeKeMapping(def = "keke",desc = "用户名")
	
	String username;// 姓名
	
	@KeKeMapping(def = "0.0f",desc = "金额")
	
	protected Float money;// 钱
	
	protected String[] teacher;// 教师
	
	private Long num;// 数量
	
	@KeKeMapping(desc = "构造函数")
	public User() {
		super();
	}
	
	public User(Integer id, String username, Float money, String[] teacher,
			Long num) {
		super();
		this.id = id;
		this.username = username;
		this.money = money;
		this.teacher = teacher;
		this.num = num;
	}
	@KeKeMapping(desc="主键",def="1",value="123456")
	public Integer getId() {
		return id;
	}

	public void setId(@KeKeMapping(value ="1234567") Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public String[] getTeacher() {
		return teacher;
	}

	public void setTeacher(String[] teacher) {
		this.teacher = teacher;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}
//	//克隆
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	class Iner{
		
	}

}
