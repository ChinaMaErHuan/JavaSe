package class_32_chario;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）
	 * @since 1.0.0
	 */
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private transient Integer bank;
	//transient:
	// java语言的关键字，变量修饰符，如果用transient声明一个实例变量，
	// 当对象存储时，它的值不需要维持。换句话来说就是，
	// 用transient关键字标记的成员变量不参与序列化过程。

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getBank() {
		return bank;
	}

	public void setBank(Integer bank) {
		this.bank = bank;
	}
}