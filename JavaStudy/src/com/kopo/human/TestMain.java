package com.kopo.human;

public class TestMain {
	
	public static void main(String[] args) {
		Radio ra = new Radio();
		Radio ra1 = new Radio();
		Radio ra2 = ra1;
		System.out.println(ra);
		System.out.println(ra1);
		System.out.println(ra2);
		System.out.println(6);
		Tv tv = new Tv();
		Mp3	m = new Mp3();
		ra.volumeUp();
		ra.volumeDown();
		tv.volumeUp();
		tv.volumeDown();
		m.volumeUp();
		m.volumeDown();

	}

}
