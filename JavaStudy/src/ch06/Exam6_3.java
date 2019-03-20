package ch06;

import java.util.Scanner;

public class Exam6_3 {

		public static int checkGrade( int weight) {
			int grade = 0;
			if(weight > 10) {
			grade = 1;	
		} else if(weight > 7) {
			grade = 2;
		} else if(weight > 4) {
			grade = 3;
		} else {
			grade = 4;
		}
		return grade;	
		

  }
		public static void main(String[] args) {
			int result = checkGrade(3);
			System.out.println(result);
		}
		
}
