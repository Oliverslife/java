package example03;

public class MethodEx {
	
	//�޼����� ����� ����
	//1. ���� Ÿ�� (��ȯ��) : int
	//2. �޼���� 
	//3. () : �Ű�����, ���ڰ�, Arguments
	//�޼��� ����� �߿䵵(98%�̻�), �޼��� ������(���Ǻ�)
	public static int add(int x, int y, int z) {
//		int temp = 0;
//		temp = x + y + z;
//		return temp;
		System.out.println("add �޼��� ȣ���");
		return x + y + z;
	}
	
	public static int minus(int x, int y) {
		System.out.println("minus �޼��� ȣ���");
		return x - y;
	}

	public static void main(String[] args) {

			int num1 = 10;
			int num2 = 30;
			
			//���� ���� ����(Call by value)
			int result = add(num1, num2, 100);
						
			System.out.println("num1 + num2 + 100 : " + result);
			
			result = minus(num1, num2);
			System.out.println("num1 - num2 : " + result);

	}

}
