package example03;

public class MemberEx {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.method();
		member.method1();
		
		//�������̽��� ������ �����̴�. �Ͽ� ������ ������ ����ȴ�.
		
		A a = new Member();	//�������̽� �ʵ��� ������
		a.method();
		//a.method1();	//�ٺ��� ����� ���ϹǷ� MemberŬ������ ����޼���� ȣ��Ұ�

	}

}
