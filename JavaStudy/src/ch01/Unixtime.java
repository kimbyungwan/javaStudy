package ch01;

public class Unixtime {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		// 0.0 <= N < 1.0
		int num1 = 0;
		num1 = (int) (Math.random() * 6 + 1); // 7
		
		System.out.println(
			"1�� " + num1
		);
		int num2 = (int) (Math.random() * 6 + 1);
		System.out.println(
			"2�� " + num2
		);
		System.out.println(
			"�ΰ��� ���� " + ( num1 + num2 )
			);
		
		// 1�� �ֻ��� : 3
		// 2�� �ֻ��� : 2
		// �ΰ��� �ֻ��� ���� 5
		
		
	
	}
}