package ch03;

public class Operation4 {
	public static void main(String[] args) {
		int num = 123456789;

		int total = 0;
		
		while(num > 0) {
			int n = num % 10; // 마지막 자리 숫자 뜯어내기
//			System.out.println(n);
			total += n;
			num = num / 10;
		}
		System.out.println(total);
		
		
		
//		// 첫번째 4 숫자 뜯어내기
//		int n1 = num % 10; // 4
//		
//		// 두번째 2 숫자 뜯어내기
//		num = num / 10; // 232		
//		int n2 = num % 10; // 2
//
//		// 세번째 3 숫자 뜯어내기
//		num = num / 10; // 23
//		int n3 = num % 10; // 3
//		
//		// 네번째 2 숫자 뜯어내기
//		num = num / 10; // 2
//		int n4 = num % 10; // 2
//		
//		System.out.println(n1+n2+n3+n4);
	}
}
