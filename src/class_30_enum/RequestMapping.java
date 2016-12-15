package class_30_enum;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target({
	ElementType.FIELD,//属性
	ElementType.METHOD,//方法
	ElementType.CONSTRUCTOR,//构造函数
	ElementType.PACKAGE,//包
	ElementType.PARAMETER,//参数
	ElementType.TYPE//类 接口 枚举类上生效
	//约束注解
})

public @interface RequestMapping {
	/*类 构造函数 方法 属性 */
	//八种数据类型 数组 枚举 String
	String [] value() default "";
	String name() default "";
	String type() default "all";
	ReuquestMethod method() default ReuquestMethod.ALL;
	
	
}
