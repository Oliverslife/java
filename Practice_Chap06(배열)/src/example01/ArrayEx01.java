package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		//score�� ���������̴�. int[]�̴�.
		int[] score = null;
		//�浵 ������ �ʾҴµ�, ���� �����ϰ��ִ�. (��������)
		//score = {100, 29};
		//score�� 5���� ���� heap�� �����ϰ� �ִ�. (20byte)
		score = new int[5];
		
		//�迭���� �� �ּҴ�. []�ȿ� ���� ���ڸ� �ε���(÷��)��� �Ѵ�.
		System.out.println("score�� �ּҰ� : " + score);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		//score[0]�� ������ �����ϴٰ� ���� �ȴ�.
		score[0] = 100;
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		score[0] = 20;		
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println();
		
		//�迭�� ���� ���Խ�Ű�� ����Ѵ�.
		for(int i=0; i<score.length; i++) {
			score[i] = i + 1;
			System.out.println("score[" + i + "] = " + score[i]);
		}
	}

}
