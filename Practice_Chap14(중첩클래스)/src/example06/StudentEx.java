package example06;

public class StudentEx {

	public static void main(String[] args) {
		
		StudentAnonymous anonymous = new StudentAnonymous();
		anonymous.student1.wake();
		
		anonymous.method1();
		
		//�Ű������� �Ű������� �͸��ڼհ�ü�� ���� �����ؼ� �ѱ�� ����
		anonymous.method2(new Student("�����") {
			
			public void training() {
				System.out.println(this.name + "�� ��� �մϴ�.");
			}
			@Override
			public void wake() {
				System.out.println("-----------------------");
				System.out.println("�Ű������� �ʱⰪ ���·� ������� �͸��ڼհ�ü");
				System.out.println(this.name + "�� �Ͼ�ϴ�.");
				this.training();
				System.out.println("----------------------");
			}
		});

	}

}
