package com.kopo.human.thread;

public class Consumer extends Thread {
	public void run(){
		while(true){
			try{
				HamTest.sp.buy();
				this.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

}
