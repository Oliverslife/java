package example01;

public class VarEx {

	public static void main(String[] args) {
		
		char ch = 'A';
		int year = 0;
		int age = 42;
		//�Ʒ� �ڵ忡�� L�� long�� �����ϱ� ���ؼ� ���̻� L or l�� �ٿ���.
		long result = 10L;
		//�Ʒ� �ڵ忡�� F�� float�� �����ϱ� ���ؼ� ���̻� F or f�� �ٿ���.
		float result2 = 10.1F;
		double d = 9.999;		
		//sys�� ġ�� Ctrl+Space�� ������ �ڵ��ϼ� ����� �����.
		//���ڸ����� ���
		System.out.println("ch : " + ch);
		System.out.println("longŸ�� ��� : " + result);
		System.out.println(result2);
		System.out.println(d);
		System.out.println(year + age);
		
		String str = new String("�ڹ�");
		System.out.println(str + "�� �����մϴ�.");
		System.out.println(str.toString());
		
		//����� ���� Ŭ�����̰ų� toString()�����Ǹ� ���� ���� Ŭ������ ���������� ����� �ϰ� �Ǹ� Ŭ����Ÿ��@16����(�ּ�)�� ���´�.
		Object obj1 = new Object();
		System.out.println(obj1 + "�ڹ�");
		

	}

}
