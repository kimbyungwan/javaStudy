package ch04;

public class For2 {
	public static void main(String[] args) {
		//ÁßÃ¸ ¹Ýº¹¹®
		
		for(int y = 1; y <= 9; y++) {
			for(int x = 2; x <= 5; x++)
				System.out.print(x + "*" + y + "=" + (x*y) + "\t");
		}
		System.out.println();
		
//		for(int x = 2; x <= 5; x++) {
//			for(int y = 1; y <= 9; y++) {
//				System.out.print(
//					x + " * " + y + " = " + (x * y) + "\t");
//			}
//			//System.out.println();
//			System.out.print("\n");
//		}
		
		
		
//		for(int a = 1; a <= 3; a++) {
//			for(int b = 1; b <= 2; b++) {
//			System.out.println(a + "," + b);
//			}
//		}
	}
}
