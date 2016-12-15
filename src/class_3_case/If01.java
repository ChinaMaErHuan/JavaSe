package class_3_case;
/**
 * 
 * 
 * If01
 * 创建人:maerhuan 
 * 时间：2016年3月14日-上午12:06:45 
 * @version 1.0.0
 *
 */
public class If01 {
	/**
	 * 
	 *(这里用一句话来描述这个方法的作用)
	 * ThirdClass
	 * 方法名: main
	 * 创建人:maerhuan 
	 * 时间：2016年3月14日-上午12:07:02 
	 * @param args void
	 * @exception
	 * @since 1.0.0
	 */
	public static void main(String[] args) {
		/*
		 * if在添加判断的
		 * 格式:
		 * 
		 * if(boolean){
		 * 	  //true体
		 * }else{
		 *	  //false体
		 * }
		 * 
		 * 多种选择
		 * if(true){
		 * 		//true体
		 * }else if(true){
		 * 		//true体
		 * }else if(true){
		 * 	//true体
		 * }....
		 * else{
		 *	//false体,
		 * }
		 * 
		 * 比较：一定是两个物体之间才有比较关系,一定已知量(具体的值)一个未知量(变量) 
		 * 
		 * 
		 * 
		 * */
		int num = 30;
		//boolean mark = num>30;
		//if(mark){
		if(num>30){
			System.out.println("大于");
		}else{
			System.out.println("不大于");
		}
		
		//ctrl+/ 或者ctrl+shift+c --单行注释
		//ctrl+shift+/ ---多行注释
		
		//统计keke属于哪类人群----青年 0-16 17-35 壮年 36-50 中年 其他老年
		int age = 30;
		//逻辑符 && 并且(且) 或者 || 非 !(取反)(假亦真，真亦假) 
		
//		boolean mark =!!!(1>2 && 2>3);
		//&&符号代表---且
		
		//嫁男人---条件一：长得帅 条件二：男的，条件三：有钱
		//长得帅 并且 男的 并且有钱
		//长得帅 && 男的 && 有钱=
//		if(长得帅 && 男的 && 有钱){
//			System.out.println("约会了");
//		}else{
//			System.out.println("滚开点");
//		}
		
//		if(true && true && true){
//			System.out.println("约会了");
//		}else{
//			System.out.println("滚开点");
//		}
		
		//&& 所有条件为真是，才为true,其他的都是假的---只要全部都是真才是true
//		false && false && false ==false
//		true && true && false===false
		
//		boolean cmark = !(1>2)&&!(5<6); 
//		System.out.println(cmark);
		
		//||或者 完整判断 ==============只有一个为真就是true
		//只有一个为true就真的
		//true || true || true ==true
		//true||false||false===true
		//false || false ||false==false
//		if(长得帅 || 男的 || 有钱){
//			System.out.println("约会了");
//		}else{
//			System.out.println("滚开点");
//		}
		
		
		//算术运算符，逻辑运算符，位运算符，循环，swtich-case,
		
		//封装数据类型---
		
		//String StringBuffer和StringBuilder
		
		
		//数组--二维数组
		
		
		
		//算法---List
		
	}
}
