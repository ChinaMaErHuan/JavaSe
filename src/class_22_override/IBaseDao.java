package class_22_override;
import class_21_abstractlei.Constanst;
/**
 * 
 * 
 * IBaseDao
 * 创建人:maerhuan 
 * 时间：2016年5月11日-下午2:08:58 
 * @version 1.0.0
 *
 */
public interface IBaseDao extends IFatherDao {
	/**
	 * 在接口中的方法都是抽象方法
	 * 属性里面全部都是静态常量
	 * public static final 类型
	 * 
	 * 接口里没有构造函数
	 **/
	//你不写public static final 也会在编译阶段加上的
	public static final String USERNAME ="keke";
	public static final int age=20;
	//枚举类
	public  static final Constanst num = Constanst.A;
	
	public abstract void save();//abstract不写也是抽象方法
	public abstract void delete();
	public abstract void find();
	public abstract void update();
	
	// jdk1.8 就可以提供默认方法了
	// default void test(){
	//
	// }
	// static void sayHello(){
	//
	// }
}
