package ch07.Service;

public class PC {
	public void show() {
		Member[] mem = select();
		for(Member m : mem) {
			System.out.println(m.id);
			System.out.println(m.pw);
		}
	}
	public Member[] select() {
		Member[] mem = new Member[5];
		for(int i = 0; i < 5; i++) {
			Member m = new Member();
			m.id = "id" + i;
			m.id = "id" + i;
		}
		return mem;
	}
}
