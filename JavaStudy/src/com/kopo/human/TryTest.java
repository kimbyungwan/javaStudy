package com.kopo.human;

public class TryTest {
	public void test(int number) {
		try {
			int result = 4 / number;
			System.out.println("��� ���: " + result);
		} catch (Exception e) {
			System.out.println("�Է°��� 0�� �ü��� �����ϴ�");
			e.printStackTrace();
			//e.toString();
			//e.getMessage();
		
		} finally {
			System.out.println("finally������ ���");

		}

	}

	public static void main(String[] args) {
		TryTest tt = new TryTest();
		tt.test(0);
	}
}
