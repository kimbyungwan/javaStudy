package ch05;

public class Exam5_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		 /* �ε����� 2�� ����� ��쿡�� �� �Է� */
		 for(int i = 0; i < arr.length; i++) {
		 if(i % 2 == 0) {
		 arr[i] = i + 10; // 10 12 14 16 18
		 // 10 0 12 0 14 0 16 0 18 0 
		 }
	}
		 
		 int sum = 0;
		 int count = 0;
		 float avg = 0f;
		 
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i]>0) {
			 sum += arr[i];
			 count++;
		    }
	}
		 avg = (float) sum / count;
		 
		 // �ڵ��ۼ�

		 System.out.println("�� : " + sum);
		 System.out.println("��� : " + avg);
	}
}