package ch05;

public class Star2 {
	public static void main(String[] args) {
		int size = 7;
		int center = size / 2 + 1;
		int left = center;
		int right = center;
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				if(j == left || j == right) {
					System.out.print("@");
				} else
					System.out.print(" ");
			}
			if(i < center) {
				left--;
				right++;	
			}else {
				left++;
				right--;
			}
			System.out.println();
		}
	}
}
