package example04;

public class Outside {
	
	//�ʵ� ����
	String str = "Outside-field";
	
	//��� �޼���
	public void method() {
		System.out.println("Outside-method()ȣ��");
	}
	
	class Inner {
		//�ʵ� ����
		String str = "Inner-field";
		//��� �޼���
		public void method() {
			System.out.println("Inner-method() ȣ��");
		}
		
		//��� �޼���
		public void showInfo() {
			//this�� InnerŬ������ this�̴�.
			System.out.println(this.str);
			this.method();
			//�ܺ�Ŭ������ �����ϴ� ���
			System.out.println(Outside.this.str);
			Outside.this.method();
			
		}
	}
	
	public void show() {
		
		System.out.println("-------------------------------");
		//�ܺ�Ŭ���� ���������� this�� �翬�� OutsideŬ������ ���Ѵ�.
		System.out.println(this.str);
		this.method();
		
		//�ܺ�Ŭ�������� ����Ŭ������ ������ �Ϸ��� ������ �ʱ� ������ �Ʒ��� ���� �ν��Ͻ��� �ϳ� �����ؼ� ����鿡�� ������ �Ѵ�.
		Inner in = new Inner();
		//System.out.println(in.str);
		in.showInfo();
	}

}
