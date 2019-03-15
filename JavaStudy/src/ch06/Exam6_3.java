package ch06;

import java.util.Scanner;

public class Exam6_3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = num;
	
			if(i > 10) {
				System.out.println(" 1 ");
			}	else if(i < 10 && i > 7 ) {
				System.out.println(" 2 ");
			}	else if(i < 7 && i > 4 ) {
				System.out.println(" 3 ");
			}	else {
				System.out.println(" 4 ");
			}
		

  }
}
