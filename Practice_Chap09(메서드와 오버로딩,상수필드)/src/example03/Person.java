package example03;

public class Person {
	
	//�Һ��� �������
	//�ݵ�� ����� ���ÿ� �ʱ�ȭ�� �̷������ ��. ���뵥���ͷν� ���Ǿ�����. Ŭ�������� �����Ǿ�����.
	static final int MAX_NUMBER = 1000;
	
	//final �ʱ�ȭ ���
	//1.����� ���ÿ� �ʱ�ȭ
	final String nation = "KOREA";	//�������
	//2.�����ڿ��� �� �ѹ� �ʱ�ȭ
	final int age;
	
	public Person(int age) {
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//		return "nation : " + this.nation + ", age : " + this.age;
//	}

}
