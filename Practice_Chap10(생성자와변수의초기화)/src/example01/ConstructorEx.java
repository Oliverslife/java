package example01;

//AŬ������ �ƹ��� �����ڰ� �������� �����Ƿ�, ������ �ÿ� �����Ϸ��� �˾Ƽ� �⺻�����ڸ� �߰����ش�.
class A{
	int value;
}

class B{
	int value;
	
	public B() {
		
	}
	
	public B(int value) {
		this.value = value;
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		
		A a = new A();
		//������ ���ܸ� ��� ���
		//1. BŬ������ �⺻ �����ڸ� �߰�
		//2. BŬ���� ������ ȣ��� �Ű����� ������ int���� ��������
		B b = new B();

	}

}
