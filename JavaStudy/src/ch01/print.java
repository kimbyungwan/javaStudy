package ch01;

public class print {
	public static void main(String[] args) {
		// 실행 단축키 => Ctrl + F11
		
		/*
		 * 작성자 : 김남현
		 * 작성일자 : 2019-03-06
		 * 수정이유 : 코드가 틀려서...
		 */
		System.out.println("큰따옴표 => \"");
		
		System.out.println("" + 1 + 2 + 3);
		
		// 문자열(문장)은 항상 큰따옴표를 사용하여 출력
		System.out.println("First Program");

		// 숫자 더하기 숫자는 더하기 연산 결과로 출력
		System.out.println(1 + 2);

		// 숫자 곱하기 숫자는 곱하기 연산 결과로 출력
		System.out.println(3 * 4);

		// 문자열 더하기 문자열은 문자열이 합쳐진 형태로 출력
		System.out.println("1" + "2");

		// 출력결과는 숫자이지만 실제 데이터는 문자열
		System.out.println("12");

		// 숫자 더하기 문자열, 또는 문자열 더하기 숫자는 문자열이 합쳐진 형태로 출력
		System.out.println(1 + "2");
		
		// 더하기와 곱하기 연산의 경우 곱하기가 더 우선 순위로 연산
		System.out.println(1 + 3 * 4);

		// 괄호를 사용하면 최우선 순위로 연산
		System.out.println((1 + 3) * 4);

		System.out.println("큰따옴표 안에서는 '작은따옴표' 사용 가능");

		System.out.println("큰따옴표 안에서 \"큰따옴표\"를 사용하려면 예외문자(\\)를 사용");
		// 작은따옴표는 문자 개를 표현때 사용
		System.out.println('문');
		// 여러 기호의 조합
		System.out.println("A의 점수 합은 : " + (1 + 2) + ", B의 점수 합은 : " + (3 + 4));
		
	}
}

