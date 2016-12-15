package class_32_chario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjIoCreate {
	public static void main(String[] args) throws IOException {
		/**
		 * ��java�д�������ķ�ʽ������:
		 * 1.new
		 * 2.����
		 * 3.io implements Serializable ���Խ���������ı��ı��ļ���
		 * 4.clone() implements Cloneable
		 * 5.Object��չ
		 */
			//������ʱ�ļ�
			File file=  File.createTempFile("object",null);
		
		try (
				//FileOutputStream oStream = new FileOutputStream("F:/object.txt");
				FileOutputStream oStream = new FileOutputStream(file);
				ObjectOutputStream oStream2 = new ObjectOutputStream(oStream);
			){
			
			User user = new User();
			user.setId(123);
			user.setUsername("maerhuan");
			user.setBank(56478);
			oStream2.writeObject(user);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try(
			//ObjectInputStream iStream = new ObjectInputStream(new FileInputStream("F:/object.txt"));
			ObjectInputStream iStream = new ObjectInputStream(new FileInputStream(file));
				
			) {
			User user2 = (User) iStream.readObject();
			System.out.println(user2.getUsername());
			System.out.println(user2.getId());
			System.out.println(user2.getBank());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
