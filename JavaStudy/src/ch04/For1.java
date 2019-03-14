package ch04;

public class For1 {
	public static void main(String[] args) {
		// 1.시작값 2.끝값(조건) 3.증감식
		
		int total = 0;
		int realTotal =0;
		
		for(int start =1; start <= 10; start++) {
			total = total + start;
			realTotal = realTotal + total;
			
		}
		System.out.println(realTotal);
		
//		for(int start =1; start <= 10; start++) {
//			total = total + start;
//			System.out.println(total);
//		}
//		for(int end = 10; end >=1; end--) {
		
//			System.out.print("감소출력");
//		}
//			System.out.println("출력");
//		// 1 2 3 조건이 제대로 맞지 않는 경우
//		// for(int idx = 1; ; idx++)
	}
}
