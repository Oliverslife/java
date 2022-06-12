package example08;

public class SoundEx {

	public static void main(String[] args) {	
		//�͸�����ü(�̸�����) -- UI�̺�Ʈ ó���� ������ ��ü �������
		Soundable soundable1 = new Soundable() {	//Ÿ��(�ٺ�)�� �������̽�
			//���������� Ŭ�����ϱ� ������� ������ �� ������ �ܺο��� ���� �Ұ�(�ٺ��� �������̽�)
			int a = 10;
			public void method() {
				System.out.println("�͸�����ü �޼���");
			}
			
			@Override
			public void sound() {				
				String str = "����";
				System.out.println("ù ��° �͸�����ü : " + str);
				System.out.println(str + "�� ���� ����ϴ�.");
				System.out.println(str + "�� ���������� ���� �����ϴ�.");	
				this.method();
				System.out.println(this.a);
			}
		};
		
		Soundable soundable2 = new Soundable() {	//Ÿ��(�ٺ�)�� �������̽�
			//���������� Ŭ�����ϱ� ������� ������ �� ������ �ܺο��� ���� �Ұ�(�ٺ��� �������̽�)
			int a = 10;
			public void method() {
				System.out.println("�͸�����ü �޼���");
			}
			
			@Override
			public void sound() {				
				String str = "��׸�";
				System.out.println("ù ��° �͸�����ü : " + str);
				System.out.println(str + "�� ���� ����ϴ�.");
				System.out.println(str + "�� ���������� ���� �����ϴ�.");	
				this.method();
				System.out.println(this.a);
			}
		};
		
		soundable1.sound();
		soundable2.sound();
	}
}
