package ch10;

public class SaltyRamen extends Ramen { // ��� �ڵ�
	public SaltyRamen(String name) {
		super.name = name;
	}
	public String getTaste() {
		return name + " §��";
	}
	// �������̵� �ڵ�
}