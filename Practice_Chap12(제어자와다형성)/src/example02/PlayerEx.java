package example02;

public class PlayerEx {

	public static void main(String[] args) {

		//������ ������ �ڵ�
		Player player1 = new Player("�̵���", 40, 20, 60);
		player1.info();
		
		//�������� ����� �ڵ�(�ʵ��� ������) ������ �ٺ��� ����� ���Ѵ�.
		Player player2 = new Striker("�����", 25, 10, 90, 50);
		//�޼��忡�� ��Ӱ��迡 ���� ��, �ڼ�Ŭ���� �������̵��� �ϰ� �Ǹ� ���� �����ϰ� �ִ� �ν��Ͻ��� �޼��带 ȣ���Ѵ�.
		player2.info();	//player2.getShoot()�� player2 ���������� ������ �� ����. (�ٺ��� Player�̹Ƿ�)
		
		Player player3 = new MidFielder("�̰���", 18, 18, 80, 120);
		player3.info(); //���������� player3.getPass()�� ������ �� ����.
		
		Player player4 = new Defender("�迵��", 28, 18, 60, 60);
		player4.info();

	}

}
