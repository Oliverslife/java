package example08;

public class ChildEx {

	public static void main(String[] args) {
		//�͸��ڼհ�ü(�̸�����) -- UI�̺�Ʈ ó���� ������ ��ü ������� (��� ����� �뵵)
		Parent parent = new Parent() {	//�ٺ��� Ŭ����
			
			int b = 10;
			public void method1() {
				System.out.println("�͸��ڼհ�ü �޼���");
			}
			
			@Override
			public void method() {
				int a = 10;
				System.out.println("a : " + a);
				System.out.println(this.b);
				this.method1();
			}
			
		};
		
		parent.method();

	}

}
