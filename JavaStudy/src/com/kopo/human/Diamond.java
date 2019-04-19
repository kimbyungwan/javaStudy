package com.kopo.human;

public class Diamond {
	
	public void diamond() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(i+j==4 || i-j==4 || i+j==12 || j-i==4){
					System.out.print("¡Ú");
					}else {
						System.out.print("¡Ù");
					}
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Diamond di = new Diamond();
		di.diamond();
		
		
	}
}
