package example07;
//������ü
public class Calculator {
	
	private int memory;
	int value = 100;
	
	public int getMomory() {
		return this.memory;
	}
	
	//�񵿱�ȭ �޼��� -> �������� �ŷڼ��� �����ϱ� ���ؼ��� �ݵ�� ����ȭó���� �ʼ���.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		//1�ʰ� �Ͻ�����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.getMomory());
	}
	
	//�񵿱�ȭ �޼����̹Ƿ� � ������� �󸶵��� ������ �����ϴ�.
	public void print() {
		System.out.println(Thread.currentThread().getName() + " value�� : " + this.value);
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
		}
	}
	
	

}
