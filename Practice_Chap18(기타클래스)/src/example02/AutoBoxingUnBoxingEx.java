package example02;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		
		//�ڵ� �ڽ�
		Integer obj1 = 100;
		Integer obj2 = 300;
		
		List list = new Vector();
		list.add(obj1);
		list.add(obj2);
		list.add(500);	//list.add(new Integer(500))
		System.out.println(list);
		
		int value1 = (Integer)list.get(0);
		System.out.println(value1);
		
		int value2 = obj2.intValue();	//�����ڵ�
		int value3 = obj2;	//�ڵ� ��ڽ�
		System.out.println(value2);
		System.out.println(value3);
		
		//��ü + �⺻Ÿ���� ������������ ����Ŭ�����̱� ������ �����Ϸ��� �˾Ƽ� �ڵ� ��ڽ��ؼ� �Ʒ��� ���� �ڵ尡 �����ϴ�.
		int result = obj1 + 500;
		System.out.println(result);

	}

}
