package com.kopo.human;

public class StringBufferTest {
	// StringBuffer(����ȭ��� ����)��
	// StringBuilder(����ȭ ��� ����)�� ����
	void test() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * ");
		sb.append("FROM BBS ");
		sb.append("WHERE ID=?");

		System.out.println(sb);
	}

	public static void main(String[] args) {
		StringBufferTest sbt = new StringBufferTest();
		sbt.test();
	}
}
