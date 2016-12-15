package toolsUtils;


import java.util.HashSet;
import java.util.Random;


public class RandomArrayUtil {
	/**
	 * 
	 * 产生不重复的随机数组
	 * toolsUtils 
	 * 方法名：getRandomArray
	 * 创建人：maerhuan 
	 * 时间：2016年4月15日-下午10:24:54 
	 * @param size
	 * @param rangeNum
	 * @return Integer[]
	 * @exception 
	 * @since  1.0.0
	 */
	public static Integer[] getRandomArray(int size,int rangeNum){
		
		//TreeSet<Integer> set = new TreeSet<>();
		HashSet<Integer> set = new HashSet<>();
		Random random = new Random();
		int i = 0;
		while (i<size) {
			boolean flag = set.add(random.nextInt(rangeNum)+1);
			if (flag) {
				i++;
			}
		}
		Integer[] nums2 = new Integer[size];
		set.toArray(nums2);//集合转成数组
		return nums2;
		
	}
	
	
	
	public static void main(String[] args) {
		Integer[] nums3 = getRandomArray(100,1000);
		for (Integer integer : nums3) {
			System.out.println(integer);
		}
		
		
	}
}
