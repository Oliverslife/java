package example01;

import java.io.IOException;

public class KeyBoardToString {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		//System.out.println(bytes[99]);
		
		System.out.print("�Է� : ");
		int readBytesNo = 0;
		try {
			//Ű����(ǥ���Է�)���κ��� �Է��� �ް�� ������ bytes�� ������ �ϰ� �Է¹��� ����Ʈ ���� ������.
			readBytesNo = System.in.read(bytes);
			//���ڼ� EUC-KR�� ���ڵ�
			String str = new String(bytes, 0, readBytesNo-2, "EUC-KR");
			
			//String str = new String(bytes, 0, readBytesNo-2, "UTF-8");
			
			System.out.println(str);
			System.out.println("�Է¹��� ����Ʈ �� : " + readBytesNo);
			
			// EUC-KR : �ѱ� 2byte, UTF-8 : 3byte
			byte[] b = str.getBytes("EUC-KR");
			//byte[] b = str.getBytes("UTF-8");
			System.out.println(b.length);
			
			//���ڵ��� ���ڵ��� �������� �ݵ� �ӹ��ڼ��� �����ϰ� �������� ���ڰ� �����ų� �ϴ� ������ ������ �� �ִ�.
			byte[] b2 = "�ȳ��ϼ���".getBytes("UTF-8");
			String str1 = new String(b2, 0, b2.length, "UTF-8");
			//String str1 = new String(b2, 0, b2.length, "EUC-KR");
			System.out.println(str1);
			
			System.out.println(b2.length);
			
		} catch (IOException e) {
			
		}

	}

}
