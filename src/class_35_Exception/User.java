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
 * ��ʽ������ instanceof �����ࣨ������߽ӿڣ� 
 * ����ö����ǵ�ǰ�����������������Ǹ�������ǽӿ����������Ķ�������true��
 * 
 * ����instanceof��������ԣ���ǰ�����Ǻ������ʵ�������������ʵ����������true,������дequals���������ж����������Ƿ�
 * Ϊͬһ�����ʵ����ʹ��instanceof��������ģ�
 */