package class_6_string;
/**
 * 
 * 
 * ForDemo
 * 创建人:maerhuan 
 * 时间：2016年3月26日-上午12:57:14 
 * @version 1.0.0
 *
 */
public class ForDemo {
	public static void main(String[] args) {
		//循环和数组----char[]  数组
		
		//容器--装很多东西的一种
		//数组----容器--具体的一种数据类型的容器而已
		//数组的定义有两种---静态定义和动态定义
		//静态初始化
		//初始化时有程序员显示的每个数组元素的初始值，由系统决定数组的长度
		//String name[] = {"小白","stone","小老鼠","老实","小辰","the end"};
		String[] names01 = new String[]{"小白","stone","小老鼠","老实","小辰","the end"};
		System.out.println(names01[1]);
		System.out.println(names01[names01.length-1]);
		
		
		
		//动态初始化
		//初始化的时候程序员决定数组的长度，由系统为数组元素分配初始值
		int arr[] = new int[10];
		//arr[10] = 9;s数组越界
		System.out.println(arr[0]);//默认值是0
		
		//数组的形式
		//基础数据类型:byte short int long float double boolean char如果空间足够的，没有填满的空间就是默认值
		//封装数据类型的数组: Byte Short Integer Long Float Double Boolean Character 没有填满的空间都是null
		//对象数组 Person[] User[] String[] 如果空间足够，他们默认都是null
		int a1 = 5;
		int a2 = 6;
		int a3 = 7;
		int a4 = 8;
		int arr2[] = {a1,a2,a3,a4};
		Integer arr3[] = {a1,a2,a3,a4};
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		//java中的数组是静态的，一旦数组初始化完成，数组的内存空间分配就结束了，程序只能改变数组的值，不能改变数组的长度
		//数组对象就是保存在堆内存中的内存空间地址，对数组执行初始化，其实并不是对数组变量执行初始化，而是在堆内存中创建数组对象
		
		//1:数组：是一个封装数据类型
		//2:数组长度：.length
		//3:数组在如果一定定义，长度固定。就说不能动态添加元素，删除元素，只能修改现有索引位置对应的元素.
	}
}
