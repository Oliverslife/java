package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] ori = new int[] {10, 77, 33, 50};
		int[] target = new int[10];
		int count = 0;
		
		System.out.println("�����ϱ� ��");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		
		//for���� �̿��ؼ� ���� �����ϴ� ���
//		for(int i:ori) {
//			target[count++] = i;
//		}
		
//		for(int i=0; i<ori.length; i++) {
//			target[i] = ori[i];
//		}
		
		System.arraycopy(ori, 0, target, 3, ori.length); // ���� �ӵ��� ���� ������.
		//target = Arrays.copyOf(ori, ori.length); //Arrays�� copyOf�޼���� ������ ����� �迭�� �����ϰ� ���縦 �ع����� �迭���� �޼����̴�.	
		
		System.out.println("������ ��");
		System.out.println("target ���� : " + target.length);
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));

	}

}
