package example02;

public class MemberEx {
	
//	public static void study() {
//		System.out.println("�ڹ� ���θ� �մϴ�.");
//	}
//	
//	public void m1() {
//		System.out.println("�ν��Ͻ� �޼���");
//	}

	public static void main(String[] args) {

		//static������̹Ƿ� �ν��Ͻ� �������� Ŭ������.������������� ������ �����ϴ�.
		//static�� static�� ȣ���� �����ϴ�.
		Member.smethod();
		Member.cv = 500;
		Member.smethod();
		
		//MemberEx.study();
		
		//�ν��Ͻ� ������� ����ϱ� ���ؼ� �ݵ�� new��� �����ڰ� heap�� �ν��Ͻ��� ������ ����� �����ϴ�.
		Member m = new Member();
		m.imethod();
		m.iv = 999;
		m.imethod();
		
		//MemberEx me = new MemberEx();
		//me.m1();
		
		
		
		

	}

}
