package ssafy_git;

import java.util.Scanner;

public class q1_3 {
	
	public static void main(String[] args) {
		
//		int num = 1;
//		for(int i=5; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print(num++ + " ");				
//			}
//			System.out.println();
//		}
		
//		int x = 5;
//		int y = 1;
//		
//		int num = 1;
//		
//		for(int i=0; i<5; i++) {			
//			int value = Math.abs(x-y)+1;			
//			for(int j=0; j<value; j++) {
//				System.out.print(num++ + " ");
//			}			
//			System.out.println();
//			x--;
//			y++;
//		}
		
		System.out.println("���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3�� 2��");
		System.out.println("3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		int cnt = 0;		
		if(choice == 1) {cnt = 5;}
		else if(choice == 2) {cnt = 3;}
		else if(choice == 3) {cnt = 1;}
		else {System.out.println("�߸� �Է��ϼ̽��ϴ�.");}
		
		int win = 0;
		int lose = 0;
		
		for(int i=0; i<cnt; i++) { 			
 			
			System.out.println("���������� �� �ϳ� �Է� : ");
			String select = sc.next();
			
			int com = (int)(Math.random()*3)+1;
			if(com==1) {
				System.out.println("�̰���ϴ�!!!");
				win++;
				if((cnt == 5 && win > 2) || (cnt == 3 && win > 1) || (cnt == 1 && win == 1)) {
	 				System.out.println("###����� ��!!!");
	 			}
			}
			else if(com==2) {
				System.out.println("�����ϴ�!!!");
				lose++;
				if((cnt == 5 && lose > 2) || (cnt == 3 && lose > 1) || (cnt == 1 && lose == 1)) {
	 				System.out.println("###��ǻ�� ��!!!");
	 			}
			}
			else {
				System.out.println("�����ϴ�!!!");
				i--;
			} 			
			}		
		
		sc.close();

	}

}
