package example02;

import java.awt.Toolkit;

public class BeepPrintEx {
	//main()�� JVM�� �����Ѵ�.
	public static void main(String[] args) {
		
		//��Ƽ�����带 ���� �����ϴ� ��� 3����
		//��� 1 --> ������ü ����
		Runnable runnable = new Beep();	//���� ��ü ����
		Thread thread = new Thread(runnable);
		thread.start();
		
		//��� 2 --> �͸�����ü
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					System.out.println("Beep���� �����ϴ� ������� : " + Thread.currentThread().getName());
//					
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {}
//				}				
//			}
//		});
//		thread.start();
		
		//���3 --> ���ٽ�(�Լ��� �������̽�) JDK1.8 �ڵ� ����, ������
//		Thread thread = new Thread( ()-> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for(int i=0; i<5; i++) {
//				System.out.println("Beep���� �����ϴ� ������� : " + Thread.currentThread().getName());
//				
//				toolkit.beep();
//				
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {}
//			}			
//		});
//		thread.start();		
		
		
		for(int i=0; i<5; i++) {
			System.out.println("for���� �����ϴ� ������ �̸� : " + Thread.currentThread().getName());
			System.out.println("Beep!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		//������� �� �� start()�� �� �����ϰ� ���� ������� �ȵǸ�, ������� �ϱ� ���ؼ� �Ʒ��� ���� �ν��Ͻ��� �Ѱ� �� ������ �Ѵ�.(�߿�)
		thread = new Thread(runnable);
		thread.start();
		
		

	}

}
