package class_3_case;
/**
 * 
 * 
 * Char01
 * ������:maerhuan 
 * ʱ�䣺2016��3��13��-����9:04:48 
 * @version 1.0.0
 * 
 */

public class Char01 {

	public static void main(String[] args) {
		
		char c = 'A';// unicode  A-Z a-z 0-9 ����ţ��ո񣬻س��ȵȣ�����ռ��һ���ַ�
		char d ='d';//2���ֽ�
		char c1 = '1';//49
		char c2= '0';//48
//		System.out.println(c);
		System.out.println(d);
		System.out.println(c1+""+c2);
		System.out.println(c1+c2);
		
		
		//char��int֮���ǿ��Ի���ת��---������ascii����л�ȡ����
		//0 48   A65   a97
		
		//�Զ�����ת��,�õ��ַ����ʵ��ascii���ʮ����
		int num = c1;
		System.out.println(num);
		//ǿ������ת�����õ�ascii��ֵ
		int k = 49;
		char kk =(char)k;
		System.out.println(kk);
		
	}
}
