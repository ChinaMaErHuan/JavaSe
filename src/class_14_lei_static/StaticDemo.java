package class_14_lei_static;
/**
 * 
 * 
 * StaticDemo
 * ������:maerhuan 
 * ʱ�䣺2016��4��24��-����4:09:56 
 * @version 1.0.0
 *
 */
public class StaticDemo {
	private static int age=10;
	private int num = 20; 
	
	public static void getAge(){
		
		System.out.println(StaticDemo.age);
	}
	public void getAge2(){
		System.out.println(StaticDemo.age);
		System.out.println(this.num);
	}
	//�������η���spuer һ��Ҫ�м̳еĹ�ϵ�²������塣
	
	/*
	 * ���Ժͷ���
	 *  
	 * �������η�[private publie protected ȱʡ��]   ���δ�(static ,final ,transient,volatile)   ��������  = ����ֵ
	 * 
	 * �������η�   ���δ�   ��������  = ����ֵ
	 *  
	 * ��һ�����У�
	 * ���Ժͷ������ַ�Ϊ�������
	 * 
	 * 	��̬��Ա�ͷǾ�̬��Ա
	 * static�ǲ������������ξֲ�������static����new����Ϳ���ʹ���� ��Ϊ�˷���ĵ���  static���Է��� �����Ե���
	 * �Ǿ�̬��   ��static���εĶ���ֻ����һ�� ���ᱻ����
	 * 
	 *  ��̬��Ա������---�౾���,�����ڶ���=--�������Ժͷ���
	 *  ��̬��Աһ��Ҫ��̬������ʹ��
	 *  
	 *  �ܽ᣺
	 *  �Ǿ�̬�������ɵ��þ�̬��Ա��Ҳ���Ե��÷Ǿ�̬Ԫ��
	 *  ��̬������ֻ�ܸ�����þ�̬��Ա
	 *  
	 *  ��̬�������������ǳɷǾ�̬����
	 *  
	 * */
	public static void main(String[] args) {
		StaticDemo.getAge();
		System.out.println(age);
		
	}
}
