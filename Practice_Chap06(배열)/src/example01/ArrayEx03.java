package example01;

import java.util.Arrays;

public class ArrayEx03 extends Object {

	public static void main(String[] args) {
		
		//40����Ʈ�� heap�� �����Ǿ���.
		int[] arr1 = new int[10];
		
		//6����Ʈ�� heap�� �����Ǿ���.
		char[] chArr = new char[] {'a', 'b', 'c'};
		
		//arr1�迭�� ������ 10�� �����ϰ� �ִ�.
		for(int i=0; i<arr1.length; i++) {
			//���� : 1~10������ ������ ����
			arr1[i] = (int)(Math.random() * 10)+1;
		}
		
		//�迭�� ������ �������� ���
		for(int i=0; i<arr1.length; i++) {
			if(i == 9) {
				System.out.print(arr1[i]);				
			}
			else {
				System.out.print(arr1[i] + ", ");
			}			
		}
		
		System.out.println();
		//ArraysŬ������ �迭�� �����ϱ� ���� ����� ���� ��ƿ��Ƽ Ŭ����
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.toString(chArr));
		
		//�ּҰ� ���
		//��� ��Ʈ���� ���������� ������, ����������.toString()�� �ڵ�ȣ��ȴ�.
		System.out.println(arr1.toString());	//Ÿ��@16����
		System.out.println(arr1);
		
		//charŸ���� �ּҸ� ����Ϸ��� toString()�� ȣ���ؾ� �Ѵ�.
		System.out.println(chArr.toString());
		System.out.println(chArr);

	}

}
