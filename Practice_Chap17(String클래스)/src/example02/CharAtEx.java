package example02;

public class CharAtEx {

	public static void main(String[] args) {
		
		String ssn = "980203-2456871";
		//Ư�����ڸ� �ް��� �� ��
		char gender = ssn.charAt(7);
		
		if(gender == '1' || gender == '3') {
			System.out.println("�����Դϴ�.");
		}
		else if(gender == '2' || gender == '4') {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("����� �ƴմϴ�.");
		}

	}

}
