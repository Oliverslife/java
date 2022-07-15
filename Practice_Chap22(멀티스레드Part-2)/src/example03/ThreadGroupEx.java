package example03;

public class ThreadGroupEx {

	public static void main(String[] args) {
		//���� ����ǰ� �ִ� ������ �׷��� ��
		ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup1.getName();		
		//String str = Thread.currentThread().getThreadGroup().getName();
		
		System.out.println(threadGroup1);		
		
		//myGroup�� main�׷��� ���� �׷����� ���������.
		ThreadGroup myGroup = new ThreadGroup("myGroup");		
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[���� ������ �׷��� list()�޼��� ȣ�� �� ��� ����]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//���α׷� ���� �����׷���� ��� ������ ��µ�.
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//myGroup�� ���Ե� workThreadA, workThreadB �����忡 ���ͷ�Ʈ ��û�� >> ������ �׷��� ����ϴ� �ñ��� ����
		
		myGroup.interrupt();
		
		
		

	}

}
