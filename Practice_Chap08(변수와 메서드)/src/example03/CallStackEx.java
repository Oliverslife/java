package example03;

public class CallStackEx {

	public static void main(String[] args) {
		
		//�ݽ���(LIFO)�� ���Լ����̴�. (ex. �ýñ�� �������� ������) <-> ť(Queue, FIFO, ������)
		
		System.out.println("main()�����");
		
		//static�� static ȣ���� �� �ִ�.
		CallStackEx.first();
		System.out.println("main()�����");	

	}
	
	public static void first() {
		System.out.println("first()�����");
		second(); //���� Ŭ���� ���� �޼����� Ŭ�������� �����ص� �����ϴ�.
		System.out.println("first()�����");
		
	}
	
	public static void second() {
		System.out.println("second()�����");
		CallStackEx.third();
		System.out.println("second()�����");
	}
	
	public static void third() {
		System.out.println("third()�����");
		System.out.println("third()�����");
	}

}
