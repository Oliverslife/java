package example01;

public class If_If_elseEx {

	public static void main(String[] args) {

		int score = -500;
		
		//���� ���� if���� �����ϴ���, CPU�� ��� if���� �����մϴ�. (��ȿ������ �ڵ�)
//		if(score > 90) {
//			System.out.println("������ 90���� Ů�ϴ�.");
//			System.out.println("����� A�Դϴ�.");
//		}
//		
//		if(score > 80) {
//			System.out.println("������ 80���� Ů�ϴ�.");
//			
//		}
		
		//if-else ������ 50% Ȯ���� ��, ����ϴ°� �ٶ����ϴ�. else ���� ������ ���ǹ��� ����� ���� �ȵȴ�.
		//�߰�ȣ ���� ������ �ѹ����� ��� �߰�ȣ�� �����ص� �ǳ�, �׻� ����ϴ� ����ȭ�ϴ°� ����.
		if(score > 90) {
			System.out.println("90�� �̻��Դϴ�.");
		}
		else {
			System.out.println("90�� �̸��Դϴ�.");
		}
		

	}

}
