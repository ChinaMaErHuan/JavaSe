package class_26_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectUtilClass {
	public static void main(String[] args) {
		/**
		 * 在类中： 成员变量 构造函数 方法 内部类 代码块
		 */
		/**
		 * 反射操作:----内部还是用对象的 第一步:拿到当前类的Class对象 第二步：实例对象
		 * 第三步：开始动态解析class文件中的构造函数，成员变量，成员方法，内部类 (注解和参数)
		 * 
		 */
		// 拿到class对象的三种方式:
		// Class class1 = User.class;
		// Class.forName(className)
		// 拘役对象.getClass()

		// class对象

		// 第一步：拿到当前类的class对象
		
		try {
			Class clz = Class.forName("class_26_reflect.User");
			// 实例化对象 1
			Object obj = clz.newInstance();
			// 解析构造函数 Declared 代表忽略访问修饰符, 如果不加的只能访问public修饰的成员属性(变量和方法)
			// Constructor[] constructors =
			// clz.getConstructors();//只能访问public修饰的构造函数
			Constructor[] constructors = clz.getDeclaredConstructors();// 忽略访问修饰符的构造函数
			// System.out.println("构造函数的个数是:===="+constructors.length);
			for (Constructor constructor : constructors) {
				System.out.println("构造函数的名称" + constructor.getName());
				System.out.println("访问修饰符:" + constructor.getModifiers());
				System.out.println("构造函数中参数的个数:"
						+ constructor.getParameterCount());
				Class[] types = constructor.getParameterTypes();
				for (Class class1 : types) {
					System.out.print(class1.getName() + "\t");
				}
				System.out.println("======================");
			}

			// 获取当个的情况 ---spring构造函数注入
			// 实例化对象 2
			Constructor constructor = clz.getDeclaredConstructor();
			Object object = constructor.newInstance();
			System.out.println("1=========" + object);

			Constructor constructor2 = clz.getDeclaredConstructor(
					Integer.class, String.class, Float.class, String[].class,
					Long.class);
			String[] names = { "keke", "xiaobai" };
			Object object2 = constructor2.newInstance(1, "keke", 21.5f, names,
					1L);
			System.out.println("2==========>" + object2);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {

			e.printStackTrace();
		}

	}
}
