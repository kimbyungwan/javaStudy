package ch03;

public class Exam03_09 {
	public static void main(String[] args) {
		char a = 'c';
//		  a = a + (char)1;   (X)
		a = (char) (a + 1);
		// char + char ==> int + int
		// char + int ==> int + int
		// (char) (int + int)

		char ch = 'X';

		char lowerCase = (ch > 'A' && ch < 'Z') 
				? ((char) (ch + 32) /* ch + 32 */ ) 
				: ch;

		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
