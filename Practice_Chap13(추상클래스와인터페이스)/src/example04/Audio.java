package example04;

public class Audio implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		//������ 0~10 ���̿����� ������ ������ ���α׷��� ��.
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("Audio ������ �ִ밪�� 10�Դϴ�.");
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			System.out.println("Audio ������ �ּҰ��� 0�Դϴ�.");
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume);
	}
	

}
