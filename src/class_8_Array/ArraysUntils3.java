package class_8_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;


/**
 * 
 * 
 * ArraysUntils2 创建人:maerhuan 时间：2016年3月30日-上午12:47:16
 * 
 * @version 1.0.0
 * 
 */
public class ArraysUntils3 {
	public static  <T> void main(String[] args) {
		// 数组是非常常用的形式
		Integer[] ages = { 0, 96, 51, 28, 21, 35, 16, 82, 44, 20, 59, 61, 50,
				79, 75, 55, 66, 78, 18, 51, 71, 28, 61, 91, 35, 90, 2, 80, 81,
				42, 36, 66, 61, 46, 89, 68, 15, 90, 29, 32, 70, 94, 32, 96, 25,
				66, 57, 4, 66, 69, 10, 15, 75, 96, 10, 67, 94, 12, 50, 58, 26,
				3, 50, 51, 12, 27, 7, 58, 13, 63, 99, 73, 57, 55, 82, 51, 24,
				13, 90, 40, 1, 4, 39, 30, 83, 32, 41, 86, 25, 44, 81, 73, 42,
				75, 90, 85, 33, 42, 64, 39, 13 };
		
		List<Integer> aList = Arrays.asList(ages);
		Collections.sort(aList, new ObjectComparator(true));
		for (Integer integer : aList) {
			System.out.println(integer);
		}
		System.out.println("==========");
		Float[] scores={0f,96.5f,51.2f,28f,32.10f,32.21f,32.1f};
		List<Float> aList2 = Arrays.asList(scores);
		Collections.sort(aList2, new ObjectComparator(true,2));
		for (Float float1 : aList2) {
			System.out.println(float1);
		}
		//System.out.println(Math.pow(10, 4)
		List<Date> dates = new ArrayList<>();
		dates.add(new Date(2016,3,24));
		dates.add(new Date(2016,3,23));
		dates.add(new Date(2016,3,25));
		dates.add(new Date(2016,4,21));
		dates.add(new Date(2016,4,24));
		dates.add(new Date(2015,4,24));
		Collections.sort(dates,new ObjectComparator(true));
		for (Date date : dates) {
			System.out.println(date.getYear()+"=="+(date.getMonth())+"==="+date.getDate());
		}
	}
}
