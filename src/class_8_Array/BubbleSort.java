package class_8_Array;

/**
 * 
 * 
 * BubbleSort
 * 创建人:maerhuan 
 * 时间：2016年3月28日-下午11:06:06 
 * @version 1.0.0
 *
 */

public class BubbleSort {
	/**
	 * 
	 * 冒泡排序 Eight 方法名：main 创建人：maerhuan 时间：2016年3月28日-下午10:39:55
	 * 
	 * @param args
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public static void main(String[] args) {
		int[] a = { 1, 132, 45, 36, 44, 987, 654, 46546, 78, 45465465, 12,
				3654, 2564, 15973 };
		
		/*int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				count++;
			}

		}
		System.out.println("整个排序交互了---" + count + "次");*/
		// 冒泡排序
		/*int ccount = 0;
		for (int i = 0; i < a.length; i++) {// 控制次数的,控制整个交互的次数
			for (int j = 0; j < a.length - i - 1; j++) {// 值交互和对比
				if (a[j] < a[j + 1]) {//
					int temp = a[j];// 20
					a[j] = a[j + 1];// 20 15
					a[j + 1] = temp;
				}
				ccount++;
			}
		}

		System.out.println("整个排序交互了---" + ccount + "次");*/
		BubbleSort(a);
		//SortUntils.BubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//研究一下：快速排序，希尔排序，归并排序,选择排序--研究-如果实在是看不明白先放一下。
				//算法一般应用于：大数据的处理，数据查找，游戏开发中。
				//寻路算法(勾股定理)，背包算法，螺纹算法()--游戏开发中
				//sortMaoP
		
		
	}
	/**
	 * 
	 * 冒泡排序的方法
	 * Eight 
	 * 方法名：BubbleSort
	 * 创建人：maerhuan 
	 * 时间：2016年3月28日-下午11:04:11 
	 * @param array
	 * @return int[]
	 * @exception 
	 * @since  1.0.0
	 */
	public static  int[] BubbleSort( int[] array){
		for (int i = 0; i < array.length; i++) {
			boolean mark = true;
			for (int j =0; j< array.length-1-i;j++) {
				if (array[j] < array[j + 1]) {//升序降序通过控制<	>实现
					int temp = array[j];// 20
					array[j] = array[j + 1];// 20 15
					array[j + 1] = temp;
					mark = false;
				}
			}
			if(mark==true) break;
		}
		return array;
	}

}
