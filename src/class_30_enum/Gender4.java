package class_30_enum;
public enum Gender4 implements  GenderDesc{
//	MALE("男"){
//		public void message() {
//			System.out.println("我是一个男生哦");
//		}
//	},FEMALE("女"){
//		public void message() {
//			System.out.println("我是一个女生哦");
//		}
//	},OTHER("其他"){
//		public void message() {
//			System.out.println("我是一个其他哦");
//		}
//	};
	MAN("男"),WOMAN("女");
	private Gender4(String name){
		this.name = name;
	}
	private String name;
	
	public String getName() {
		return name;
	}
	@Override
	public void message() {
		System.out.println("ashdklas");
		
	}

}
