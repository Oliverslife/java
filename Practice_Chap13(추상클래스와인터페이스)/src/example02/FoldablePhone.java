package example02;

public class FoldablePhone extends Phone {
	//������
	public FoldablePhone(int serial_No, String owner, String company) {
		super(serial_No, owner, company);
		// TODO Auto-generated constructor stub
	}

	//�߻�޼��� 2�� ������
	@Override
	public void turnOn() {
		System.out.println("������ ���� �������ϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("������ ���� �������ϴ�.");
		
	}
	
	//��ü�޼��� 2��
	public void foldOn() {
		System.out.println("���� ����� ���˴ϴ�.");
	}
	
	public void foldOff() {
		System.out.println("���� ����� �����˴ϴ�.");
	}

}
