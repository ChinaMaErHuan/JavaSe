package class_3_case;
/**
 * 
 * 
 * If02
 * 创建人:maerhuan 
 * 时间：2016年3月14日-上午12:17:55 
 * @version 1.0.0
 *
 */
public class If02 {
	public static void main(String[] args) {
		int age = 15;
		if (age>=0&&age<=16) {
			System.out.println("少年");
		}else if(age>=17&&age<=29){
			System.out.println("青年");
		}else if (age>=30&&age<=50) {
			System.out.println("中年");
		}
		else {
			System.out.println("老年");
		}
	}
}
