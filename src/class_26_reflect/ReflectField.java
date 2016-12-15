package class_26_reflect;
public class ReflectField {
	public static void main(String[] args) {
		
			//第一步：拿到当前类的class对象
			Class clz;
			try {
				clz = Class.forName("class_26_reflect.User");
				//实例化对象  1
				Object obj = clz.newInstance();
				
				Class[] classes = clz.getDeclaredClasses();
				for (Class class1 : classes) {
					System.out.println(class1.getName());
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (InstantiationException e) {
				
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			}
			
		
	}
}
