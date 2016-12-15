package class_16_extends;
public class Apple extends Fruit{
	private String eat;
	public Apple(){
		super();
	}
	public Apple(String name, String address, String color, Float price){
		
		super(name, address, color, price);
		//注意: 子类调用父类的构造方法时，super语句必须是子类构造方法的第一句
	}
}
