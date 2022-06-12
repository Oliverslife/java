package example04;

import java.rmi.Remote;

public class Television implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		//���� 0~10 ������ ������ ����
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("TV ������ �ִ밪�� 10�Դϴ�.");
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			System.out.println("TV ������ �ּҰ��� 0�Դϴ�.");
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("TV�� ���� ���� : " + this.volume);
		
	}
	

}
