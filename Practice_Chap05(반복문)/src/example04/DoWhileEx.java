package example04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ͻ÷��� q�� �Է��ϼ���.");
		
		String str = null;
		
		//do-while���� �ּ� �ѹ� �̻� ������ ������ �ϴ� �ݺ����̴�.
		//������ ���ǹ��� �޺κп� �����ϱ� �����̴�.
		do {
			System.out.print("> ");
			//StringŬ���� next()�޼���� ���� ������������ �� ���� ����
			//next() �� �ܾ �Է¹��� �� �� �� �ִ� �޼���
			//nextLine() ������ �����Ͽ� ����Ű�� �Է��� �� ���� ������ ����
			str = sc.nextLine();
			System.out.println("�Է¹��� �޼��� : " + str);
		}while(!str.equals("q"));
		
		System.out.println("���α׷� ����");
		sc.close();

	}

}
