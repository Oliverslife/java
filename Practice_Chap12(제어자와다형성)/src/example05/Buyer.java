package example05;

//����Ŭ����
public class Buyer {

	int money = 1000;		//�����ݾ�
	int bonusPoint = 0;		//���ʽ� ����
	
	//�Ű����� ProductŸ���� �Դٴ� ���� ������ �ǹ��ϴ°�? - Product�̰ų� ���� �ڼ�Ŭ�������� �� �� �� �ִٴ� ���� �ǹ��Ѵ�. (�Ű������� ������)
	public void buy(Product product) {
		//�����ڰ� ���� ������ ��ǰ�� ������ ��� ���
		if(this.money < product.price) {
			System.out.println("�ܾ��� �����Ͽ�, ���� ������ �ȵ˴ϴ�.");
			return;
		}
		
		this.money -= product.price;
		this.bonusPoint += product.bonusPoint;
		System.out.println(product + "�� �����ϼ̽��ϴ�.");
	}
	
	
	
	
	//�Ʒ��� ���� ���α׷����� �ϴٺ��� �ڵ��� ���̴� ���Ѵ밡 �� ���̸�, ���� ������� �ڵ�θ� ������ ����
	
//	public void buy(TV tv) {
//		//�����ڰ� ���� ������ ��ǰ�� ������ ��� ���
//		if(this.money < tv.price) {
//			System.out.println("�ܾ��� �����Ͽ�, ���� ������ �ȵ˴ϴ�.");
//			return;
//		}
//		
//		this.money -= tv.price;
//		this.bonusPoint += tv.bonusPoint;
//		System.out.println(tv + "�� �����ϼ̽��ϴ�.");
//	}
//	
//	public void buy(Audio audio) {
//		//�����ڰ� ���� ������ ��ǰ�� ������ ��� ���
//		if(this.money < audio.price) {
//			System.out.println("�ܾ��� �����Ͽ�, ���� ������ �ȵ˴ϴ�.");
//			return;
//		}
//		
//		this.money -= audio.price;
//		this.bonusPoint += audio.bonusPoint;
//		System.out.println(audio + "�� �����ϼ̽��ϴ�.");
//	}
//	
//	public void buy(Computer computer) {
//		//�����ڰ� ���� ������ ��ǰ�� ������ ��� ���
//		if(this.money < computer.price) {
//			System.out.println("�ܾ��� �����Ͽ�, ���� ������ �ȵ˴ϴ�.");
//			return;
//		}
//		
//		this.money -= computer.price;
//		this.bonusPoint += computer.bonusPoint;
//		System.out.println(computer + "�� �����ϼ̽��ϴ�.");
//	}
}
