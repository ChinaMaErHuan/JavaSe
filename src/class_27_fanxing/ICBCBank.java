package class_27_fanxing;
/**
 * 1:一个类继承一个类，接口，抽象类的时候，泛型就必须具体化	
 * 
 * ICBCBank</br>
 * 创建人:maerhuan </br>
 * 时间：2016年5月22日-下午5:27:17 </br>
 * @version 1.0.0
 * @param <T>
 *
 */
public class ICBCBank<T extends Number> extends Bank<T> implements ParentBank<T>{

	
	@Override
	public void saveMoney(T money) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T upDate(T money) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
