package class_16_public;




public class BookTest2  {
	public static void main(String[] args) {
		Book2 book2  = new Book2();
		book2.test();
		book2.name = "sad";
		
		
		
		// 全局下访问不到缺省的属性和方法
		
		//  	 private	default 	 protected 		  public
		
		//同类中		是		   是			         是				是
		
		//同包中		否		   是			         是				是
				
		//子类中		否		   否			         是				是
		
		//全局中		否		   否			         否				是
	}
}
