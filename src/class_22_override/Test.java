package class_22_override;
public class Test {
	public static void main(String[] args) {
		//多态关注于子类中被重写的部分
		Father father = new Children("maerhuan");
		father.say();
		father.goSleep();
	}
}
