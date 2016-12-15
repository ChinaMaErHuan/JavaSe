package class_5_yunsuanfu;



/**
 * 
 * 
 * Op8 创建人:maerhuan 时间：2016年3月24日-下午1:16:43
 * 
 * @version 1.0.0
 * 
 */
public class Op8 {
	public static void main(String[] args) {

		// switch ... case 选择的分支语句.条件选择
		/* 关于枚举 class_30_enum下面有具体的例子
		 * 语法格式：表达式:int,short ,char,枚举, byte jdk1.7以后也支持了string switch(表达式){
		 * case 值1: 代码块;break; case 值2: 代码块;break; case 值3: 代码块;break; case 值4:
		 * 代码块;break; case 值5: 代码块;break; case 值6: 代码块;break; default:
		 * 代码块;break; }
		 */
		char score = 'A';
		switch (score) {
		case 'A': {
			System.out.println("优秀");
			break;
		}
		case 'B': {
			System.out.println("良好");
			break;
		}
		case 'C': {
			System.out.println("中等");
			break;
		}
		case 'D': {
			System.out.println("及格");
			break;

		}
		default: {
			System.out.println("不及格");
			break;

		}
		}
		int score2 = 98;
		switch (score2) {
		case 100: {
			System.out.println("优秀");
			break;
		}
		case 90: {
			System.out.println("良好");
			break;
		}
		case 80: {
			System.out.println("良");
			break;
		}
		case 70: {
			System.out.println("中等");
			break;
		}

		default: {
			System.out.println("不及格");
			break;
			}
		}
		String name="php";
		String result = null;
		switch (name) {
			case "java":
				result = "Java是一个非常古老的语言";
				break;
			case "php":
				result = "php是一个非常古老的语言";
				break;
			case "xiaobai":
				System.out.println("我喊的是小白吗.come on!!!");
				break;
			default:
				System.out.println("浮云");
				break;
		}
		
		System.out.println(result);

	}
}
