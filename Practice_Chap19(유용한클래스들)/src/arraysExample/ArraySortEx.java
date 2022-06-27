package arraysExample;

import java.util.Arrays;

//����� ���� Ŭ������ ������ �ϱ� ���ؼ��� Comparable�������̽��� �����ؾ� ��.
class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
//		return this.name.compareTo(o.name);	//������ ��������
//		return o.name.compareTo(this.name);	//����
		return this.age - o.age;	//���̼�
//		return o.age - this.age;	//���� ����
	}
	
}

public class ArraySortEx {

	public static void main(String[] args) {
		
		Person person1 = new Person("ȫ�浿", 29);
		Person person2 = new Person("��浿", 9);
		Person person3 = new Person("���浿", 59);
		Person person4 = new Person("�ֱ浿", 38);
		Person person5 = new Person("��浿", 8);
		
		Person[] persons = { person1, person2, person3, person4, person5 };
		Arrays.sort(persons);
		//�迭�˻�(binarySearch�� �ݵ�� sort�ϰ� �� �ڿ� �ؾ��Ѵ�.)
		int index = Arrays.binarySearch(persons, person1);
		System.out.println("person1�ν��Ͻ��� �ִ� �ε��� : " + index + ", �̸� : " + person1.name);

		System.out.println();
		for(Person person : persons)
			System.out.println("�̸� : " + person.name + ", ���� : " + person.age);
		
		//�⺻�� Ÿ�԰� StringŬ������ �⺻������ �������� ������ �̷������.
		int[] arr = { 55, -10, -9, 0, 100};
		
		Arrays.sort(arr);
		System.out.println("�⺻�� Ÿ�� ���� �� : " + Arrays.toString(arr));
		
		String[] names = new String[] { "�谳��", "ȫ�浿", "������", "�����" };
		Arrays.sort(names);
		System.out.println("String�� Ÿ�� ���� �� : " + Arrays.toString(names));

	}

}
