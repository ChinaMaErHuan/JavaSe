package class_4_shujuleixing;
public class Op4 {
	
	static int ac ;
	static char cc;
	static float ac1 ;
	static boolean cc2;
	public static void main(String[] args) {

		//--短路：或 || 且 &&  非 !
		// && 值要有一个为false,一定false 全部是true就是true
		// || 只要有一个为true，就是true ,其他都是false
		if(1>2 || 1>3){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		if(1>2 & 1>3){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		//--不短路：或 | 且 &  非 ^----不推荐使用
		
		
		
		
	}
}
