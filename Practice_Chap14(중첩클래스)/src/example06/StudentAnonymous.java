package example06;

public class StudentAnonymous {
	
	//�ʵ��� �ʱⰪ
	Student student1 = new Student("ȫ�浿") {
		//�͸��ڼհ�ü�� ����޼���
		public void goSchool() {
			System.out.println(this.name + "�� ��մϴ�.");
		}
		@Override
		public void wake() {
			System.out.println("-----------------------");
			System.out.println("�ʵ��� �ʱⰪ ���·� ������� �͸��ڼհ�ü");
			System.out.println(this.name + "�� �Ͼ�ϴ�.");
			this.goSchool();
			System.out.println("----------------------");
		}
	};
	//���ú����� �ʱⰪ ����
	public void method1() {
		Student lStudent = new Student("�迬��") {
			
			public void goSkate() {
				System.out.println(this.name + "�� �����Ϸ� ������Ʈ�忡 ���ϴ�.");
			}
			@Override
			public void wake() {
				System.out.println("-----------------------");
				System.out.println("���ú����� �ʱⰪ ���·� ������� �͸��ڼհ�ü");
				System.out.println(this.name + "�� �Ͼ�ϴ�.");
				this.goSkate();
				System.out.println("----------------------");
			}
		};
		lStudent.wake();
	}
	
	//�޼����� �Ű����� ��
	public void method2(Student student) {
		student.wake();
	}

}
