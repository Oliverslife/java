package example08;
//������ü
public class Toilet {
	
	//�÷��� ����
//	private boolean seat; �ǹ̰� ������
	
	//�޼��� ����� �Ͼ��.
	public synchronized void use() throws Exception {
		
		String name = Thread.currentThread().getName();
		
		//�������� ȭ��ǿ� ���� ��
//		if(this.seat == false) {
			System.out.println(name + "��/�� ȭ��ǿ� �����Ͽ����ϴ�.");
			//this.seat = true; synchronized �����ϴ� ��� �� �ڵ�� �ʿ䰡 ��������.
			
			Thread.sleep(1000);
			System.out.println(name + "�� �� : �� �ÿ��ϴ�~~!");
			
			//this.seat = false; ���������� �ǹ̰� ������
			System.out.println(name + "��/�� ȭ��� ����� ���ƽ��ϴ�.");
			System.out.println();
//		}
//		else {	//���������� �ǹ̰� ������
//			System.out.println(name + "��/�� ȭ��� ������Դϴ�. ��ٸ�����!");
//		}		
		
	}
	
	//�񵿱�ȭ �޼���
	public void knock() {
		System.out.println(Thread.currentThread().getName() + " �ȶ�!");
		
	}

}
