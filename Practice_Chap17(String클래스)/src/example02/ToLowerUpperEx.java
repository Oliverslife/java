package example02;

public class ToLowerUpperEx {

	public static void main(String[] args) {
		
		String str1 = "Java Program";
		String str2 = "JAVA Program";
		
		System.out.println("�빮�� : " + str1.toUpperCase());
		System.out.println("�ҹ��� : " + str1.toLowerCase());
		
		System.out.println(str1.equals(str2));
		
		//��ҹ��ڸ� �������� �ʰ� �񱳸� �ϰ��� �Ѵٸ�, equalsIgnoreCase()�� ����ϸ� �ȴ�.
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
