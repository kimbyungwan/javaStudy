package ch06;

public class Exam6_2 {
	public static void main(String[] args) {
		int n = 100;
		 int total = getTotal(n);
		 System.out.println("1 ~ " + n + " 까지의 합 : " + total);
	}
	
	public static int getTotal(int number) { 
		int total = 0;
		for(int i = 1; i <= number; i++) {
			total += i; 
		}
		 return total;
	}
}
