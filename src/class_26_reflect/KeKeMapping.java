package class_26_reflect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Documented/*如果通过java的doc工具*/
@Retention(value = RetentionPolicy.RUNTIME)
@Target({
	ElementType.FIELD,
	ElementType.METHOD,
	ElementType.CONSTRUCTOR,
	ElementType.PACKAGE,//包
	ElementType.TYPE,//类  接口 枚举 上生效
	ElementType.PARAMETER
	/*约束注解的*/
	
})
public @interface  KeKeMapping {
	/*类 构造函数 方法 属性 */
	String value() default "";
	String desc() default "";
	String def() default "";
}
