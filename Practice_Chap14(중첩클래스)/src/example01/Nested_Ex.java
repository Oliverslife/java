package example01;

public class Nested_Ex {
	
	//�ν��Ͻ� ��� Ŭ����
	class A {
		int iv = 100;
		//static int cv = 200;	//static��������� ��� �Ұ� Nested_Ex.A.cv ������ �ȵǹǷ�.
		public A() {
			System.out.println("A������ ȣ��");
		}
		public void method1() {
			System.out.println("AŬ������ method1() ȣ��");
		}
		//Nested_Ex.A.method2()�� ȣ���� �� ����.
//		public static void method2() {
//			
//		}
	}
	
	//���� ��� Ŭ����
	static class B {
		
		int iv = 100;
		static int cv = 500; //Nested_Ex.B.cv ���� �����ϱ� ������ ���𤧰���
		public B() {
			System.out.println("B������ ȣ��");
		}
		public void method1() {
			System.out.println("BŬ������ method2() ȣ��");
		}
		public static void method2() {
			System.out.println("BŬ������ method2() ȣ��");
		}
	}

	
	
	
	
	public static void main(String[] args) {
		

	}

}
