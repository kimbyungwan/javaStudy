package com.kopo.human.thread;

public class Supply2 extends Thread{
	public int Ham=10;
	static int i=1;
	int j=1;
	
	public void run(){   
		while(true){
			try{
				Thread.sleep(3000);
				make();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public synchronized void make(){								
			Ham=Ham+1;			
			System.out.println(j+" ��° �ܹ��� ����");	
			this.notify();	
			j++;			
	}
	
	public synchronized void buy(){
		Thread t = Thread.currentThread();
		while( Ham==0){
			System.out.println("�ܹ��� ���ȸ�");
			System.out.println("wait�� ������"+t.getName());			
			try{
				wait();					
				System.out.println("wait���� ��� ������ "+t.getName());
				System.out.println("������ ���� "+t.getState());							
			}catch(Exception e){
				e.printStackTrace();
			}			
		}
		Ham=Ham-1;
		System.out.println(t.getName()+" "+i+" ��°�ܹ��� �ȸ�");
		i++;		
	}
}
