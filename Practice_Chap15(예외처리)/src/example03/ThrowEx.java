package example03;

public class ThrowEx {

	public static void main(String[] args) {
		
		try {
			//������ ���ܸ� �߻���Ű�� Ű���尡 throw�̴�.
			throw new Exception("���Ƿ� ���� �߻���Ŵ");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���� ����");
		

	}

}
