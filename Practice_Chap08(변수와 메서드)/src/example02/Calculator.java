package example02;

public class Calculator {
	
	//�ν��Ͻ� �޼���
	//�ν��Ͻ��� Ư¡ : new �����ڷ� �ν��Ͻ��� �����ؾ߸�, ����������.�ν��Ͻ��޼���� ���� ����.
	public int add(int x, int y) {
		int result = x + y;
		//double dresult = Calculator.divide(10.5, 11.7); �ν��Ͻ� �޼��忡�� static �޼��带 ȣ���� �� ������ �� �ݴ�� �Ұ�.
		return result;
	}
	//�ν��Ͻ� �޼���
	public int substract(int x, int y) {
		return x - y;
	}
	
	//static(����)�޼���
	//static�� Ư�� : �ν��Ͻ� ���� ���� Ŭ������.�����޼�������� �ٷ� ���� �����ϴ�.
	public static long multiply(long x, long y ) {
		return x * y;
	}
	//static(����)�޼���
	public static double divide(double x, double y) {
		//static �޼���� �̹� �޸� ��ܿ� �ö��ְ� �ν��Ͻ� �������� ������ �����ؾ��ϴµ�, �Ʒ� �ڵ�� �ν��Ͻ��� �����Ǿ�߸� ��밡���ϱ⿡ ���ܰ� �߻�.
		//this.add(10,5); �ν��Ͻ��� �����ؾ߸� ȣ�� �����ϱ� ������ �Ұ��� �ϴ�.
		return x / y;
	}
	

}
