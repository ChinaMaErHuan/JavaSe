package class_3_case;
public class Char02 {

	public static void main(String[] args) {
		
		//char��string��ʲô��ϵ
		//���������������û���ַ�:byte short int long float double boolean char
		char wo = 's';
		char ai = 's';
		char ni = 's';
		//jdk--�ַ�ר�Ŷ��ֲ����ַ�����⡣�ַ�ֻ������һ�����ĵ��ַ�����.
		
		//String,����������������ͣ���һ���ࡣ
		String str= "�Ұ���";
		console(str);//���÷�����̣���ʵ�͸���jvm��ȥѰ����û���������������о�֪ͨcpuȥ���㷽��������Ĵ������ݡ�
		char c = str.charAt(0);
		char c1 = str.charAt(1);
		char c2 = str.charAt(2);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
	}
	
	/**
	 * ��ӡ����
	 * Administrator
	 * com.tz.java03 
	 * ������console
	 * �����ˣ�xuchengfei 
	 * @param message void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void console(Object message){
		System.out.println(message);
	}
}