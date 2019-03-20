package ch06;

public class stic {
	public static void main(String[] args) {
		int[] stick = {5, 4, 4, 2, 2, 8};
		
		while(true) {
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < stick.length; i++) {
			//min < stick[i] < min;
			if(stick[i] < min && stick[i] > 0) {
				min = stick[i];
			}		
		}
		for(int i = 0; i < stick.length; i++) {
			stick[i] = stick[i] - min;
		}
		int count = 0;
		for (int i = 0; i < stick.length; i++) {
			if(stick[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
		if(count == 0) break;
	}
  }
}
