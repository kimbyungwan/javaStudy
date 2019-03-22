package ch10;

public class SaltyRamen extends Ramen { // 상속 코드
	public SaltyRamen(String name) {
		super.name = name;
	}
	public String getTaste() {
		return name + " 짠맛";
	}
	// 오버라이드 코드
}