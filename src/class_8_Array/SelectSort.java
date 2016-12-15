package class_8_Array;

import java.util.Random;







/**
 * 
 * 
 * SelectSort
 * 创建人:maerhuan 
 * 时间：2016年3月28日-下午11:29:09 
 * @version 1.0.0
 *
 */
public class SelectSort {
	

	/**
	 * 
	 * 选择排序
	 * Eight 
	 * 方法名：main
	 * 创建人：maerhuan 
	 * 时间：2016年3月28日-下午11:29:19 
	 * @param args void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void main(String[] args) {
		Integer[] aIntegers = new Integer[100];
		Random random = new Random(100);//100是毫秒的意思
		for (int i = 0; i <100; i++) {
			aIntegers[i] = random.nextInt(100);//产生0-100的随机整数
		}
		
/*		int len = aIntegers.length;
		int minIndex = 0;
		for (int i = 0; i < len; i++) {
			minIndex = i;
			for (int j = i+1; j <len; j++) {
				if(aIntegers[minIndex]>aIntegers[j]){
					minIndex = j;	
				}
			}
			if(minIndex != i){
				int temp = aIntegers[i];
				aIntegers[i] = aIntegers[minIndex];
				aIntegers[minIndex] = temp;
			}
		}*/
		//Tools.SortUntil.SelectSort(aIntegers);
		//Tools.SortUntil.BubbleSort(aIntegers);
		
		for (int i = 0; i < aIntegers.length; i++) {
			System.out.println(aIntegers[i]);
		}
		
		
	}
	/**
	 * 
	 * 选择排序
	 * Eight 
	 * 方法名：SelectSort
	 * 创建人：maerhuan 
	 * 时间：2016年3月29日-上午12:00:25 
	 * @param array
	 * @return int[]
	 * @exception 
	 * @since  1.0.0
	 */
//	public static Integer[] SelectSort(Integer[] array){
//		int len = array.length;
//		int minIndex = 0;
//		for (int i = 0; i < len; i++) {
//			minIndex = i;
//			for (int j = i+1; j <len; j++) {
//				if(array[minIndex]>array[j]){
//					minIndex = j;	
//				}
//			}
//			if(minIndex != i){
//				int temp = array[i];
//				array[i] = array[minIndex];
//				array[minIndex] = temp;
//			}
//		}
//		return array;
//	}
}
