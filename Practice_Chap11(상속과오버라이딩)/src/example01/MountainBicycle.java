package example01;

//����� �ϴ� ����
//1. ����� �ڵ�� ���󿡼� ����
//2. �������� �κ��� �ڼտ��� ���� ����
//3. �ڵ��� ���뼺

//����� ������ ����
public class MountainBicycle extends Bicycle {
	
	//��� ���� : 5��
	String frame;
	int gear;
	int price;
	
	public void print() {
		System.out.println("id : " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("frame : " + this.frame);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("owner : " + this.owner);
	}
	
	public static void main(String[] args) {
		MountainBicycle mb = new MountainBicycle();
		mb.id = 1111;
		mb.brand = "LESPO";
		mb.frame = "ī��";
		mb.gear = 10;
		mb.price = 150000;
		mb.owner = "kim";
		
		mb.print();				
		
	}
}
