package ch01;

public class Unixtime {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		// 0.0 <= N < 1.0
		int num1 = 0;
		num1 = (int) (Math.random() * 6 + 1); // 7
		
		System.out.println(
			"1번 " + num1
		);
		int num2 = (int) (Math.random() * 6 + 1);
		System.out.println(
			"2번 " + num2
		);
		System.out.println(
			"두개의 합은 " + ( num1 + num2 )
			);
		
		// 1번 주사위 : 3
		// 2번 주사위 : 2
		// 두개의 주사위 합은 5
		
		
	
	}
}
