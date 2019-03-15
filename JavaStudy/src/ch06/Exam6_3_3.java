package ch06;

import java.util.Calendar;
import java.util.Scanner;

public class Exam6_3_3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		int month = cal.get(Calendar.MONTH) + 1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(lastDate);
		
		
	
	}
}
