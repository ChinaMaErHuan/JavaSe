package class_6_string;
/**
 * 
 * 
 * ForDemo4
 * 创建人:maerhuan 
 * 时间：2016年3月26日-下午7:17:56 
 * @version 1.0.0
 *
 */


		// 生成setter和getter 点击代码块 右键 source-->generate getters and setters 或者alt +shift + s
		// 代码整理 ctrl+shift+f
		// 代码注释ctrl+shift+/
		// 单行注释 ctrl+shift+c
		// 修改类的名字 和 包的名字 jsp的名字 f2
		//快速复制 ctrl+alt+向上/下键 
		//代码一行的移动alt+向上向下键
public class ForDemo4 {
	public static void main(String[] args) {
		//循环---循环是服务于数组的
		int a[] = {1,2,3,4,5,645,4564,445,646};
		int len = a.length;
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]+"是int类型");
		}
		
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
		}
		//理解循环 for
				/*格式:
					 for(初始值1;逻辑判断2;自增变量3){
						//循环体 4
					 }
					 第1次循环完毕以后===1--->2---4---3
					 第2次循环：2 --- 4 ---3
					 第3次循环：2 --- 4 ---3
					 第4次循环：2 --- 4 ---3
					循环结束取决于 2是true还是false 如果是false就结束，
					 
				 */
		String[] classrooms = {"小白","stone","小老鼠","老实","小辰","the end"};//vicky
		for(int i=0;i<classrooms.length;i++){//1...10会打印吗？ no 1--9
			playGame(classrooms[i]);
		}
	}
	/**
	 * 来yy教室听课---方法
	 */
	public static void listenClass(String name){
		System.out.println(name+"同学在yy6359听keke老师讲课javase课程");
	}

	/**
	 * 来yy教室听课---方法
	 */
	public static void playGame(String name){
		System.out.println(name+"同学在yy6359听keke老师讲课完游戏去");
	}
}
