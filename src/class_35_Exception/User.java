package class_35_Exception;
public class User {

	
	private Integer id;
	private String username;
	
	
	public User(){
		super();
	}

	public User(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
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

	

	@Override
	public boolean equals(Object obj) {
		
		if(this==obj)return true;
		
		if(obj!=null && obj.getClass()==User.class){
//		if(obj!=null && obj instanceof User){
			User user = (User)obj;
			if(user.getId().equals(this.getId()) && user.getUsername().equalsIgnoreCase(this.getUsername())){
				return true;
			}
		}
		return false;
		
	}
}

/**
 * 
 * 公式：对象 instanceof 具体类（父类或者接口） 
 * 如果该对象是当前类派生出来，或者是父类或者是接口派生出来的都讲返回true。
 * 
 * 对于instanceof运算符而言，当前对象是后面类的实例或者其子类的实例都讲返回true,所有重写equals方法可以判断两个对象是否
 * 为同一个类的实例。使用instanceof是有问题的，
 */