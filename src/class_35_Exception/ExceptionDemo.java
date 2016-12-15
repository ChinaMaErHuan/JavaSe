package class_35_Exception;


/** 
 * ExceptionDemo</br>
 * ������:maerhuan </br>
 * ʱ�䣺2016��6��2��-����12:11:28 </br>
 * @version 1.0.0
 *
 */
public class ExceptionDemo {
	/**�쳣�����ҵ���߼�--������
	 * 
	 * Checked Exception--�ڱ���׶�jvm���Ѿ�ȷ��һ��������쳣--IOException,SQLException
	 * ����Ԥ����֢
	 * 
	 * 
	 * unchecked Exception(RuntimeException) --NullPointerException
	 * ���ܻ��У�����Ҳû��(���Բ���)---�������������jvm���Զ��쳣�������
	 * 
	 * �쳣:�ó��򿪷��ߣ����·������������ֵĲ�֢���ó�������ø��ӽ�׳���Լ�
	 * �ó������������׿����Ҵ������Ϣ�����ݵ����� 
	 * 
	 * Error:һ����ָjvm��صĴ��󣬱���ϵͳ���������������ջ�������̬����ʧ�ܵ����ִ����ǳ���ɿأ����ִ���Ҳ�޷��ָ��Ͳ�����ȥ����Ĵ�����˳�����벻��ͨ��
	 * try/catch���в���
	 * */
	public static String test(){
		try {
			User  user = new User();
			user.setUsername("keke");
			System.out.println(user.getUsername());
			return "success";
		} catch (NullPointerException e) {
			e.printStackTrace();
			return "null";
		}
	}
	
	public static void main(String[] args) {
		String teString = test();
		if(teString == "null"){
			System.out.println("�ն���");
		}
	}
	
}
