package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		//Ctrl + Shift + O �ڵ� ����Ʈ		
		//ScannerŬ������ �Է��� �ޱ� ���� Ŭ�����̰�, �Է½�Ʈ��
		//�ڿ�(Resource)�� ����ϰ� ���� �ݵ�� �ݾ���� �Ѵ�.
		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է� : ");
//		int num = sc.nextInt();
//		System.out.println("����ڷκ��� �Է¹��� ���� : " + num);
//		
//		System.out.print("�Ǽ��� �Է� : ");
//		double dnum = sc.nextDouble();
//		System.out.println("����ڷκ��� �Է¹��� ���� : " + dnum);
		
		System.out.print("���ڿ��� �Է� : ");
		//String str = sc.next();	//next()�� ������ �������� �ؼ� ���ڸ� �Է� -- �ܾ �Է�
		//nextLine()�� ������ �������� �ؼ� ���ڸ� �Է� -- ������ �Է�
//		String str = sc.nextLine();
//		System.out.println("����ڷκ��� �Է¹��� ���ڿ� : " + str);
		
		int result = 100;
		String num = sc.nextLine();
		//Integer.parseInt() ���� : ���ڿ��� �Է¹��� ���ڵ��� ���ڿ��� �ƴ϶� ���ڷ� �ٲ��ִ� ������ �ϴ� �޼���
		int temp = Integer.parseInt(num);
		int total = result + temp;
		System.out.println("������ : " + total);
		
		
		sc.close();	//�ݾ��ֱ�

	}

}
