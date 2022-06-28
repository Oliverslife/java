package tokenExample;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {

	public static void main(String[] args) {
		
		String data = "baby      cat dog a b c d e f g h i j k l m n o p q r s t u v w x y z";
		
		long start = System.nanoTime();		
		//split()�� �����ڸ� �������� �ָ� �����Ͱ� ������ �ټ� �����ϰ� �ִٸ�, ���鵵 �ϳ��� ��ū���� �ν��Ѵ�.
		String[] result = data.split(" ");
		for(String str : result) {
			System.out.println(str);
		}
		
		long end = System.nanoTime();
		System.out.println("�ɸ� �ð� : " + (end-start) + "ns");
//		System.out.println("��ū ���� : " + result.length);
		System.out.println("-------------------");
		
		start = System.nanoTime();
		//StringTokenizer�� ������ ��ū���� �������� �ʴ´�.
		StringTokenizer sTokenizer = new StringTokenizer(data, " ");
		while(sTokenizer.hasMoreElements()) {
//			System.out.println("���� ��ū �� : " + sTokenizer.countTokens()); 
			String str = sTokenizer.nextToken();
			System.out.println(str);			
		}
		end = System.nanoTime();
		System.out.println("�ɸ� �ð� : " + (end-start) + "ns");

	}

}
