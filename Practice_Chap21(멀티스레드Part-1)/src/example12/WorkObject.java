package example12;

//������ü
public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("threadA�� methodA()����");
		notify();	//wait()�� ���� BLOCKED�� �����带 ������ ���·� �����.
		
		try {
			wait();	//������ �ܴ�. �ٸ� �����忡�� notify(), notifyAll() ȣ���ϸ� ���.
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("threadB�� methodB()����");
		notify();	//wait()�� ���� BLOCKED�� �����带 ������ ���·� �����.
		
		try {
			wait();	//������ �ܴ�. �ٸ� �����忡�� notify(), notifyAll() ȣ���ϸ� ���.
		} catch (InterruptedException e) {}
	}


}
