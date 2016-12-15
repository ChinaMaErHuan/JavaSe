package class_31_io_file;

import java.io.File;
import java.text.ParseException;
import java.util.Date;

import toolsUtils.StringUtils.MehStringUtil;

public class FileDemo3 {
	public static void main(String[] args) throws ParseException {
		// Ŀ¼
		File directroy = new File("F:/Program Files");// Ŀ¼���255����
		// Ŀ¼�ĸ�����Ϣ
		print("Ŀ¼������޸�ʱ��:" + directroy.lastModified());
		print("Ŀ¼������޸�ʱ��:"
				+ MehStringUtil.dateToString(new Date(directroy.lastModified()),
						"yyyy/MM/dd HH:mm"));
		print("���·��" + directroy.getPath());
		print("���ش˳���·����ָ���ķ�����δ������ֽ���" + directroy.getFreeSpace());
		print("���ش˳���·����ָ���ķ����С��" + directroy.getTotalSpace());
		print("���ش˳���·����ָ���ķ����Ͽ����ڴ��������ֽ���" + directroy.getUsableSpace());
		print("���ش˳���·����ľ��·������ʽ��" + directroy.getAbsoluteFile());
		print("���ش˳���·����ľ��·�����ַ�" + directroy.getAbsolutePath());
		print("���ش˳���·����Ŀ¼�ĳ���·��������·����û��ָ����Ŀ¼���򷵻� null"
				+ directroy.getParentFile());
		print("���ش˳���·����Ŀ¼��·�����ַ�����·����û��ָ����Ŀ¼���򷵻� null"
				+ directroy.getParent());
		print("" + directroy.getClass());

		// Ŀ¼�Ĵ���
		if (!directroy.exists()) {
			// directory.mkdir();//������Ŀ¼
			directroy.mkdirs();// �����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��
		}
	}

	private static void print(String message) {
		System.out.println(message);
	}
}
