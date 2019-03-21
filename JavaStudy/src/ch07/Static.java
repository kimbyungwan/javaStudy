package ch07;

public class Static {
	static char color = 'R';
	static int num = 0;
	int score = 0;

	static void staticMethod() {
		System.out.println("static method");
		num++;
		Static s = new Static();
		s.score++;
	}

	void instanceMethod() {
        System.out.println("instance method");
    }
}
	
	