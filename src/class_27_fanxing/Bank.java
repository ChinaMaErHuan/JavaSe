package class_27_fanxing;
//T可以继承一些东西 多继承 用在类身上
public abstract class Bank<T extends Number &java.io.Serializable> {
	private T money;

	public Bank(){
		
	}
	
	public Bank(T money) {
		super();
		this.money = money;
	}

	public T getMoney() {
		return money;
	}

	public void setMoney(T money) {
		this.money = money;
	}
	/**
	 * 
	 * 强制覆盖方法</br>
	 * class_27_fanxing </br>
	 * 方法名：saveMoney </br>
	 * 创建人：maerhuan </br>
	 * 时间：2016年5月22日-下午5:08:59 </br>
	 * @param money void </br>
	 * @exception  </br>
	 * @since  1.0.0
	 */
	public abstract void saveMoney(T money);
	
}
