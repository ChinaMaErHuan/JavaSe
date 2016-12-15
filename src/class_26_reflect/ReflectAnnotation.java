package class_26_reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectAnnotation {
	public static void main(String[] args) {
		try {
			Class clz = Class.forName("class_26_reflect.User");
			Object  o = clz.newInstance();
			//获取类上的注解
			KeKeMapping annotation = (KeKeMapping) clz.getAnnotation(KeKeMapping.class);
			System.out.println(annotation.desc());
			
			//构造函数
			Constructor[] constructors = clz.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				KeKeMapping can = (KeKeMapping) constructor.getAnnotation(KeKeMapping.class);
				if(can!=null){
					System.out.println(can.desc());
				}
			}
			//方法的
			Method[] methods = clz.getDeclaredMethods();
			for (Method method : methods) {
				KeKeMapping can = (KeKeMapping) method.getAnnotation(KeKeMapping.class);
				if(can!=null){
					System.out.println(can.desc()+"=="+can.def()+"=="+can.value());
				}
				
				Parameter[] p = method.getParameters();
				for (Parameter parameter : p) {
					Annotation[] annotations = parameter.getAnnotations();
					for (Annotation annotation2 : annotations) {
						KeKeMapping canc = (KeKeMapping)annotation2;
						if(canc!=null){
							System.out.println(method.getName()+"==="+canc.value());
						}
					}
					
				}
				
				
				Annotation[][] annotations = method.getParameterAnnotations();
				for (Annotation[] annotations2 : annotations) {
					for (Annotation annotation2 : annotations2) {
						KeKeMapping canc = (KeKeMapping)annotation2;
						if(canc!=null){
							System.out.println(method.getName()+"==="+canc.value());
						}
					}
					
				}
				
				
				
			}
			//属性的
			//成员变量
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				KeKeMapping can = (KeKeMapping) field.getAnnotation(KeKeMapping.class);
				if(can!=null){
					System.out.println(can.desc()+"=="+can.def()+"=="+can.value());
				}
			}
			
			Field field = clz.getDeclaredField("username");
			KeKeMapping keKeMapping = field.getAnnotation(KeKeMapping.class);
			System.out.println(keKeMapping.desc());
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			
			e.printStackTrace();
		} catch (SecurityException e) {
			
			e.printStackTrace();
		}
	}
}
