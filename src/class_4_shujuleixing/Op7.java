package class_4_shujuleixing;
public class Op7 {
	
	public static void main(String[] args) {
	
		//三目运算符：只不过是if else的替代  格式（逻辑判断(boolean)）? true :false;
//		String result = null;
//		if(1>2){
//			result ="大于";
//		}else{
//			result ="不大于";
//		}
//		System.out.println(result);
		
		
		String result = 1>2?"大于":"不大于";
		int resul2 = 1>2?1:2;
		System.out.println(result);
		System.out.println(resul2);
		
		
		//冷门的一个 5.0决定了后面的6的数据类型是float的
		System.out.println(1>2?5.0:6);//6.0
	}
}