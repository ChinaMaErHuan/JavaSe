package class_8_Array;
/**
 * 
 * 
 * ArraysUtil
 * 创建人:maerhuan 
 * 时间：2016年3月28日-下午9:27:13 
 * @version 1.0.0
 *
 */
public class ArraysUtil {
	public static void main(String[] args) {
		//二维数组打印的两种方式
/*		int [][]a = {{10,20},{30,50},{60,89}};
		//1.
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]+"\t");
			}
			System.out.println("=============");
		}
		//2.
		for (int i = 0; i < a.length; i++) {
			int []aa = a[i];
			for (int j = 0; j < aa.length; j++) {
				System.out.println(aa[j]+"\t");
			}
			System.out.println("*************");
		}*/
		
		int [][]a = {{1,2},{3,4},{5,6}};//开辟了三个数组空间地址
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
	}
}
