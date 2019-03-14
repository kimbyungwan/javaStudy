package ch04;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("숫자를 입력하시오. => ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i = 1; i <= 10000; i++) {
			int n = i;
			while(n > 0) {
				int n2= n % 10;
				if(n2 == 8) {
					
					count++;
				}
				n = n / 10;
					}
		}
		System.out.println(count);
	}

}
