package example06;

public class CompareEx {
	
	public static void main(String[] args) {
		
		int result = Compare.compare(100, 200);
		System.out.println(result);
		
		//StringŬ������ NumberŬ������ �ƹ��� ���谡 ����.
		//Compare.compare("ȫ�浿", "��浿");
		
		//NumberŬ������ ObjectŬ������ �ڼ��̱� ������ �Ű����� Ÿ������ �������� �ʴ�.
		//Compare.compare(new Object(), new Object());
		
		result = Compare.compare(new Integer(100), new Double(75.11));
		System.out.println(result);
		
		//Number�� �߻�Ŭ�����̹Ƿ� �ν��Ͻ��� �������� ���Ѵ�.
		//result = Compare.compare(new Number(), new Number());
	}

}
