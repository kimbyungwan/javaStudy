package ch07.Blood;

public class Main {
	public static void main(String[] args) {
		 /* ������ ���� */
		 Human human = new Human();
		 human.setName("��");
		 human.setType('O');
		 human.setAge(5);

		 BloodHouse x = new BloodHouse();
		 /* BloodHouse ��ü ���� */
		 String result = ""; // action() �޼ҵ� ȣ�� ��� ����
		 result = x.action(human);
		 /* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		 /* action() �޼ҵ� ȣ�� ��� ��� */
		 System.out.println(result);
		 }
}
