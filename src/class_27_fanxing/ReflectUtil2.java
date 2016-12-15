package class_27_fanxing;



public class ReflectUtil2{
	
	/**
	 * 
	 * 泛型类：输入对象本身的东西。，不能够修饰到静态成员
	 * 泛型方法：作用域静态方法身上。
	 * 
	 * 
	 * 实例化对象</br>
	 * class_27_fanxing </br>
	 * 方法名：getObject </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月23日-下午7:43:11 </br>
	 * @param clz
	 * @return Object </br>
	 * @exception  </br>
	 * @since  1.0.0
	 * 
	 * 
	 * 应用范围：一般都是定义一些工具类，返回类型不确定的情况下，比如如果你返回类型是Object可以考虑
	 * 公式：
	 * 修饰符 <T> 返回类型(T) 方法名(形参列表){
	 * 
	 * 	//方法体
	 * }
	 * 
	 */
	public static <T extends Bank<?>> T getObject(Class clz){
		try {
			return (T)clz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	
	public static void main(String[] args) {
		
		User user = ReflectUtil2.getObject(User.class);
		System.out.println(user);
		
		ICBCBank<Float> cBank = ReflectUtil2.getObject(ICBCBank.class);
		System.out.println(cBank);

		
	}
}