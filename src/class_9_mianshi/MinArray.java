package class_9_mianshi;
/**
 * 
 * 
 * MinArray
 * 创建人:maerhuan 
 * 时间：2016年4月2日-下午7:24:21 
 * @version 1.0.0
 *
 */
public class MinArray {
	public static void main(String[] args) {
		int []arr = RandomArray.RandomArray(20, 100);
		int num= arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			//if(num > arr[i]){ //最小值
				if(num < arr[i]){//最大值
					num=arr[i];
					index=i;
				}
			//}
		}
		System.out.println("最大值"+num+"==="+"索引是"+index);
	}
	
}
