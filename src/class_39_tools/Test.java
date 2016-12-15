package class_39_tools;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;


public class Test {

	
	//���ʻ�---���ݲ���ϵͳ���Խ��������л�������Ӣ��--Ӣ��չʾ���й�--����չʾ
	
	/*
	 * 1:���������--���ʻ�����
	 * b:java.util.ResourceBundle :���ڼ��ع��ң����Ե���Դ��
	 * a:java.util.Locale  ��װ�ض��Ĺ���/�������Ի���
	 * c:java.util.MessageFormat  ��ʽ����ռλ�����滻
	 * 
	 * 
	 * δ��struts2 spring�п�ܶ��������ʻ������⣬���������Ƕ����������ķ�װ��
	 * ���뻹�й��ʻ�����Դ�ļ�����ʽ���¼��֣�
	 * 
	 * 1:baseName_language_country.properties
	 * 2:baseName_language.properties
	 * 3:baseName.properties
	 * 
	 * baseName����Դ�ļ������ƣ��û����������趨����language��country�������������趨��
	 * ���磺message_zh_CN.properties
	 * 	    message_en_US.properties
	 * 
	 * */
	
	public void parseMessage(Locale locale){
		ResourceBundle resourceBundle = ResourceBundle.getBundle(this.getClass().getPackage().getName()+".message", locale);
		//��ȡֵ
		String username = resourceBundle.getString("username");
		String password = resourceBundle.getString("password");
//		System.out.println(username);
//		System.out.println(password);
		
		String newUsername = MessageFormat.format(username, "keke","���鲻��!!!");
		System.out.println(newUsername);
		
	}
	
	
	public static void main(String[] args) {
//		System.out.println(Locale.CANADA);
//		System.out.println(Locale.CHINA);
//		System.out.println(Locale.CHINESE);
		
//		Locale[] locales =Locale.getAvailableLocales();
//		for (Locale locale : locales) {
//			System.out.println(locale.getLanguage()+"=="+locale.getCountry()+"==="+locale.getDisplayCountry());
//		}
		
		//��ȡ��ǰ�����Ĺ��Һ����Ի���
		Locale locale =  Locale.getDefault();
		System.out.println(locale.getLanguage()+"=="+locale.getCountry()+"==="+locale.getDisplayCountry());
		
		 new Test().parseMessage(Locale.ENGLISH);//en
//		 new Test().parseMessage(Locale.US);//en_US
//		 new Test().parseMessage(Locale.CHINA);//zh_CN
//		
		String template = "����{0}������{1}�꣬����ס��{2}";
		String templates = MessageFormat.format(template, "keke",30,"���ϳ�ɳ");
		System.out.println(templates);
	}
	
	
	
}