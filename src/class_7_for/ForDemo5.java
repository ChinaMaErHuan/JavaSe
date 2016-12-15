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
public class ForDemo5 {
	public static void main(String[] args) {
		//多重循环
		//外层循环只是控制内层循环的次数。
		for (int i = 0; i <=10; i++) {
			for (int j = 0; j <=10; j++) {
				System.out.println(i+"==="+j);
			}
			//外层循环体
			System.out.println("============");
		}
	}
}
