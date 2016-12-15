package class_7_for;
/**
 * 
 * 
 * ForDemo5
 * 创建人:maerhuan 
 * 时间：2016年3月27日-下午1:58:35 
 * @version 1.0.0
 *
 */
public class ForDemo7 {
	public static void main(String[] args) {
		//打印九九乘法表
		for (int i = 1; i <10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println("\n");
		}
	}
}
