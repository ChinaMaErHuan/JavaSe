package class_30_enum;
public enum Gender3 {
	MALE("男"),FLMALE("女");
	
	//解决赋值限制的问题除了利用switch case以还可以利用私有的构造器
	private Gender3(String name){
		this.name = name;
	}
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	
}
