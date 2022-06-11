package example02;

public class PhoneEx {

	public static void main(String[] args) {
		
		//�߻�Ŭ������ �ν��Ͻ��� ������ �� ����.
		//Phone phone = new Phone();
		
		Phone[] p = new Phone[10];
		
		p[0] = new SmartPhone(190820, "Ƽ�ƶ�", "SAMSUNG-FOLDABLE-20");
		p[1] = new FoldablePhone(190815, "ȫ�浿", "LG-V50");
		
		//�ڼ�Ŭ������ �޼ҵ�� ���Ұ�(�ٺ��� Phone Ŭ����), �������̵��� �߻�޼ҵ�� �ڼ�Ŭ�������� �ҷ���.
		p[0].turnOff();
		p[0].showInfo();
		
		System.out.println("-------------------------------------");
		
		SmartPhone smartPhone = new SmartPhone(190815, "ȫ�浿", "LG-V50");
		smartPhone.showInfo();
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
		System.out.println("-------------------------------------");
		
		FoldablePhone fPhone = new FoldablePhone(190820, "Ƽ�ƶ�", "SAMSUNG-FOLDABLE-20");
		fPhone.showInfo();
		fPhone.turnOn();
		fPhone.turnOff();
		fPhone.foldOn();
		fPhone.foldOff();
	}

}
