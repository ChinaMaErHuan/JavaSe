package class_7_for;
/**
 * 
 * 
 * ForDemo6
 * 创建人:maerhuan 
 * 时间：2016年3月27日-下午2:04:05 
 * @version 1.0.0
 *
 */
public class ForDemo6 {
	public static void main(String[] args) {
		//二维数组
		int [][] agesscores = {{20,98},{30,96},{40,78}};
//		int[] ages={20,30,40};
//		int[] scores={98,96,78};
//		for (int i = 0; i < agesscores.length; i++) {
//			int []as =agesscores[i]; 
//			for (int j = 0; j < as.length; j++) {
//				System.out.println(as[j]+"\t");
//			}
//			System.out.println("");
//		}
		for (int i = 0; i < agesscores.length; i++) {
			for (int j = 0; j < agesscores[i].length; j++) {
				System.out.print(agesscores[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
