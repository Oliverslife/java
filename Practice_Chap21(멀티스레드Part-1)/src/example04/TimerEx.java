package example04;

import javax.swing.JOptionPane;

public class TimerEx {

	public static void main(String[] args) throws Exception{
		
		Thread thread = new TimerThread();
		thread.start();
		
		String input = JOptionPane.showInputDialog("10�� �ȿ� ���� �Է��Ͻÿ� : ");
		
		//System.out.println(input);
		
		if(input != null) {
			System.out.println("�Է� �� : " + input);
			System.exit(0);
		}
		else {
			Thread.sleep(10000); //10�ʸ� ����Ѵ�.
			System.out.println("�Է����� ���߽��ϴ�. GameOver");
			System.exit(0);
		}		

	}
}
