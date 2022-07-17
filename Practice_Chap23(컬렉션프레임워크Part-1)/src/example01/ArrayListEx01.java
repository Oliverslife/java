package example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		//ArrayList�� ���׸� Ÿ���̴�. �׷��� Warning�� ��. -> ���� ���ְ� �ʹٸ� Quick Access(���� �˻�â)���� Error �Է� �� 
		//Preference�� Generics �ǿ� �ִ� �׸񤷸� ��� ignore�� �ٲٸ� �ȴ�.
		
		ArrayList list = new ArrayList();		//�⺻������ 10���� ���� ������.
		System.out.println("�� ũ�� : " + list.size());	//����� ��ü�� �ϳ��� ���� ������ 0�� ������.
		
		//��ü �߰��ϱ�
		list.add("111");	//boolean add(Object o) -> ������ �߰�
		list.add("222");
		list.add("333");
		list.add("444");
		list.add(333);		//list.add(new Integer(333));
		
		System.out.println("�� ũ�� : " + list.size());
		System.out.println("ArrayList�� �ּ� : " + list.hashCode());
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		//0��° �ε����� "333"�߰��ϱ�
		list.add(0, "333");
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		//��ü �����ϱ� -> ������ ��ü�� �ִٸ� �տ������� �˻��Ͽ� �� ���� �����Ѵ�.
		list.remove("333");
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		System.out.println(list.remove("333"));
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		//���嵵�� ��ü�� �ε����� ã�ƿ���(������ -1�� ������.)
		System.out.println("index = " + list.indexOf("333"));
		System.out.println("index = " + list.indexOf(333));
		
		//��ü ���� �����ϱ�
//		list.clear();
		
		//�Ʒ��� ���� �����ϸ� ��ü�� ���´�. ���� ����(�߿�) -> i���� ����������, remove ���� �� ���� ��ܿ����� ����. -> �ڿ������� �����ؾ� ��.
//		for(int i=0; i<list.size(); i++) {
//			list.remove(i);
//			System.out.println("ArrayList�� �ִ� �� : " + list.toString());
//		}
		
		for(int i=list.size()-1; i>=0; i--) {	//list.size()���� index�� �� ���� ���
			list.remove(i);
		}
		
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());

		
		
		

	}

}
