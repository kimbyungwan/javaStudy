package com.kopo.human;

public class StringBufferTest {
	// StringBuffer(동기화기능 있음)와
	// StringBuilder(동기화 기능 없음)는 같음
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
