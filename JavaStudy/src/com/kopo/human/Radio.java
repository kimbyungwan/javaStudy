package com.kopo.human;

public class Radio implements Elec{
	public Radio() {
		super();
	}

	@Override
	public void volumeUp() {
		System.out.println("���� ���� ��");
	}

	@Override
	public void volumeDown() {
		System.out.println("���� ���� �ٿ�");
	}
	
	
	

}
