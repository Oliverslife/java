package example01;

public class Student {
	
	int age;
	
	public Student(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		//Ÿ�� ��ȯ�� �������� ���θ� �˾ƺ��� ���ؼ� instanceof������ �̿�
		if(obj instanceof Student) {
			Student student = (Student)obj;
			//���� ������ ���ؼ� ���ǹ��� ����
			if(this.age == student.age) {
				return true;
			}
		}
		return false;
	}
}
