package example04;

public class ReferEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		Child child = new Child();
		
		//��������� �ٺ��� ����� ����.
		System.out.println(parent.x);
		System.out.println(child.x);
		
		//����޼���� ���� �����ϰ��ִ� �ν��Ͻ��� ������ ����.
		parent.method();
		child.method();
		
		parent.type(new Child());
		parent.type(new Car());

	}

}
