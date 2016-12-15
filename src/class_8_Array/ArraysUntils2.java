package class_8_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * 
 * ArraysUntils2 创建人:maerhuan 时间：2016年3月30日-上午12:47:16
 * 
 * @version 1.0.0
 * 
 */
public class ArraysUntils2 {
	public static void main(String[] args) {
		// 数组是非常常用的形式
		Integer[] ages = { 0, 96, 51, 28, 21, 35, 16, 82, 44, 20, 59, 61, 50,
				79, 75, 55, 66, 78, 18, 51, 71, 28, 61, 91, 35, 90, 2, 80, 81,
				42, 36, 66, 61, 46, 89, 68, 15, 90, 29, 32, 70, 94, 32, 96, 25,
				66, 57, 4, 66, 69, 10, 15, 75, 96, 10, 67, 94, 12, 50, 58, 26,
				3, 50, 51, 12, 27, 7, 58, 13, 63, 99, 73, 57, 55, 82, 51, 24,
				13, 90, 40, 1, 4, 39, 30, 83, 32, 41, 86, 25, 44, 81, 73, 42,
				75, 90, 85, 33, 42, 64, 39, 13 };
		// 工具类:Arrays
		// 数组本身是没有提供，相关的操作,jdk提供一个专门操作的工具 Arrays
		List<Integer> a = Arrays.asList(ages);
		/**
		 * for(s数据类型:变量或数组)
		 */
		// for (Integer aa : a) {
		// System.out.print(aa + "\t");
		// }
		// Collections.sort(a);// 这种排序默认是升序的
		Collections.sort(a, new IntegerComparator(false));// 用到了IntegerComparator

		for (Integer aaa : a) {
			System.out.println(aaa + "\t");
		}

		/**
		 * final boolean mark = false;//减少内存垃圾的产生 //这种，内部类---匿名内部类--一个没子类--自己实现
		 * Collections.sort(a, new Comparator<Integer>() {//排序器
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { return
		 *           mark?o1-o2:o2-o1; } });
		 */
		Collections.sort(a, new IntegerComparator(true));// 用到了IntegerComparator

		for (Integer haha : a) {
			System.out.print(haha + "\t");
		}

	}
}
