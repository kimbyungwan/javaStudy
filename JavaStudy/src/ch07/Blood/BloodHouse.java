package ch07.Blood;

public class BloodHouse {
	public boolean isPossible(Human human) {
		 int age = 0; // �������� ���̸� Ȯ���Ͽ� ����
		 boolean isPossible = false; // ���� ���� ����
		 
		 age = human.getAge();
		 /* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		 			 
		 if(age >= 16 && age <= 69){
		 }
		 isPossible = true;
		 
		 /* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		 return isPossible;
		 }

		 public String action(Human human) {
		 String result = ""; // ���� ��� ����
		 
		 
		 /* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		
		 if(isPossible(human) == true) {
			 System.out.println("������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�.");
		 }else {
			 System.out.println("������ �Ұ����մϴ�.");
		 }
		 
		 /* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		 /* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		 return result;
		 }

}
