package example01;

import java.awt.Toolkit;

public class BeepPrintEx {
	//main()�� JVM�� �����Ѵ�.
	public static void main(String[] args) {
		//���� ���� ���� ��������� �����.
		//System.out.println(Thread.currentThread().getName());
		
		//Toolkit�� �߻�Ŭ�����ε�, �� �߿� GUI ���õ� �޼����� ������ �ν��Ͻ��� getDefaultToolkit()�� ���ؼ� 
		//ToolkitŬ������ ������ ����.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			System.out.println("for���� �����ϴ� ������ �̸� : " + Thread.currentThread().getName());
			toolkit.beep();	//������ ���
			
			//�����尡 �ʹ� ���� �����ϴϱ� 0.5�ʵ��� �����.
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.println("for���� �����ϴ� ������ �̸� : " + Thread.currentThread().getName());
			System.out.println("Beep!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		//�̱۽����带 ��Ƽ������� �ٲ㼭 ���α׷��� ����� ����!
		
		

	}

}
