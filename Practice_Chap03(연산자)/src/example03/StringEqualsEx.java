package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// ������ Ÿ���� ==, !=�� ���ؼ� ������ �� �ִ�.
		
		String str1 = "IT";
//		String str2 = "JAVA";
		String str2 = "IT";	//������ ���� ���ͷ��� �ִ��� ã�� �����ϴ� ��� �ּҸ� ����
		String str3 = new String("IT");
		
		//������ Ÿ�Կ��� ���� ==�� �ּҸ� ���ϰ� ����.
		//���� ���ͷ��� ���� ���� ������ ������.
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : " + result);
		
		result = (str1 == str3);
		System.out.println("str1 == str3 : " + result);
		

	}

}
