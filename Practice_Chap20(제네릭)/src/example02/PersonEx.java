package example02;

public class PersonEx {

	public static void main(String[] args) {
		//Person���׸�Ŭ������ T�� String�� �����Բ� ������ �������.
		Person<String> person1 = new Person<>();
		person1.setT("ȫ�浿");
		String str = person1.getT();
		System.out.println(str);
		
		//�������� �������� ����ȭ, Ÿ�� ��ȯ ����, ������ �� ���ܸ� �߻�������
		Person<Integer> person2 = new Person<>();
		//person2.setT(new Integer(100));
		person2.setT(50);	//�ڵ� �ڽ�
		int value = person2.getT();
		System.out.println(value);
		
		Person<Apple> person3 = new Person<>();
		//person2.setT(new Integer(100));
		person3.setT(new Apple());	//�ڵ� �ڽ�
		Apple apple = person3.getT();
		System.out.println(apple);

	}

}
