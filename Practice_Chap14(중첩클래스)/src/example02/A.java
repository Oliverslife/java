package example02;

public class A {
	
	public A() {
		System.out.println("------------------------------");
		System.out.println("�ܺ�Ŭ���� A�� ������ ȣ��");		
		
		B b = new B(); //�̰� �� �����ұ��? - �ν��Ͻ� ���Ŭ������ �ܺ�Ŭ����A�� ����̴�.
		System.out.println(b.a);
		b.method1();
		
		C c = new C();
		System.out.println(c.a);
		System.out.println(C.c);
		c.method1();
		C.method2();
		
		this.method();
		//D d = new D();	//�޼��� ���ο� ���� �Ǿ� �ֱ� ������
		
		System.out.println("------------------------------");
	}
	
	//�ν��Ͻ� ���Ŭ���� B
	class B{
		int a = 10;
		//static int cv = 20; �Ұ���
		public B() {
			System.out.println("��øŬ���� B�� ������ ȣ��");
		}
		public void method1() {
			System.out.println("BŬ������ ����޼��� ȣ��");
		}
		//static void method2() {}
	}
	//���� ��� Ŭ���� C
	static class C {
		int a = 10;
		static int c = 20;
		
		public C() {
			System.out.println("�������Ŭ���� C�� ������ ȣ��");
		}
		
		public void method1() {
			System.out.println("�������Ŭ����C�� �޼���1 ȣ��");
		}
		
		public static void method2() {
			System.out.println("�������Ŭ����C�� �����޼���2 ȣ��");
		}
	}
	
	public void method() {
		//����Ŭ���� �ȿ��� ����� static����� ���´�.
		class D{
			int a = 1000;
			public D() {
				System.out.println("����Ŭ���� D�� ������ ȣ��");
			}
			public void lmethod() {
				System.out.println(this.a);
				System.out.println("����Ŭ���� D�� ��� �޼��� ȣ��");
			}
		}
		//����Ŭ������ �޼��� ���ο����� ����� �����ϴ�.
		D d = new D();
		d.lmethod();
	}

}
