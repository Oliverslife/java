package example04;

public class Time {
	
	//����������(Access Modifier)�� ����
	//private : ���� Ŭ���� �������� ���� ������.
	//protected : ���� ��Ű��, �ڼ� Ŭ���������� ���� ������.
	//default : ���� ��Ű�������� ���� ������.
	//public : ������ �� ���� ������.
	
	//�ƹ��͵� �Ⱥ��̸� �⺻���� default �����������̳� default��� ����� ��� ��������.
	
	private int hour;	
	private int minute;
	private int second;
	
	//getter()
//	public int getHour() {
//		return this.hour;
//	}
	
	//Source�� -> Generate Getters and Setters -> ���ϴ� ��������� üũ �� �ڵ��ϼ�
	
	//getter() : ��������� ���� �о�� �޼���
	//setter() : ��������� ���� �����ϴ� �޼���
	public int getHour() {
		//return hour;
		return this.hour;
	}
	public void setHour(int hour) {
		//�ÿ� ���� ����ó�� �ڵ带 �ۼ�
		if(hour < 0 || hour > 23) {
			System.out.println("�ð��� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		else {
			this.hour = hour;
		}		
	}
	public int getMinute() {
		//return minute;
		return this.minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		else {
			this.minute = minute;
		}		
	}
	public int getSecond() {
		//return second;
		return this.second;	
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("�ʸ� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		else {
			this.second = second;
		}		
	}	
	
	@Override
	public String toString() {
		return this.getHour() + "�� " + this.getMinute() + "�� " + this.getSecond() + "��";
	}
}
