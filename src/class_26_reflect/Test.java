package class_26_reflect;
public class Test {
	public static void main(String[] args) {
		try {
			Class class1 = Class.forName("class_26_reflect.User");
			Object o=ReflectUtil2.getObject(class1);
			System.out.println(o);
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
