package example02;

public class Student {
	
	String name;
	int age;
	
	//ObjectŬ������ toString()�� �������̵�(������)
	@Override
	public String toString() {
		
		//String str = "�̸� : " + this.name + "���� : " + this.age;
		//return str;
		
		//this : Ŭ������ �ּ�(new��� �����ڰ� �ν��Ͻ��� �������ϸ� ��μ� Ȱ��ȭ)
		//this�� static�޼��峪 Ŭ���� �ȿ� ����� �� ����.
		return "�̸� : " + this.name + "\t���� : " + this.age;
	}

}
