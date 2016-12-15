/**
 * Tm系统平台
 * JavaSe
 * test.duotai
 * Fruit.java
 * 创建人:maerhuan 
 * 时间：2016年10月15日-下午8:24:02 
 * 2016Tm公司-版权所有
 */
package test.duotai;
public class Fruit {
	public String shape;
	protected String color;
	String nameString;
	private String xx;
	
	public Fruit(){
		
	}
	
	public Fruit(String shape, String color, String nameString, String xx) {
		super();
		this.shape = shape;
		this.color = color;
		this.nameString = nameString;
		this.xx = xx;
	}

	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getXx() {
		return xx;
	}
	public void setXx(String xx) {
		this.xx = xx;
	}
	protected void geJiage(){
		System.out.println("价格是...");
	}
	private void getname(){
		System.out.println("sadas");
	}
	
	
}
