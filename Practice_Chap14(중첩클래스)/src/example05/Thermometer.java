package example05;

public class Thermometer {
	
	//��ø �������̽� ����
	interface TemperatureChangable {
		public void onChange();
	}
	
	TemperatureChangable changable;

	//�Ű����� Ÿ���� �������̽� Ÿ���� ���Դٴ� ���� ������ �ǹ��ϴ°�? -> TemperatureChangable �������̽��� ������ Ŭ������ ���� �� �ִ�.
	//�������̽� �Ű������� ������.
	public void setChangable(TemperatureChangable changable) {
		this.changable = changable;
	}
	
	public void viewTemperature() {
		this.changable.onChange();
	}
	
	

}
