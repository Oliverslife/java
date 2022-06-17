package example01;

import java.util.Arrays;

public class Student {
	
	int age;
	String name;
	int[] subject;
	
	public Student(int age, String name, int[] subject) {
		this.age = age;
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		//Ÿ�� ��ȯ�� �������� ���θ� �˾ƺ��� ���ؼ� instanceof������ �̿�
		if(obj instanceof Student) {
			Student student = (Student)obj;
			//���� ������ ���ؼ� ���ǹ��� ����, age�� name�� ��� ������ Ȯ���ϴ� ����
			boolean result = Arrays.equals(this.subject, student.subject);
			if((this.age == student.age) && (this.name.equals(student.name)) && result) {
				return true;
			}
		}
		return false;
	}
}
