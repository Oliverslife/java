package example01;

public class StudentEx {

	public static void main(String[] args) {
		
		//�⺻������ ȣ��
		Student st = new Student();
		System.out.println(st);
		
		//�Ű������� �ִ� �����ڸ� ȣ��
		Student st2 = new Student("ȫ�浿", 50);
		System.out.println(st2);

		Student st3 = new Student("ȫ�浿");
		System.out.println(st3);
		
		Student st4 = new Student(50);
		System.out.println(st4);
	}

}
