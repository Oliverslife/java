package example02;

public class SwitchStringEx {
	
	public static void main(String[] args) {
		
		//���ڿ��� �������� �Դ�.
		String str = "����";
		
		switch(str) {
			case "����" :
				System.out.println("450����");
				break;
			case "����" : 
				System.out.println("400����");
			case "����" :
				System.out.println("350����");
			case "�븮" :
				System.out.println("250����");
			case "���" :
				System.out.println("200����");
			default :
				System.out.println("���� �����Դϴ�.");
		}
		
	}

}
