package example01;

public class FieldInitEx {

	public static void main(String[] args) {

		//�ؾ�� ��� �ִ�.
		//��ǰ�� �����ϰ� �ִ�.		
		//new �����ڰ� Ŭ������ �ִ� ������� ����Ʈ ũ�⸸ŭ heap�� �Ҵ��� �ϸ� ���ÿ� �ʱ�ȭ�� �����ִ� ������ �Ѵ�.
		Fieldinit fi = new Fieldinit();
		
		System.out.println(fi.byteField);
		System.out.println(fi.boolField);
		System.out.println(fi.floatField);
		System.out.println(fi.arrField);
		
		
		System.out.println(fi);
		System.out.println(fi.toString());

	}

}
