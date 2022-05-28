package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// ������ Ÿ���� ==, !=�� ���ؼ� ������ �� �ִ�.
		
		//���ͷ��� ��� ���� ���� �ִ���, ���� �޸𸮰���(heap)�� �ִ��� Ȯ���ϰ�, �ִٸ� ���� �ּҸ� �����ϰ� �ǰ�, ���ٸ� ���ο� ���� �ν��Ͻ��� �������ش�.
		String str1 = "IT";
//		String str2 = "JAVA";
		String str2 = "IT";	//������ ���� ���ͷ��� �ִ��� ã�� �����ϴ� ��� �ּҸ� ����
		
		//new �����ڰ� ���� ������ ���ο� �ν��Ͻ��� ������.
		String str3 = new String("IT");	//���� ��������� ������ �ּҸ� �������� ����
		
		//������ Ÿ�Կ��� ���� ==�� �ּҸ� ���ϰ� ����.
		//���� ���ͷ��� ���� ���� ������ ������.
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : " + result);
		
		result = (str1 == str3);
		System.out.println("str1 == str3 : " + result);
		
		//String Ŭ������ equals()�� �ּҿ� ������� ���� ���ٸ� ������ true�� ������.
		result = str1.equals(str3);
		System.out.println("str1.equals(str3) : " + result);
		
		result = str1.equals(str2);
		System.out.println("str1.equals(str2) : " + result);
		

	}

}
