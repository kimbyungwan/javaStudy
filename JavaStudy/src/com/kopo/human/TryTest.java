package com.kopo.human;

public class TryTest {
	public void test(int number) {
		try {
			int result = 4 / number;
			System.out.println("결과 출력: " + result);
		} catch (Exception e) {
			System.out.println("입력값이 0이 올수는 없습니다");
			e.printStackTrace();
			//e.toString();
			//e.getMessage();
		
		} finally {
			System.out.println("finally문에서 출력");

		}

	}

	public static void main(String[] args) {
		TryTest tt = new TryTest();
		tt.test(0);
	}
}
