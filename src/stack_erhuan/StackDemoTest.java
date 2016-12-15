package stack_erhuan;
public class StackDemoTest {
	/**
	 * 
	 * ʮ����ת������
	 * stack_erhuan 
	 * ��������toJinzhi
	 * �����ˣ�maerhuan 
	 * ʱ�䣺2016��4��23��-����7:06:25 
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
	 * (������һ�仰�����������������)
	 * stack_erhuan 
	 * ��������main
	 * �����ˣ�maerhuan 
	 * ʱ�䣺2016��4��23��-����7:09:48 
	 * @param args void
	 * @exception 
	 * @since  1.0.0
	 */
	//ͨ�ý�ֹת������
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
