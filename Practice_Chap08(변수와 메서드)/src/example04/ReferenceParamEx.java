package example04;

class A {
	int data;
}

public class ReferenceParamEx {

	public static void main(String[] args) {

		A a = new A();
		a.data = 77;
		System.out.println("�޼��� ȣ�� �� main() ���� �� : " + a.data);
		//�������� "�ð谡 ����ִ�?" ��� ����� ����. ���� �а� ������ �� �ִ�.
		//Call by Reference(�ּҿ� ���� ����)		
		ReferenceParamEx.dataChange(a);
		System.out.println("�޼��� ȣ�� �� main() ���� �� : " + a.data);

	}
	//int[], String --> ������������ ȣ��
	public static void dataChange(A a) {
		//a��� �ּҰ��� �Ű������� �Ѿ�Ա� ������ �ּҸ� �����Ѵ�. ȣ���� ������ ������ ������ �޴´�.
		a.data = 44;
		System.out.println("dataChange() ���� �� : " + a.data);
		return;
	}

}
