package example03;

public class Person {
	
	//final �ʱ�ȭ ���
	//1.tjsdjsrhk ehdtldp chrlghk
	final String nation = "KOREA";	//�������
	//2.�����ڿ��� �� �ѹ� �ʱ�ȭ
	final int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "nation : " + this.nation + ", age : " + this.age;
	}

}
