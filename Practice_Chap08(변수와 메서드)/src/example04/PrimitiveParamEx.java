package example04;

class P {
	int data;
}

public class PrimitiveParamEx {

	public static void main(String[] args) {

		P a = new P();
		a.data = 77;
		System.out.println("�޼��� ȣ�� �� main() ���� �� : " + a.data);
		//�������� "�� �ó�?" ��� ����� ����. ���� ���� �� �ִ�.
		//Call by Value(���� ���� ����)		
		PrimitiveParamEx.dataChange(a.data);
		System.out.println("�޼��� ȣ�� �� main() ���� �� : " + a.data);

	}
	
	public static void dataChange(int data) {
		//�������� data��� ���� �����簡 �̷������ ������ ȣ���� ������ �ƹ��� ������ ���� �ʴ´�.
		data = 44;
		System.out.println("dataChange() ���� �� : " + data);
		return;
	}

}
