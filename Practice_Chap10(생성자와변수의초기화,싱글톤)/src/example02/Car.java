package example02;

public class Car {
	
	String color;	//����
	String gearType;//���ӱ� ����
	int door;
	
	//�⺻ ������
	public Car() {
		//���������� �ν��Ͻ���������� �ʱ�ȭ
//		this.color = "���";
//		this.gearType = "����";
//		this.door = 4;
		
		//���� Ŭ���� ���� �ִ� �Ű������� 3���� �ִ� �����ڸ� ȣ���ϴ� ����. this();
		this("����", "����", 4);
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	
	//Ÿ���� ��ġ�Ƿ�(String color) �����ε� ���ǿ� �������� ����
//	public Car(String gearType) {
//		this.gearType = gearType;
//	}
	
	public Car(int door) {
		this.door = door;
	}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	
	
	

	//this : ���������� ���� ����, �Ű������� ��������� �������µ� ���
	//�ݵ�� this�� �Ἥ ��Ȯ�ϰ� ���α׷��� �ǵ��� �Ѵ�.
	public Car(String color, String gearType, int door) {
		//color =color; ������ ��ȣ���� �Ͼ�� �ʱ�ȭ�� ���̷������.
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public Car(Car c) {
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
	
	@Override
	public String toString() {
		return this.color + ", " + this.gearType + ", " + this.door;
	}
	
	

}
