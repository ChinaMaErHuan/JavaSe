package stack_erhuan;
public class StackDemoTest {
	/**
	 * 
	 * 十进制转二进制
	 * stack_erhuan 
	 * 方法名：toJinzhi
	 * 创建人：maerhuan 
	 * 时间：2016年4月23日-下午7:06:25 
	 * @param num
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	public static String toJinzhi(int num){
		Stack_erhuan stack = new Stack_erhuan(32);
		while(num>0){
			stack.push(num%2);
			num = num/2;
		}
		StringBuffer buffer= new StringBuffer();
		while (!stack.isEmpty()) {
			buffer.append(stack.pop());
		}
		return buffer.toString();
	}
	/**
	 * 
	 * (这里用一句话描述这个方法的作用)
	 * stack_erhuan 
	 * 方法名：main
	 * 创建人：maerhuan 
	 * 时间：2016年4月23日-下午7:09:48 
	 * @param args void
	 * @exception 
	 * @since  1.0.0
	 */
	//通用禁止转换方法
		public static String baseConvert(int num,int base){
			Stack_erhuan stack=new Stack_erhuan(32);
			while(num>0){
				stack.push(num%base);
				num=num/base;
			}
			//1010
			String digts = "0123456789abcdef";
			String result = "";
			while (!stack.isEmpty()) {
				result +=String.valueOf(digts.charAt((int)stack.pop()));
			}
			return result;
		}
	
	public static void main(String[] args) {
		//Stack_erhuan stack_erhuan = new Stack_erhuan(1000);
		
		System.out.println(toJinzhi(1000));
		
		
		System.out.println(baseConvert(1000, 2));
		System.out.println(baseConvert(1000, 10));
		System.out.println(baseConvert(1000, 16));
		System.out.println(Integer.toString(1000, 16));
	}
}
