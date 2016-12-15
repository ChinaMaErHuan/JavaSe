package class_16_extends;

public class Fruit {
	private String name;
	private String address;
	private String color;
	private Float price;

	public Fruit() {
		super();
	}

	public Fruit(String name, String address, String color, Float price) {
		super();
		this.name = name;
		this.address = address;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	// java�еļ̳��ǵ�һ�̳�
	// �ӿ���Ϊ�˽��java�е�һ�̳еĶ��� ��̬���������
}
