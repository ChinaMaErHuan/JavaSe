package class_9_mianshi;

/**
 * 杨辉三角形
 * 创建人:maerhuan 
 * 时间：2016年4月1日-下午10:27:30 
 * @version 1.0.0
 * 数组题目---杨辉三角
 * 1  [1]	 
 * 1 1	[2]		
 * 1 2 1 [3]
 * 1 3 3 1 [4]
 * 1 4 6 4 1 [5]
 * 1j=0 5j=1 10j=2 10 j=3 5 1 [6]  i=5
 * 1j=0 6j=1 15j=2 20 15 6 1 [7] 推一行 i=6
 * 
 * 杨辉三角 : 两侧是1 中间的内容是由元素的正上方的数值与左上方的数值相加
 * */
public class YangHui {
	public static void main(String[] args) {
		getYanhuiTriangle(8);
	}
	public static int[][] getYanhuiTriangle(int len){
		int [][] nums = new int[len][];
		for(int i =0;i<len;i++){
			nums[i] = new int[i+1];//开辟空间地址--数组不理解,循环给每个数组赋值,数组长度都不固定的，
			for(int j = 0;j<nums[i].length -1;j++){
				if(i == 0 || j ==0 || j==nums[i].length -1){//值是1的情况
					nums[i][j] = 1;
				}else{
					nums[i][j] = nums[i-1][j-1] + nums[i-1][j];	
				}
				System.out.print(nums[i][j]+"\t");	
			}
			System.out.println(" ");	
		}
		return nums;
	}
}
