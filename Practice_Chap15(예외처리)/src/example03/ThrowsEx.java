package example03;

public class ThrowsEx {

	
	public static void main(String[] args) {         //throws Exception {
		//JVM���� ���ܸ� ������.
		//method1();
		
		//main()���� method1() ȣ���ϰ� ������ ���⼭ ����ó���� �ؾ��Ѵ�.
		try {
			method1();
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");			
		}
		
		

	}
	//Throws�� �޼��� ����� ���� �ۼ��� �ϸ�, ȣ���� ������ ���ܸ� �Ǵ�����, ȣ���� ������ ���ܸ� �ݵ�� ó���ؾ� �Ѵ�.
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		System.out.println(10/0); //�������(���࿹��)
	}

}
