package example01;

public class DaemonEx {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		//daemon����(����, start()ȣ�� ���� ������ �ؾ��Ѵ�.)
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		
		//���ν����尡 5�ʵ��� �����ϸ�, daemon�������� autoSaveThraed�� ����ǰ�, 
		//���ν����尡 ����Ǹ� �� �̻� autoSaveThread�� ������ �ȵȴٴ� ���� �� �� �ִ�. (������ ����)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("���ν����� �����");
		
		

	}

}
