package example07;

public class Default_StaticEx {

	public static void main(String[] args) {
		
		MyInterface mInterface = new Person();
		mInterface.dmethod();
		mInterface.method();
		
		//�������̽��� �����޼��嵵 ȣ���ϴ� ����� �������̽���.�����޼���� ȣ��
		MyInterface.smethod();

	}

}
