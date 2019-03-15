package ch02;

public class Variable_1 {
	// 소스코드 정렬 : Shift + Ctrl + F
	public static void main(String[] args) {
		int public1 = 10;
		
		int a = 10;
		System.out.println("a의 값은? " + a);

		int b = 11;
		System.out.println("b의 값은? " + b);

		// a의 값에 b를 입력
		// 기존 a의 값 10은 사라짐
		a = b;
		System.out.println("a의 값은? " + a);
	}
}
