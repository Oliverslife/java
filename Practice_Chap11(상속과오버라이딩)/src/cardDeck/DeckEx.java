package cardDeck;

public class DeckEx {

	public static void main(String[] args) {
		//Deck�� �����ڸ� ȣ���ϸ� �׻� ���Ե� Ŭ�������� ������ ���� ��.(�߿�)
		Deck d = new Deck();
		Card c = d.pick(51);
		
		System.out.println("ī�� ���� ���� ���� �ؿ� �ִ� ī�� : ");
		System.out.println(c.toString());
		
		d.shuffle();
		c = d.pick(51);
		System.out.println("ī�� ���� �Ŀ� ���� �ؿ� �ִ� ī�� : ");
		System.out.println(c.toString());
		
		c = d.pick();
		System.out.println(c.toString());

	}

}
