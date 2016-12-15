package class_32_chario;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * serialVersionUID:TODO����һ�仰�������������ʾʲô��
	 * @since 1.0.0
	 */
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private transient Integer bank;
	//transient:
	// java���ԵĹؼ��֣��������η��������transient����һ��ʵ��������
	// ������洢ʱ������ֵ����Ҫά�֡����仰��˵���ǣ�
	// ��transient�ؼ��ֱ�ǵĳ�Ա�������������л����̡�

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