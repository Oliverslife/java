package example02;

import java.util.Scanner;

public class SecondArrayEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] student; //2���� �迭�� ����
		int count = 0, num = 0, sum = 0, total = 0; //�� ��, �� �ο�, �հ�, ��
		double avg = 0.0;
		double avgTotal = 0.0;
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		count = sc.nextInt();
		student = new int[count][]; //���� ������ 1���� �迭�� �Ҵ�(heap)
		
//		System.out.println("2���� �迭�ּ� : " + student);
//		System.out.println("1���� �迭 ũ�� : " + studnet.length);
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d���� �ο� : ", i+1);
			num = sc.nextInt(); //���� �ο��� �޴´�.
			student[i] = new int[num];
			
			for(int j=0; j<student[i].length; j++) {
				System.out.printf("%d���� %d���� ���� : ", (i+1), (j+1));
				student[i][j] = sc.nextInt(); //���� �� �ο��� ������ �޴´�.
			}
			System.out.println();
		}
		
		//������ ����� �ԷµǾ����� Ȯ��
//		for(int i=0; i<student.length; i++) {
//			for(int j=0; j<student[i].length; j++) {
//				System.out.println(student[i][j]);
//			}
//		}
		
		System.out.println("��\t�հ�\t���\t");
		System.out.println("----------------------");
		
		for(int i=0; i<student.length; i++) {
			sum = 0; //���� �ٲ� �� �ʱ�ȭ
			for(int j=0; j<student[i].length; j++) {
				sum += student[i][j]; //�ݺ� �հ�
			}
			total += sum; //�� �հ�
			avg = (double)sum / student[i].length; //�� ���
			avgTotal += avg; //�� ����� ��
			System.out.printf("%d��\t%d\t%.1f\n", i+1, sum, avg);
		}
		
		avgTotal = avgTotal / student.length;
		System.out.printf("��\t%d\t%.1f\n", total, avgTotal);
		
		
		
		
		sc.close();

	}

}
