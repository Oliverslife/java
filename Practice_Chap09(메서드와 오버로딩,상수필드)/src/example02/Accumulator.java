package example02;

class A {
	int data1 = 10;
	int data2 = 30;
}

public class Accumulator {
	
	//add��� �޼�������� �����ε��ϰ� �ִ�.
	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		return x + y;
	}
	
	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x + y;
	}
	
	public long add(long x, int y) {
		System.out.println("add(long x, int y)");
		return x + y;
	}
	
	public double add(double x, double y) {
		System.out.println("add(double x, double y)");
		return x + y;
	}
	//������ ������ �޾Ƽ� �����ε� �ϴ� ���̽�
	public long add(int[] arr) {
		System.out.println("add(int[] arr)");
		//�迭�� �ּҸ� �޾Ƽ� �� ���� ������ ���Ͽ� �����ϰ� �ִ� �޼���
		long sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	//Ŭ������ �Ű������� �޾Ƽ� �����ε��� �ϴ� ���̽�
	public int add(A a) {
		System.out.println("add(A a)");
		return a.data1 + a.data2;
	}


}
