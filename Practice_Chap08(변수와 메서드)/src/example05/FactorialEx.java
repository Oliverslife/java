package example05;

public class FactorialEx {

	public static void main(String[] args) {
		
		long result = FactorialEx.factorial(5);
		System.out.println("5!(���丮��)�� �� : " + result);

	}
	
	public static long factorial(int n) {
		
		long result = 0L;
		//n�� 1�϶� ��μ� ���ȣ���� �� �̻� �̷������ �ʴ´�. f(1) = 1 �̴ϱ�.
		if(n==1) {
			result = 1;
		}
		else {
			System.out.println("result�� : " + result + "\tn �� : " + n);
			result = n * factorial(n-1); //���ȣ���� ���������� �̷������ ��.
			System.out.println("result�� : " + result + "\tn �� : " + n);
		}
		
		return result;
	}

}
