package example03;

public class WhileEx01 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;	//while���� �ʱ�ȭ �ϴ� �κ��� ���� �������� �ʴ´�.
		
		//while�� ������ ���ǽĸ� ���� ������, for���� ���ؼ� �Ϲ��� ���ο����� �������� ��������.
//		while(i<=100) {
//			sum += i;
//			i++;
//		}
		
		//C������ ���� booleanŸ���� ����. �׷��� 0�� ����, 0�� ������ ��簪���� ������ �ν��Ѵ�.
		//while���� ���ѷ��������� ���� ���ȴ�. if()�� break���� �Բ� ���ѷ����� ��� �ڵ带 �ۼ����ִ°� �´�.
		while(true) {
			
			
			System.out.println(i);
			i++;
			
			if(i>=100) {
				break;
			}
			
		}
		
//		System.out.println("1~100������ �� : " + sum);
	}

}
