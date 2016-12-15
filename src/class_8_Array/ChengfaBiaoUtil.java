package class_8_Array;
/**
 * 
 * 
 * ChengfaBiaoUtil
 * 创建人:maerhuan 
 * 时间：2016年3月28日-下午8:28:58 
 * @version 1.0.0
 *
 */
public class ChengfaBiaoUtil {
	/**
	 * 
	 * 控制台打印九九乘法表
	 * Eight 
	 * 方法名：chengfa
	 * 创建人：maerhuan 
	 * 时间：2016年3月28日-下午8:29:27 
	 * @param num void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void chengfa(int num){
		for (int i = 1; i <=num ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println("\n");
		}
	}
}
