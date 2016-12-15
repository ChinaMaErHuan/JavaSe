package class_9_mianshi;

import java.util.Random;

public class RandomArray {
	public static int[] RandomArray(int len,int radix){
		Random random = new Random();
		int [] nums = new int[len];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=random.nextInt(radix);
		}
		return nums;
	}
}
