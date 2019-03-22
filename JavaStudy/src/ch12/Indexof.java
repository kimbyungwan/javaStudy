package ch12;

public class Indexof {
	public static void main(String[] args) {
		//             0123456789
		String text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore ";
		System.out.println(text.length());
		int index = -1;
		
		while(true) {
		index = text.indexOf("m", index + 1);
		System.out.println(index);
		if(index == -1) {
			break;
		}
	  }
	}
}
