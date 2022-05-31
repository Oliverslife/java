package example01;

public class Card {
	
	//�ν��Ͻ� ���� -- �ݵ�� �ν��Ͻ��� �����ؾ� ���� ����
	private String color;	//ī���� ����
	private String company;	//ī�� ȸ���
	
	//static����(����, Ŭ����, ���� ����) -- �ν��Ͻ� ���� ���̵� Ŭ������.static���������� ���� ����
	static int width = 100;	//ī���� ��
	static int height = 50; //ī���� ����
	
	//getter, setter -- �ν��Ͻ� �޼���
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void show() {
		//���������� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�.
		//�޼��� �ȿ� static������ ������� ���Ѵ�. static�� Ư���� �ν��Ͻ� �������̵� �󸶵��� ���� �����ؾ��ϴµ�, 
		//���� �ν��Ͻ��� �������� �ƹ��� �𸣱� ������ �ùٸ� ����� �ƴϴ�.
		//static int i;
		
		String color = this.color;
		String company = this.company;
		System.out.println(color + ", " + company);
	}
	
	@Override
	public String toString() {		
		//��������(static)�� ���� ����� �ݵ�� Ŭ������.static���������� ������ �ؾ� �ùٸ� ����̴�.
		return "card�� ���� : " + this.getColor() + ", card�� ȸ�� : " + this.getCompany() + 
				", ũ�� : (" + Card.height + ", " + Card.width + ")";
	}
}
