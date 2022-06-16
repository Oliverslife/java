package example03;

public class A {

	//�ν��Ͻ� ���Ŭ����
	class B{
		public B() {
			System.out.println("�ν��Ͻ����Ŭ���� B������");
		}
	}
	//���� ��� Ŭ����
	static class C{
		public C() {
			System.out.println("�������Ŭ���� C������");
		}
	}
	
	//�ν��Ͻ� ���(�ʵ�)
	B b = new B();
	C c = new C();
	
	//�ν��Ͻ� ��� �޼��� method1()�� ����� �� ����, �̹� �ܺ�Ŭ���� A�� �ν��Ͻ��� ������� ������ ���̴�.
	public void method1() {
		System.out.println("method1()");
		//��������
		B b = new B();
		C c = new C();
	}
	
	//���� ���
	//BŬ������ �ν��Ͻ� ��� Ŭ�����̱� ������, static�� ���̸� �ȵȴ�.
	//static B b1 = new B();
	static C c1 = new C();
	
	//static�� static�� ���� �����ϴ�.
	public static void method2() {
		System.out.println("method2()");
		//B b = new B();	//�ν��Ͻ� ���Ŭ���� �̹Ƿ� �ȵȴ�.
		C c = new C();	//�����޼����̹Ƿ� ���� ���ú����� ������ �ص� �����ϴ�.		
	}
	
	//��� : ��øŬ���������� �ν��Ͻ� �ʵ峪 �޼���� �������� ���� ����������, ���� �ʵ峪 ���� �޼���� ���� Ŭ���������� ������ �����ϴ�.
	
}
