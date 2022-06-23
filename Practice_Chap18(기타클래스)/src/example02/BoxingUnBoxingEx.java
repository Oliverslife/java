package example02;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		//�ڽ�(Boxing)�ڵ� --> ��üȭ ��Ŵ
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		//������ �� new Integer(100)�� �ٲ��.
		Integer obj4 = 100;
		
		System.out.println("�ڽ� ��");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		//��ڽ�(UnBoxing)�ڵ� --> �⺻������ �ٲ۴�.
		int value1 = obj1.intValue();
		int value2 = obj2;
		int value3 = obj3;
		int value4 = obj4.intValue();
		
		System.out.println("��ڽ� ��");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		

	}

}
