package example03;

public class ReverseEx {

	public static void main(String[] args) {
		
		String str = "�ȳ��ϼ���";
		String reverse = "";
		int count = 0;
		
		String r = reverseString(str);
		System.out.println("resverseString() ȣ�� �� : " + r);
		
		System.out.println("-------------------------");
		
		count = str.length();
		System.out.println("���ڿ� ���� : " + count);
		
		//������
		for(int i=0; i<count; i++) {
			reverse += str.charAt(count - (i+1));
			System.out.println(reverse);
			System.out.println(reverse.hashCode());
		}
		System.out.println("���� ��� : " + reverse);

	}
	
	//�Ź���
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
