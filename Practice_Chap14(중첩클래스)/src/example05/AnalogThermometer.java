package example05;

public class AnalogThermometer implements Thermometer.TemperatureChangable {

	int temperature = 100;

	@Override
	public void onChange() {
		System.out.println("�Ƴ��α� �µ����Դϴ�.");
		System.out.println(this.temperature + "�� �Դϴ�.");
		
	}
	
	
}
