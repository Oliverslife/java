package example04;

public class Parent {
	
	int x = 100;
	
	//�Ű������� Ÿ���� Object��� ���� ��� Ŭ������ �� �޾��ְڴٴ� ��.
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;	//���� Ÿ��ĳ����
			System.out.println("����Ŭ������ ��� x�� : " + this.x);
		}
		else {
			System.out.println("��Ӱ��迡 ���� �ʴ� Ŭ�����Դϴ�.");
		}
	}
	
	public void method() {
		System.out.println("����޼ҵ� ȣ��");
	}

}
