package example03;

public class SystemEx02 {

	public static void main(String[] args) {
		
		//���α׷��� ������ �׽�Ʈ �� �� ����ϴ� ������ �޼���
		long sum = 0;
		long start = System.currentTimeMillis();	//10�� 3�� ���� 1��
//		long start = System.nanoTime();	//10�� 9�� ���� 1��
		
		for(long i=1; i<10000000; i++) {
			sum += i;
		}
		
//		long end = System.nanoTime();
		long end = System.currentTimeMillis();					
		System.out.println(sum);
//		System.out.println("�ҿ�� �ð� : " + (end-start) + "ms");
		System.out.println("�ҿ�� �ð� : " + ((end-start)/1000.0) + "��");
//		System.out.println("�ҿ�� �ð� : " + (end-start) + "ns");
		
		

	}

}
