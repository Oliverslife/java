package example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx_Access {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		add(arrayList);
		add(linkedList);
		
		System.out.println("= ���ٽð� �׽�Ʈ =");
		System.out.println("ArrayList : " + access(arrayList));
		System.out.println("LinkedList : " + access(linkedList));
		

	}
	
	public static void add(List<String> list) {
		for(int i=0; i<100000; i++) {
			list.add(i+"");
		}
	}
	
	public static long access(List<String> list) {
		long start = System.currentTimeMillis();
		
		for(int i=0; i<10000; i++) {
			list.get(i);
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	//���!
	//���ݱ��� ���캻 �������� ���� ���� ���������� �߰�, ����, ������ ArrayList�� ������ ����� �ݸ鿡,
	//�߰��� ����, ������ LinkedList�� Ȯ���ϰ� �����ٴ� ���� �� ���� �ִ�.

}
