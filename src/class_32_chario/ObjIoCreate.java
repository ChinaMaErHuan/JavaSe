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
		 * 在java中创建对象的方式有五种:
		 * 1.new
		 * 2.反射
		 * 3.io implements Serializable 可以将对象存在文本文本文件中
		 * 4.clone() implements Cloneable
		 * 5.Object扩展
		 */
			//创建临时文件
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
