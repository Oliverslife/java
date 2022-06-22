package example01;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		
		//StringBuilder, StringBufferŬ������ ����(�ӽ�����޸Ӹ�)�� �̿��ϱ� ������ ���ο� �ν��Ͻ��� �����Ǵ� ���� �ƴ϶� �ϳ��� �ν��Ͻ��� ������
		//���ڿ��� ������ �� �ִ�.
		StringBuilder sBuilder = new StringBuilder("JAVA");
//		System.out.println(sBuilder.hashCode());
		
		sBuilder.append("Program");
		System.out.println(sBuilder);
//		System.out.println(sBuilder.hashCode());
		
		sBuilder.insert(1, "��");
		System.out.println(sBuilder);
		
		sBuilder.insert(1, "100");
		System.out.println(sBuilder);
		
		sBuilder.setCharAt(0, 'R');
		System.out.println(sBuilder);
		
		sBuilder.reverse();
		System.out.println(sBuilder);
		
		sBuilder.delete(0, 3);
		System.out.println(sBuilder);
		
		int length = sBuilder.length();
		System.out.println("�ѹ��ڼ� : " + length);

	}

}
