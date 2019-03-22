package ch12;

public class Equals {
	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "hi";
		System.out.println(s1 == s2);
		
		String s3 = new String("h1");
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
