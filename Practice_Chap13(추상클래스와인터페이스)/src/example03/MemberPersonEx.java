package example03;

public class MemberPersonEx {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.method();
		member.method1();
		System.out.println(A.MAX);	//��� ���� �� �������̽���.�����
		//�������̽��� ������ �����̴�. �Ͽ� ������ ������ ����ȴ�.
		
		A a = new Member();	//�������̽� �ʵ��� ������
		a.method();
		//a.method1();	//�ٺ��� ����� ���ϹǷ� MemberŬ������ ����޼���� ȣ��Ұ�
		
		System.out.println();
		
		Person person = new Person();
		person.method();
		person.method1();
		
		a = new Person();
		a.method();

	}

}
