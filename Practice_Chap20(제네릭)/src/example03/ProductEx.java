package example03;

public class ProductEx {

	public static void main(String[] args) {
		
		Product<Tv, String> p1 = new Product<>();
		p1.setT(new Tv(2019, 9));
		p1.setM("LG OLED ����Ʈ TV");
		
		System.out.println("���� TV�� " + p1.getT().getYear() + "�� " + 
		p1.getT().getMonth() + "�� ���̸�, " + p1.getM() + "�̴�.");

	}

}
