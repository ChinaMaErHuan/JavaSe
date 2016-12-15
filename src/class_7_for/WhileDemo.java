package class_7_for;

/**
 * 
 * 
 * WhileDemo
 * 创建人:maerhuan 
 * 时间：2016年3月27日-下午2:55:03 
 * @version 1.0.0
 *
 */
public class WhileDemo {
	public static void main(String[] args) {
		/**
		 * while循环
		 * int i= 0;
		 * while(逻辑判断){
		 * 	//循环体
		 * 	//计数器
		 * }
		 */
		System.out.println("请输入你想要打印的乘法表的数字");
		int i =1;
		while(i<10){
			int j =1;
			while(j<=i){
				System.out.print(j+"*"+i+"="+j*i+"\t");
				j++;
			}
			System.out.println("\n");
			i++;
		}
	}
}
