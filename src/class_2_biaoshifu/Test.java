package class_2_biaoshifu;

/**
 * tzdeskϵͳƽ̨
 * Tz_JavaSe
 * 
 * Test.java
 * ������:xuchengfei 
 * ʱ�䣺2016��3��11��-����12:53:32 
 * 2016̶�ݽ�����˾-��Ȩ����
 */

/**
 * 
 * Test
 * ������:maerhuan
 * ʱ�䣺2016��3��11��-����12:53:32 
 * @version 1.0.0
 * 
 */
public class Test {

	public static void main(String[] args) {
		//����ʲô����ת��ʮ����
//		System.out.println(Integer.parseInt("013", 8));
//		System.out.println(Integer.parseInt("ff", 16));
//		System.out.println(Integer.parseInt("ffff", 16));
//		System.out.println(Integer.parseInt("1010", 2));
//		
//		System.out.println("====ʮ����ת��������");
//		String c = Integer.toString(110, 2);//ʮ����ת������
//		String c2 = Integer.toString(120, 8);//ʮ����ת�˽���
//		String c3 = Integer.toString(130, 16);//ʮ����תʮ������
//		String c4 = Integer.toString(140, 10);
//		System.out.println(c);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
		
		
//		int b = Integer.parseInt("013",8);//ʮ����
//		String c = Integer.toString(b, 16);
//		System.out.println(c);
		
//		System.out.println(eto16("013"));
//		System.out.println(eto162("0xab897"));
		
		int ccc = 0B101010110;
		float c = 3.14_787_878_787f;
		System.out.println(ccc);
		
		String b = "1010111";
		System.out.println("������תʮ������==="+eto165(b));
		System.out.println("ʮ������ת������==="+eto163(eto165(b)));
		System.out.println("������ת�˽���==="+eto166(b));
		System.out.println("�˽���ת������==="+eto162(eto166(b)));
		System.out.println("�˽���תʮ������==="+eto16(eto166(b)));
		
	}
	
	
	//������תʮ������
	public static String eto165(String b){
		int bc = Integer.parseInt(b,2);
		//ʮ����----parseInt(�������֣�radix);//radix���߽��������ǽ���----ת�ɣ�ʮ����
		//Integer.parseInt(�������֣�radix)===��ĳһ�ֽ���ת����ʮ����
		String c = Integer.toString(bc, 16);
		return c;
	}
	
	//������ת�˽���
	public static String eto166(String b){
		int bc = Integer.parseInt(b,2);
		//ʮ����----parseInt(�������֣�radix);//radix���߽��������ǽ���----ת�ɣ�ʮ����
		//Integer.parseInt(�������֣�radix)===��ĳһ�ֽ���ת����ʮ����
		String c = Integer.toString(bc, 8);
		return c;
	}
	
	//�˽���תʮ������
	public static String eto16(String b){
		int bc = Integer.parseInt(b,8);//ʮ����
		String c = Integer.toString(bc, 16);
		return c;
	}
	
	//�˽���ת������
	public static String eto162(String b){
		int bc = Integer.parseInt(b,8);//ʮ����
		String c = Integer.toString(bc, 2);
		return c;
	}
	
	//ʮ������ת������
	public static String eto163(String b){
		int bc = Integer.parseInt(b,16);
		//ʮ����----parseInt(�������֣�radix);//radix���߽��������ǽ���----ת�ɣ�ʮ����
		//Integer.parseInt(�������֣�radix)===��ĳһ�ֽ���ת����ʮ����
		String c = Integer.toString(bc, 2);
		return c;
	}
	
	
	//ʮ������ת10����
	public static String eto164(String b){
		int bc = Integer.parseInt(b,16);//ʮ����
		return bc+"";
	}
}

