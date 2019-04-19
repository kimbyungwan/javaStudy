package com.kopo.human;

public class SingleTonTest {
	private static SingleTonTest stt = new SingleTonTest();
	
	private SingleTonTest() {
		
	}
	
	public static SingleTonTest getInstance() {
		return stt;
	}

}
