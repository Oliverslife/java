package example02;

public class IndexOfEx {

	public static void main(String[] args) {
		
		//indexOf�޼���� ã�� ����� �� �� ���� ���δ�.(���� ��)
		String str = "������ �ڹ� ���ΰ� �ϱ� �ȳ׿�";
		int index = str.indexOf("����");
		System.out.println("������ ���� �� ��ȣ : " + index);
		
		//���ζ�� ���ڿ��� ���ԵǾ� ������...
		if(str.indexOf("����") != -1) {
			System.out.println("���ο� ���õ� �����̱���!");
		}
		else {
			System.out.println("���ο� ���þ��� �����̱���!");
		}

	}

}
