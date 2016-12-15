package class_5_yunsuanfu;
public class MoneyUtil {

	
	/**
	 * 把传入的数转换为中文金额大写形式
	 * @param flag int 标志位，1 表示转换整数部分，0 表示转换小数部分
	 * @param s String 要转换的字符串
	 * @return 转换好的带单位的中文金额大写形式
	 */
	private static String numFormat(int flag, String s) {
		int sLength = s.length();
		// 货币大写形式
		String bigLetter[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
		// 货币单位
		String unit[] = {"元", "拾", "佰", "仟", "万", 
				// 拾万位到仟万位
				"拾", "佰", "仟",
				// 亿位到万亿位
				"亿", "拾", "佰", "仟", "万"};
		String small[] = {"分", "角"};
		// 用来存放转换后的新字符串
		String newS = "";
		// 逐位替换为中文大写形式
		for(int i = 0; i < sLength; i ++) {
			if(flag == 1) {
				// 转换整数部分为中文大写形式（带单位）
				newS = newS + bigLetter[s.charAt(i) - 48] + unit[sLength - i - 1];
			} else if(flag == 2) {
				// 转换小数部分（带单位）
				newS = newS + bigLetter[s.charAt(i) - 48] + small[sLength - i - 1];
			}
		}
		return newS;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(toHanStr("604025"));
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
			System.out.println();
			
		}
	}
}