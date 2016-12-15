package class_27_fanxing;


public class ReflectUtil<T> {
	
	
	/*
	 * 泛型类：输入对象本身的东西。，不能够修饰到静态成员
	 * 泛型方法：作用域静态方法身上。
	 * 
	 **/
	
	public T getObject(Class clz){
		try {
			return (T)clz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		
		User user =  new ReflectUtil<User>().getObject(User.class);
		System.out.println(user);
	}
}