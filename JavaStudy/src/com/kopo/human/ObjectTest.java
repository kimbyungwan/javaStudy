package com.kopo.human;

public class ObjectTest {

	public void test() {
		Radio rd = new Radio();
		Radio rd1 = new Radio();
		Radio rd2 = rd1;
		Radio rd3 = rd2;

		if (rd1.equals(rd2)) {
			System.out.println("�������� �����ϴ�");
		}
		if (rd1 == rd2) {
			System.out.println("�������� �����ϴ�");
		}

		String st = new String("����");
		String st1 = new String("����");
		String st2 = st1;
		if (st == st1) {
			System.out.println("�������� �����ϴ�");
		}
		if (st.equals(st1)) {
			System.out.println("���ڿ��� �����ϴ�");
		}

		System.out.println(new Mp3());
		System.out.println(new BDSDto());
	}

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.test();
	}
}
