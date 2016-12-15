package class_27_fanxing;
public class BankTest {
	public static void main(String[] args) {
		Bank<Float> bank = new ICBCBank<>();
		bank.setMoney(12.5f);
		bank.saveMoney(12.5f);
		
		
		ICBCBank<Float> bank2 = new ICBCBank<>();
		bank2.setMoney(12.5f);
		bank2.saveMoney(12.5f);
		bank2.upDate(12.5f);
		
		Bank<Integer> bank3 = new ICBCBank<>();
		bank3.setMoney(15);
		bank3.saveMoney((int) 12.5f);
		
	}
}
