package example04;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {

		int[] arr = new int[] {10, 20, 30, 40, 50};
		System.out.println("change()�޼��� ȣ�� ���� �� : " + arr[0]);
		System.out.println("main() arr�� �ּҰ� : " + arr);
		change(arr);	//�迭���� �� �ּҴ�.
		System.out.println("change()�޼��� ȣ�� ���� �� : " + arr[0]);

	}
	
	public static void change(int[] arr) {
		arr[0] = 999;
		System.out.println("change()�޼��� ���� �� : " + arr[0]);
		System.out.println("change() arr�� �ּҰ� : " + arr);
		return;
	}

}
