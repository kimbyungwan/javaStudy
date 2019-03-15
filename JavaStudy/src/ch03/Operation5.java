package ch03;

public class Operation5 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result = false;
		//    앞의 식이 거짓이기 때문에 뒤의 num2++ 은 실행하지 않음
		result = num1++ < 0 & num2++ > 0;
		System.out.println(num1); // 1
		System.out.println(num2); // 0
	}
}
