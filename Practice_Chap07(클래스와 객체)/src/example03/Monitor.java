package example03;

public class Monitor {
	
	//�������(�ʵ�)
	String color;	//������� ����
	int channel;	//ä��
	int volume;		//����
	boolean power;	//���� on/off
	
	//����޼���
	//Monitor�� �Ѱų� ���� ����� �ϴ� �޼���
	public void power() {	
		
		if(!this.power) {
			System.out.println("����Ͱ� �������ϴ�!");
		}
		else {
			System.out.println("����Ͱ� �������ϴ�!");			
		}
		this.power = !power;
	}
	
	public void channelUp() {
		if(power) {
			this.channel++;
			System.out.println("���� ä�� : " + this.channel);
		}		
	}
	
	public void channelDown() {
		if(power) {
			//this.channel--;
			System.out.println("���� ä�� : " + --this.channel);
		}		
	}
	
	public void volumeUp() {
		if(power) {
			this.volume++;
			System.out.println("���� ���� : " + this.volume);
		}		
	}
	
	public void volumeDown() {
		if(power) {
			//this.volume--;
			System.out.println("���� ���� : " + --this.volume);
		}		
	}
	
	@Override
	public String toString() {		
		return "���� ä�� : " + this.channel + ", " + "���� ���� : " + this.volume;
	}
	
	

}
